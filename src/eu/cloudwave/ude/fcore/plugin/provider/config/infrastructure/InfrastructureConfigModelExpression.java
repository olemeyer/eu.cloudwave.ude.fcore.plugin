package eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure;

import java.util.List;
import java.util.logging.Logger;

import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.plugin.mapper.expression.ModelExpression;
import eu.cloudwave.ude.fcore.plugin.model.VM;
import eu.cloudwave.ude.fcore.plugin.provider.config.ConfigModelExpression;

public class InfrastructureConfigModelExpression implements ConfigModelExpression {
	
	private VM vm;
	
	public InfrastructureConfigModelExpression(VM vm) {
		this.vm=vm;
	}

	public void interprete(Feature feature) {
		if(vm.getName().equalsIgnoreCase(feature.getName())){
			if(vm.isActive()){
				feature.setSelected(true);
				System.out.println("\tVM: "+vm.getName()+"["+vm.getUuid()+"] is running");
			}else{
				feature.setSelected(false);
				System.out.println("\tVM: "+vm.getName()+"["+vm.getUuid()+"] is NOT running");
			}
			
			for(Attribute attribute:feature.getAttributes()){
				if("cpu".equalsIgnoreCase(attribute.getName())){
					attribute.setValue(vm.getFlavor().getCpu());
					System.out.println("\t\tVM: "+vm.getName()+" cpu="+vm.getFlavor().getCpu());
				}
				if("ram".equalsIgnoreCase(attribute.getName())){
					attribute.setValue(vm.getFlavor().getRam());
					System.out.println("\t\tVM: "+vm.getName()+" ram="+vm.getFlavor().getRam());
				}
			}
		}
	}

}
