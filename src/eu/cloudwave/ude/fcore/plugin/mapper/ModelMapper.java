package eu.cloudwave.ude.fcore.plugin.mapper;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.plugin.exceptions.ExpressionToModelException;
import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;

public class ModelMapper<T extends ModelExpression> {

public void transmittExpressionToModel(List<EObject> model, T ...expressions) throws ExpressionToModelException{
	for(EObject eobj:model){
		if(eobj instanceof Feature){
			Feature feature=(Feature) eobj;
			for(T expression:expressions){
				expression.interprete(feature);
			}
		}
	}
}
	
}
