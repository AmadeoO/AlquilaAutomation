package com.powersys.alquilaAutomation.builders.properties;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class DeptoStudentBuilder extends PropertyBuilder {

	@Override
	public void buildProperty() {
		property.setAmount(5000);
		property.setDepartment("B");
		property.setDescription(" Departamento ideal para estudiante en zona universitaria, tiene a dos cuadras un 24hs, y a una cuadra una farmacia. Terraza y balcón muy cómodo, se admiten animales =)");
		property.setFloor("2");
		property.setNumber("358");
		property.setOther("comedor, 2 baños, cochera");
		property.setRooms("3");
		property.setStreet("Colon");
		property.setType("Departamento");
		property.setImage("");
	}

}
