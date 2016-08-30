package eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure;

import java.util.List;

import org.openstack4j.model.compute.Flavor;
import org.openstack4j.model.heat.Stack;

import eu.cloudwave.ude.fcore.plugin.model.VM;
import eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure.openstack.OpenStackInfrastructureConfigProvider;

public interface InfrastructurConfigProvider extends FlavorProvider{
	
	InfrastructureConfig getConfig();
}
