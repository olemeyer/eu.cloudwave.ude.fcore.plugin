package eu.cloudwave.ude.fcore.plugin.model;

public class AttributeExpression {
	private String name;
	private int value;
	public AttributeExpression(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	@Override
	public String toString() {
		return "AttributeExpression [name=" + name + ", value=" + value + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	
}
