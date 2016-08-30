package eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure.openstack;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.openstack4j.api.OSClient;
import org.openstack4j.model.compute.Flavor;
import org.openstack4j.model.compute.Server;
import org.openstack4j.model.heat.Stack;
import org.openstack4j.openstack.OSFactory;

import com.google.gson.Gson;

import eu.cloudwave.ude.fcore.plugin.model.VM;
import eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure.InfrastructurConfigProvider;
import eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure.InfrastructureConfig;


public class OpenStackInfrastructureConfigProvider implements InfrastructurConfigProvider {
	
	private OSClient osClient=null;
	private String url, tenantName, username, password;
	
	
	public OpenStackInfrastructureConfigProvider(String url, String tenantName, String username, String password) {
		this.url=url;
		this.tenantName=tenantName;
		this.username=username;
		this.password=password;
	}


	public InfrastructureConfig getConfig() {
		

		if(osClient==null)osClient=OSFactory.builder()
				.endpoint(url)
				.credentials(username, password).tenantName(tenantName)
				.authenticate();
		
		List<VM> vmList=new LinkedList<VM>();
		List<? extends Server> servers=osClient.compute().servers().list();
		for(Server s:servers){
			if(s.getName().split("-").length==3){
				//getUuid() return null -> use getId() instead 
				vmList.add(new VM(s.getName().split("-")[1],s.getId(),
						new eu.cloudwave.ude.fcore.plugin.model.Flavor(s.getFlavor().getVcpus(), s.getFlavor().getRam()),
						s.getStatus()==Server.Status.ACTIVE));
			}
		}
		
		return new InfrastructureConfig(vmList);
	}


	public eu.cloudwave.ude.fcore.plugin.model.Flavor getFlavor(String name) {
		List<? extends Flavor> flavors=osClient.compute().flavors().list();
		for(Flavor f:flavors){
			if(f.getName().equalsIgnoreCase(name))return new eu.cloudwave.ude.fcore.plugin.model.Flavor(f.getVcpus(), f.getRam());
		}
		return null;
	}



	

}
