package eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;
import eu.cloudwave.ude.fcore.plugin.model.AttributeExpression;
import eu.cloudwave.ude.fcore.plugin.model.FeatureExpression;
import eu.cloudwave.ude.fcore.plugin.model.VM;
import eu.cloudwave.ude.fcore.plugin.provider.config.Config;
import eu.cloudwave.ude.fcore.plugin.provider.config.ConfigModelExpression;

public class InfrastructureConfig implements Config,UuidToVmNameTranslator{
	private List<VM> vmList;

	public InfrastructureConfig(List<VM> vmList) {
		super();
		this.vmList = vmList;
	}

	@Override
	public String toString() {
		return "InfrastructureConfig [vmList=" + vmList + "]";
	}


	public ConfigModelExpression[] getModelExpressions() {
		List<ConfigModelExpression> modelExpressions=new LinkedList<ConfigModelExpression>();
		for(VM vm:vmList)modelExpressions.add(new InfrastructureConfigModelExpression(vm));
		return modelExpressions.toArray(new ConfigModelExpression[modelExpressions.size()]);
	}

	public String getVmName(String uuid) {
		for(VM vm:vmList)if(uuid.equals(vm.getUuid()))return vm.getName();
		return null;
	}

	
	
}
