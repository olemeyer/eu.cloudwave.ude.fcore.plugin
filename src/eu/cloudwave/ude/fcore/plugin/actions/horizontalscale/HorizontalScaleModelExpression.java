package eu.cloudwave.ude.fcore.plugin.actions.horizontalscale;

import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.plugin.actions.AdaptionActionExpression;
import eu.cloudwave.ude.fcore.plugin.exceptions.ExpressionToModelException;
import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;
import eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure.UuidToVmNameTranslator;

public class HorizontalScaleModelExpression implements AdaptionActionExpression{
	
	private UuidToVmNameTranslator nameTranslator;
	private String target;
	private String scaleValue;
	private String vmName;
	

	public HorizontalScaleModelExpression(String target, String scaleValue,UuidToVmNameTranslator nameTranslator) {
		super();
		this.nameTranslator = nameTranslator;
		this.target = target;
		this.scaleValue = scaleValue;
		vmName=nameTranslator.getVmName(target);
	}



	public void interprete(Feature feature) throws ExpressionToModelException {
		if(feature.getName().equalsIgnoreCase(vmName)){
			if("on".equalsIgnoreCase(scaleValue)){
				System.out.println("Turn vm: "+vmName+" ON");
				feature.setSelected(true);
			}else if("off".equalsIgnoreCase(scaleValue)){
				System.out.println("Turn vm: "+vmName+" OFF");
				feature.setSelected(true);
			}else{
				throw new ExpressionToModelException("Invalid scaleValue: "+scaleValue);
			}
		}
	}

}
