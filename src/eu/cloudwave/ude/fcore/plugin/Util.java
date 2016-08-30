package eu.cloudwave.ude.fcore.plugin;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.graphiti.mm.MmPackage;

import cloudwave.adaptationengine.AdaptationAction;
import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.FCORE.RootFeature;
import eu.cloudwave.ude.fcore.plugin.exceptions.ExpressionToModelException;
import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;
import eu.cloudwave.ude.fcore.plugin.model.AttributeExpression;
import eu.cloudwave.ude.fcore.plugin.model.FeatureExpression;
import eu.cloudwave.ude.fcore.plugin.provider.config.Config;

public class Util {
	public static List<EObject> getModel(File file){
		 ResourceSet resourceSet = new ResourceSetImpl();
		 resourceSet.getPackageRegistry().put(MmPackage.eNS_URI, MmPackage.eINSTANCE);
         resourceSet.getPackageRegistry().put(FCOREPackage.eNS_URI, FCOREPackage.eINSTANCE);
		 resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		 URI uri=URI.createFileURI(file.getAbsolutePath());
		 
		 Resource r=resourceSet.getResource(uri, true);
		 try {
			r.load(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		r.getContents().remove(0);
		return r.getContents();
	}
	
	public static List<Feature> getFeatures(List<EObject> eobjects){
		List<Feature> list=new LinkedList<Feature>();
		for(EObject eobj:eobjects){
			if(eobj instanceof Feature&&!(eobj instanceof RootFeature)){
				list.add((Feature) eobj);
			}
		}
		return list;
	}
	
	public static void transmittExpressionsToModel(List<EObject> model,ModelExpression... expressions) throws ExpressionToModelException{
		for(EObject eobj:model){
			if(eobj instanceof Feature){
				Feature feature=(Feature) eobj;
				for(ModelExpression expression:expressions){
					expression.interprete(feature);
				}
			}
		}
	}
	
	public static float calcSGValue(Map<String, Float> map){
		float score=0;
		for(float f:map.values()){
			score+=f;
		}
		score*=100;
		return score;
	}
	
	
	public static void sortActions(AdaptationAction[] aactions){
		Arrays.sort(aactions, new Comparator<AdaptationAction>() {

			public int compare(AdaptationAction aa1, AdaptationAction aa2) {
				if(aa1.getScore()>aa2.getScore())return -1;
				if(aa1.getScore()<aa2.getScore())return 1;
				return 0;
			}
		});
	}
	
}
