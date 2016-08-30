package eu.cloudwave.ude.fcore.plugin.actions.verticalscale;

import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.plugin.actions.AdaptionActionExpression;
import eu.cloudwave.ude.fcore.plugin.exceptions.ExpressionToModelException;
import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;
import eu.cloudwave.ude.fcore.plugin.model.Flavor;
import eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure.FlavorProvider;
import eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure.InfrastructureConfig;
import eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure.UuidToVmNameTranslator;

public class VerticalScaleModelExpression implements AdaptionActionExpression {

	private UuidToVmNameTranslator nameTranslator;
	private FlavorProvider flavorProvider;
	private String target;
	private String scaleValue;
	private String vmName;
	
	
	public VerticalScaleModelExpression(String target, String scaleValue, UuidToVmNameTranslator nameTranslator, FlavorProvider flavorProvider) {
		super();
		this.target = target;
		this.scaleValue = scaleValue;
		this.nameTranslator = nameTranslator;
		this.vmName=nameTranslator.getVmName(target);
		this.flavorProvider=flavorProvider;
	}



	public void interprete(Feature feature) throws ExpressionToModelException {
		if(feature.getName().equalsIgnoreCase(vmName)){
			Flavor flavor=flavorProvider.getFlavor(scaleValue);
			if(flavor!=null){
				for(Attribute attribute:feature.getAttributes()){
					if(attribute.getName().equalsIgnoreCase("cpu")){
						System.out.println("\tSet cpu of vm: "+vmName+" to "+flavor.getCpu());
						attribute.setValue(flavor.getCpu());
					}else if(attribute.getName().equalsIgnoreCase("ram")){
						System.out.println("\tSet ram of vm: "+vmName+" to "+flavor.getRam());
						attribute.setValue(flavor.getRam());
					}
				}
			}else{
				throw new ExpressionToModelException("Flavor could not be found: "+scaleValue);
			}
		}
	}

}
