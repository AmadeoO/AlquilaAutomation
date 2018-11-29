package com.powersys.alquilaAutomation.builders.properties;

import com.powersys.alquilaAutomation.DTOs.PropertyDTO;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class PropertyDirector {
	
	private PropertyBuilder propertyBuilder;
	
	public void constructProperty() {
		propertyBuilder.createProperty();
		propertyBuilder.buildProperty();
		
	}

	public PropertyDTO getProperty() {
		return propertyBuilder.getProperty();
	}

	public void setPropertyBuilder(PropertyBuilder propertyBuilder) {
		this.propertyBuilder = propertyBuilder;
	}
	
	
}
