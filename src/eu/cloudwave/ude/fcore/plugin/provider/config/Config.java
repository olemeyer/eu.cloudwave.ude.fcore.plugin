package eu.cloudwave.ude.fcore.plugin.provider.config;

import java.util.List;
import java.util.Map;

import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;
import eu.cloudwave.ude.fcore.plugin.model.FeatureExpression;

public interface Config {
	ConfigModelExpression[] getModelExpressions();
}
