package eu.cloudwave.ude.fcore.plugin.model;

import java.util.List;

public class FeatureExpression {
	private String name;
	private boolean active;
	private List<AttributeExpression> attributes;
	
	public FeatureExpression(String name, boolean active, List<AttributeExpression> attributes) {
		super();
		this.name = name;
		this.active = active;
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "FeatureExpression [name=" + name + ", active=" + active + ", attributes=" + attributes + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<AttributeExpression> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<AttributeExpression> attributes) {
		this.attributes = attributes;
	}
	
	
	
	
}
