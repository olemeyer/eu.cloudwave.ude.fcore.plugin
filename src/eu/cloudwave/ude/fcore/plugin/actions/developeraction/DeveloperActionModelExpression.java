package eu.cloudwave.ude.fcore.plugin.actions.developeraction;

import java.util.List;

import org.json.JSONObject;

import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.plugin.actions.AdaptionActionExpression;
import eu.cloudwave.ude.fcore.plugin.exceptions.ExpressionToModelException;
import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;

public class DeveloperActionModelExpression implements AdaptionActionExpression {
	
	private String json;
	private JSONObject jsonObject;

	public DeveloperActionModelExpression(String json) {
		super();
		this.json = json;
		jsonObject=new JSONObject(json);
	}



	public void interprete(Feature feature) throws ExpressionToModelException {
		if(jsonObject.has(feature.getName())){
			if(jsonObject.getBoolean(feature.getName())){
				System.out.println("Activate feature: "+feature.getName());
				feature.setSelected(true);
			}else{
				System.out.println("Deactivate feature: "+feature.getName());
				feature.setSelected(false);
			}
		}
		
	}

}
