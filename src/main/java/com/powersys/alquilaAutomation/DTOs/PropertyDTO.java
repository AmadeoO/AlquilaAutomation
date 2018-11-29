package com.powersys.alquilaAutomation.DTOs;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class PropertyDTO {
	private String description;
	private String street;
	private String number;
	private String department;
	private String floor;
	private String other;
	private String type;
	private String rooms;
	private Integer amount;
	private String image;
	
	
	
	public PropertyDTO() {
		super();
	}

	public PropertyDTO(String description, String street, String number, String department, String floor, String other,
			String type, String rooms, Integer amount, String image) {
		super();
		this.description = description;
		this.street = street;
		this.number = number;
		this.department = department;
		this.floor = floor;
		this.other = other;
		this.type = type;
		this.rooms = rooms;
		this.amount = amount;
		this.image=image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
	
	
	
	

}
