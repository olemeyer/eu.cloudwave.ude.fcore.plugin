package eu.cloudwave.ude.fcore.plugin;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;


import cloudwave.adaptationengine.AdaptationAction;
import cloudwave.adaptationengine.AdaptationEnginePlugin;
import cloudwave.adaptationengine.CloudWaveEvent;
import cloudwave.adaptationengine.Compute;
import cloudwave.adaptationengine.Logger;
import cloudwave.adaptationengine.Metrics;
import cloudwave.adaptationengine.Orchestration;
import eu.cloudwave.ude.fcore.adaptationvalidation.Validation;
import eu.cloudwave.ude.fcore.plugin.actions.AdaptionActionExpression;
import eu.cloudwave.ude.fcore.plugin.actions.developeraction.DeveloperActionModelExpression;
import eu.cloudwave.ude.fcore.plugin.actions.horizontalscale.HorizontalScaleModelExpression;
import eu.cloudwave.ude.fcore.plugin.actions.verticalscale.VerticalScaleModelExpression;
import eu.cloudwave.ude.fcore.plugin.exceptions.ExpressionToModelException;
import eu.cloudwave.ude.fcore.plugin.mapper.AdaptionActionMapper;
import eu.cloudwave.ude.fcore.plugin.mapper.ConfigurationMapper;
import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;
import eu.cloudwave.ude.fcore.plugin.provider.config.app.AppConfig;
import eu.cloudwave.ude.fcore.plugin.provider.config.app.AppConfigProvider;
import eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure.InfrastructurConfigProvider;
import eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure.InfrastructureConfig;
import eu.cloudwave.ude.fcore.plugin.provider.model.ModelProvider;
import io.github.lukehutch.fastclasspathscanner.FastClasspathScanner;

public class FcorePlugin implements AdaptationEnginePlugin {
	
	private ModelProvider modelProvider;
	private AppConfigProvider appConfigProvider;
	private InfrastructurConfigProvider infrastructurConfigProvider;
	
	private ConfigurationMapper configurationMapper=new ConfigurationMapper();
	private AdaptionActionMapper adaptionActionMapper=new AdaptionActionMapper();
	
	public FcorePlugin() {
		System.out.println("Instantiate Fcore Plugin");
		ConfigClasses configClasses=new ConfigClasses();
		new FastClasspathScanner().matchClassesWithAnnotation(FcoreConfig.class, 
				(c)->{
					if(AppConfigProvider.class.isAssignableFrom(c)){
						System.out.println("AppConfigProvider: "+c);
						configClasses.appConfigProviderClass=(Class<AppConfigProvider>) c;
					}else if(InfrastructurConfigProvider.class.isAssignableFrom(c)){
						System.out.println("InfrastructureConfigProvider: "+c);
						configClasses.infraConfigProviderClass=(Class<InfrastructurConfigProvider>) c;
						
					}else if(ModelProvider.class.isAssignableFrom(c)){
						System.out.println("ModelProvider: "+c);
						configClasses.modelProviderClass=(Class<ModelProvider>) c;
					}
				}).scan();

		try{
			modelProvider=configClasses.modelProviderClass.newInstance();
			appConfigProvider=configClasses.appConfigProviderClass.newInstance();
			infrastructurConfigProvider=configClasses.infraConfigProviderClass.newInstance();
		}catch(Exception e){
			throw new RuntimeException("Fcore Plugin instantiation failed!", e);
		}
		
		System.out.println("Fcore Plugin was successfull instantiated");
	}
	
	public AdaptationAction[] run(CloudWaveEvent cloudWaveEvent, AdaptationAction[] adaptationActions, Metrics metrics, Compute compute,
			Orchestration orchestration, Logger logger) {
			
		//########GET CONFIGS#######//
		InfrastructureConfig infraConfig=infrastructurConfigProvider.getConfig();
		AppConfig appConfig=appConfigProvider.getConfig();
		
		List<EObject> infraModel=Util.getModel(modelProvider.getInfraModelFile());
		List<EObject> appModel=Util.getModel(modelProvider.getAppModelFile());
		
		
		
		for (AdaptationAction aa : adaptationActions) {
			
			try {
				System.out.println("######################Check AdaptionAction "+aa+"######################");
				System.out.println("Configure model matching the running system");
				//Configure model matching the shaping of the running system
				configurationMapper.transmittExpressionToModel(infraModel, infraConfig.getModelExpressions());
				configurationMapper.transmittExpressionToModel(appModel, appConfig.getModelExpressions());
				
				boolean considered=true;
				System.out.println("Type of action is: "+aa.getType());
				switch (aa.getType()) {
				case DeveloperAction:
					System.out.println("Transmit action to model");
					AdaptionActionExpression dev_modelexpression=new DeveloperActionModelExpression(aa.getScaleValue());
					adaptionActionMapper.transmittExpressionToModel(appModel, dev_modelexpression);
					break;
					
				case VerticalScaleAction:
					System.out.println("Transmit action to model");
					AdaptionActionExpression vs_expression=new VerticalScaleModelExpression(aa.getTarget(), aa.getScaleValue(), infraConfig, infrastructurConfigProvider);
					adaptionActionMapper.transmittExpressionToModel(infraModel, vs_expression);
					break;
					
				case HorizontalScaleAction:
					System.out.println("Transmit action to model");
					AdaptionActionExpression hs_expression=new HorizontalScaleModelExpression(aa.getTarget(), aa.getScaleValue(),infraConfig);
					adaptionActionMapper.transmittExpressionToModel(infraModel, hs_expression);
					break;

				default:
					considered=false;
					break;
				}
				
				if(considered){
					System.out.println("Calculate values for the softgoals");
					aa.setScore((int) (Validation.getSoftgoalValue(infraModel, appModel)*100));
				}else{
					System.out.println("Action is NOT considered");
					aa.setScore(0);
				}
				
			} catch (ExpressionToModelException e) {
				e.printStackTrace();
				System.out.println("ACTION IS INVALID");
				//The action is invalid
				aa.setScore(-1);
			} catch (Exception e){
				e.printStackTrace();
				System.out.println("UNABLE TO MAKE A STATEMENT");
				//No statement possible
				aa.setScore(0);
				
			}
			
		
			
			// DeveloperAction: .scaleValue = JSON Object mit Key:Val (Key = Feature, Val = 0/1 bei Feature, n bei Attribut)
			// VerticalScaling: .target = UUID (um vm1 im baum zu finden), .scaleValue = "m1"/"s1"/small/etc.
			// HorizontalScaling: (nix, da kA welche PM), .target UUID welche PM an/aus soll? oder neue PM einschalten? .scaleValue = 0/1?
			// .score: -1 für ungültig statt aus der Liste zu löschen, ansonsten .score = goal * 100
			// dann nach score sortieren bzw. goal
		}
		
		System.out.println("############RESULT############");
		Util.sortActions(adaptationActions);
		for(AdaptationAction aaction:adaptationActions){
			System.out.println("Score: "+aaction.getScore()+"\tType: "+aaction.getType()+" Action: "+aaction.getScaleValue()+" Object: "+aaction);
		}
		
		return adaptationActions;
	}
	
	class ConfigClasses{
		public Class<ModelProvider> modelProviderClass;
		public Class<AppConfigProvider> appConfigProviderClass;
		public Class<InfrastructurConfigProvider> infraConfigProviderClass;
	}

}
