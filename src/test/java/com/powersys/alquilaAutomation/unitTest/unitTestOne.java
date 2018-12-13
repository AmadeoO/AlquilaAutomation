package com.powersys.alquilaAutomation.unitTest;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.powersys.alquilaAutomation.DTOs.PropertyDTO;

public class unitTestOne {

	private PropertyDTO property = new PropertyDTO();

	HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	@Before
	public void setup() {
		
	  this.property.setImgs(1, "Imagen 1");
	}

	@Test
	public void hashTest() {
		assertEquals("Imagen 1", this.property.getImgs(1));
	}

}
