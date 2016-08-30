package eu.cloudwave.ude.fcore.plugin.model;

public class Flavor {
	
	private int cpu;
	private int ram;
	
	public Flavor(int cpu, int ram) {
		super();
		this.cpu = cpu;
		this.ram = ram;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
	

}
