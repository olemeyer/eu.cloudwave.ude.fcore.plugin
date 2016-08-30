package eu.cloudwave.ude.fcore.plugin.mapper.expression;

import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.plugin.exceptions.ExpressionToModelException;

public interface ModelExpression {
	void interprete(Feature feature) throws ExpressionToModelException;
}
