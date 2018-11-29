package com.powersys.alquilaAutomation.builders.properties;

import com.powersys.alquilaAutomation.DTOs.PropertyDTO;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public abstract class PropertyBuilder {
	
	protected PropertyDTO property;
	
	public PropertyDTO getProperty() {
		return property;
	}
	
	public void createProperty() {
		this.property= new PropertyDTO();
	}
	
	public abstract void buildProperty();
}
