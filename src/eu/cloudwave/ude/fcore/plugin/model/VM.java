package eu.cloudwave.ude.fcore.plugin.model;

public class VM {
	private String name;
	private String uuid;
	private Flavor flavor;
	private boolean active;
	
	public VM(String name, String uuid, Flavor flavor, boolean active) {
		super();
		this.name = name;
		this.flavor=flavor;
		this.uuid=uuid;
		this.active=active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	
	
}
