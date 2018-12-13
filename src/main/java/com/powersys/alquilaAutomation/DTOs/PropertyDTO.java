package com.powersys.alquilaAutomation.DTOs;

import java.util.HashMap;
import java.util.List;



/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class PropertyDTO {

	private String type;
	private Integer amount;
	private boolean expenses;
	private Integer amountExpenses;
	private String street;
	private String number;
	private String department;
	private String floor;
	private String other;
	private boolean guarantor;
	private boolean clerkship;//ESCRIBANÍA
	private boolean contract;
	private boolean contratExpenses;
	private boolean initialDeposit;
	private Integer amountContractExpenses;
	private Integer amountInitialDeposit;
	private String aditionalInformation;
	private String environments;
	private boolean toilet;
	private boolean garage;
	private boolean balcony;
	private boolean playground;//PATIO
	private String moreInformation;
	private HashMap<Integer,String> imgs;

	
	public PropertyDTO() {
		super();
		this.imgs = new HashMap<Integer, String>();
	}
	
	public void setImgs(Integer key, String value) {
		this.imgs.put(key, value);
	}
	
	public String getImgs(Integer key) {
		return this.imgs.get(key);
	}
	
	public boolean isInitialDeposit() {
		return initialDeposit;
	}



	public void setInitialDeposit(boolean initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public boolean isContratExpenses() {
		return contratExpenses;
	}



	public void setContratExpenses(boolean contratExpenses) {
		this.contratExpenses = contratExpenses;
	}



	public String getAditionalInformation() {
		return aditionalInformation;
	}



	public void setAditionalInformation(String aditionalInformation) {
		this.aditionalInformation = aditionalInformation;
	}



	public Integer getAmountExpenses() {
		return amountExpenses;
	}



	public void setAmountExpenses(Integer expensesAmount) {
		this.amountExpenses = expensesAmount;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public Integer getAmount() {
		return amount;
	}



	public void setAmount(Integer amount) {
		this.amount = amount;
	}



	public boolean isExpenses() {
		return expenses;
	}



	public void setExpenses(boolean expenses) {
		this.expenses = expenses;
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



	public boolean isGuarantor() {
		return guarantor;
	}



	public void setGuarantor(boolean guarantor) {
		this.guarantor = guarantor;
	}



	public boolean isClerkship() {
		return clerkship;
	}



	public void setClerkship(boolean clerkship) {
		this.clerkship = clerkship;
	}



	public boolean isContract() {
		return contract;
	}



	public void setContract(boolean contract) {
		this.contract = contract;
	}



	public Integer getAmountContractExpenses() {
		return amountContractExpenses;
	}



	public void setAmountContractExpenses(Integer amountContractExpenses) {
		this.amountContractExpenses = amountContractExpenses;
	}



	public Integer getAmountInitialDeposit() {
		return amountInitialDeposit;
	}



	public void setAmountInitialDeposit(Integer amountInitialDeposit) {
		this.amountInitialDeposit = amountInitialDeposit;
	}
	
	public String getEnvironments() {
		return environments;
	}



	public void setEnvironments(String environments) {
		this.environments = environments;
	}



	public boolean isToilet() {
		return toilet;
	}



	public void setToilet(boolean toilet) {
		this.toilet = toilet;
	}



	public boolean isGarage() {
		return garage;
	}



	public void setGarage(boolean garage) {
		this.garage = garage;
	}



	public boolean isBalcony() {
		return balcony;
	}



	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}



	public boolean isPlayground() {
		return playground;
	}



	public void setPlayground(boolean playground) {
		this.playground = playground;
	}


	
	public String getMoreInformation() {
		return moreInformation;
	}



	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}


	
	
	

	
	

}
