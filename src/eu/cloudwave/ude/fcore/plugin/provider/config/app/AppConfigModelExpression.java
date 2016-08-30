package eu.cloudwave.ude.fcore.plugin.provider.config.app;

import java.util.logging.Logger;

import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;
import eu.cloudwave.ude.fcore.plugin.model.AttributeExpression;
import eu.cloudwave.ude.fcore.plugin.model.FeatureExpression;
import eu.cloudwave.ude.fcore.plugin.provider.config.ConfigModelExpression;

public class AppConfigModelExpression implements ConfigModelExpression {
	
	private FeatureExpression featureExpression;
	
	public AppConfigModelExpression(FeatureExpression featureExpression) {
		this.featureExpression=featureExpression;
	}

	public void interprete(Feature feature) {
		if(featureExpression.getName().equals(feature.getName())){
			Logger.getGlobal().fine("Feature "+feature.getName()+" is active");
			feature.setSelected(featureExpression.isActive());
		}
		for(AttributeExpression attributeExpression:featureExpression.getAttributes()){
			for(Attribute attribute:feature.getAttributes()){
				if(attributeExpression.getName().equals(attribute.getName())){
					attribute.setValue(attributeExpression.getValue());
					Logger.getGlobal().fine("\tFeature "+feature.getName()+": Attribute "+attribute.getName()+" value="+attributeExpression.getValue());
				}
			}
		}
	}

}
