package com.powersys.alquilaAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.powersys.alquilaAutomation.DTOs.PropertyDTO;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class CreateAdPageStep1 extends BasePage {
	
	private PropertyDTO property;
	
	//TYPE
	@FindBy(xpath="//div[@id='btns']/label[.='DEPARTAMENTO']")
	private WebElement tDepartment;
	@FindBy(xpath="//div[@id='btns']/label[.='CASA']")
	private WebElement tHouse;
	
	//RENTAL
	@FindBy(id="monto")
	private WebElement rAmount;
	@FindBy(xpath="//div[@id='alquilercontainer']/div//label[1]")
	private WebElement rWithOutExpenses;
	@FindBy(xpath="//div[@id='alquilercontainer']/div//label[2]")
	private WebElement rWithExpenses;
	@FindBy(id="expenses")
	private WebElement rAmountExpenses;
	
	//ADDRESS
	@FindBy(id="inp1")
	private WebElement aStreet;
	@FindBy(id="inp2")
	private WebElement aNumber;
	@FindBy(id="departamento")
	private WebElement aDepartment;
	@FindBy(id="piso")
	private WebElement aFloor;
	@FindBy(id="diretext")
	private WebElement aOther;
	
	//Next
	@FindBy(id="nextBtn")
	private WebElement nextButton;
	
	
	public CreateAdPageStep1(WebDriver driver, PropertyDTO property) {
		super(driver);
		this.property=property;
	}
	
	public void enterType() {
		if(this.property.getType().equals("casa")) {
			this.tHouse.click();
		}
		if(this.property.getType().equals("departamento")) {
			this.tDepartment.click();
		}
	}
	
	public void enterAmount() {
		this.rAmount.sendKeys(this.property.getAmount().toString());
	}
	
	public void enterExpenses() {
		if(this.property.isExpenses()) {
			this.rWithExpenses.click();
			this.rAmountExpenses.sendKeys(this.property.getAmountExpenses().toString());
		}else {this.rWithOutExpenses.click();}
	}
	
	public void enterStreet() {
		this.aStreet.sendKeys(this.property.getStreet());
	}
	public void enterNumber() {
		this.aNumber.sendKeys(this.property.getNumber());
	}
	public void enterDatesDepto() {
		if(this.property.getType().equals("departamento")) {
			this.aDepartment.sendKeys(this.property.getDepartment());
			this.aFloor.sendKeys(this.property.getFloor());
		}
	}
	public void enterOther() {
		if(!this.property.getOther().equals(null)) {
			this.aOther.sendKeys(this.property.getOther());
		}
	}
	
	
	
}
