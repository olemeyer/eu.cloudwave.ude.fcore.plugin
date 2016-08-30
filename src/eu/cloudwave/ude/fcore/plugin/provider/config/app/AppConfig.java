package eu.cloudwave.ude.fcore.plugin.provider.config.app;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;
import eu.cloudwave.ude.fcore.plugin.model.FeatureExpression;
import eu.cloudwave.ude.fcore.plugin.provider.config.Config;
import eu.cloudwave.ude.fcore.plugin.provider.config.ConfigModelExpression;

public class AppConfig implements Config {
	private List<FeatureExpression> features;

	public AppConfig(List<FeatureExpression> features) {
		super();
		this.features = features;
	}

	@Override
	public String toString() {
		return "AppConfig [features=" + features + "]";
	}

	public ConfigModelExpression[] getModelExpressions() {
		List<ConfigModelExpression> modelExpressions=new LinkedList<ConfigModelExpression>();
		for(FeatureExpression featureExpression:features)modelExpressions.add(new AppConfigModelExpression(featureExpression));
		return modelExpressions.toArray(new ConfigModelExpression[modelExpressions.size()]);
	}


	
}
