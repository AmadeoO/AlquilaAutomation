/**
 * 
 */
package com.powersys.alquilaAutomation.pages.Form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.powersys.alquilaAutomation.DTOs.PropertyDTO;
import com.powersys.alquilaAutomation.pages.BasePage;

/**
 * @author Amadeo F. García
 * nameGit{AmadeoO}
 * emailGit{amadeo.fgarcia@gmail.com}
 */
public class CreateAdPageStep2 extends BasePage {
	private PropertyDTO property;
	
	//LEGAL INFORMATION
	@FindBy(xpath="/html//input[@id='gsi']")
	private WebElement guarantor;
	@FindBy(xpath="/html//input[@id='esi']")
	private WebElement clerkship;
	@FindBy(xpath="/html//input[@id='csi']")
	private WebElement contract;
	@FindBy(xpath="/html//input[@id='gcsi']")
	private WebElement contractExpenses;
	@FindBy(xpath="/html//input[@id='dsi']")
	private WebElement initalDeposit;
	@FindBy(xpath="/html//input[@id='gastosc']")
	private WebElement amountContractExpenses;
	@FindBy(xpath="/html//input[@id='deposito']")
	private WebElement amountInitialDposit;
	@FindBy(xpath="/html//textarea[@id='aditionalLegInfo']")
	private WebElement moreInformation;
	
	//PROPERTY DETAIL
	//ambientes
	@FindBy(xpath="//div[@id='detalles']/div[1]/div/input[@name='option2']")
	private WebElement buttonEnvironment;
	@FindBy(xpath="//div[@id='detalles']/div[1]/div/label[1]/span[@class='title']")
	private WebElement monoambeinte;
	@FindBy(xpath="//div[@id='detalles']/div[1]/div/label[2]/span[@class='title']")
	private WebElement oneEnvironment;
	@FindBy(xpath="//div[@id='detalles']/div[1]/div/label[3]/span[@class='title']")
	private WebElement twoEnvironment;
	@FindBy(xpath="//div[@id='detalles']/div[1]/div/label[4]/span[@class='title']")
	private WebElement threeEnvironment;
	@FindBy(xpath="//div[@id='detalles']/div[1]/div/label[3]/span[@class='title']")
	private WebElement fourOrMore;
	//---------------------
	@FindBy(xpath="/html//input[@id='bsi']")
	private WebElement toilet;
	@FindBy(xpath="/html//input[@id='grsi']")
	private WebElement garage;
	@FindBy(xpath="/html//input[@id='lsi']")
	private WebElement balcony;
	@FindBy(xpath="/html//input[@id='psi']")
	private WebElement playground;
	@FindBy(xpath="/html//textarea[@id='descripcion']")
	private WebElement aditionalInformation;
	
	//BUTTONS
	@FindBy(id="prevBtn")
	private WebElement backButton;
	@FindBy(id="nextBtn")
	private WebElement nextButton;
	@FindBy(id="cancelar")
	private WebElement cancelButton;
	
	
	
	
	
	public CreateAdPageStep2(WebDriver driver) {
		super(driver);
		
	}

	public CreateAdPageStep2(WebDriver driver, PropertyDTO property2) {
		super(driver);
		this.property=property2;
	}

	public void enterGuarantor() {
		if (this.property.isGuarantor()) {
			this.guarantor.click();
		}
	}
	
	public void enterClerkship() {
		if (this.property.isClerkship()) {
			this.clerkship.click();
		}
	}
	
	public void enterContract() {
		if (this.property.isContract()) {
			this.contract.click();
		}
	}
	
	public void enterContractExpenses() {
		if (this.property.isContratExpenses()) {
			this.contractExpenses.click();
			this.amountContractExpenses.sendKeys(this.property.getAmountContractExpenses().toString());
		}
	}
	
	public void enterInitialDeposit() {
		if (this.property.isInitialDeposit()) {
			this.initalDeposit.click();
			this.amountInitialDposit.sendKeys(this.property.getAmountInitialDeposit().toString());
		}
	}
	
	public void enterMoreInformation() {
		if(this.property.getMoreInformation()!=null) {
			this.moreInformation.sendKeys(this.property.getMoreInformation());
		}
	}
	
	public void enterEnvironment() {
		this.buttonEnvironment.click();
		if (this.property.getEnvironments().equals("1")) {
			this.monoambeinte.click();
		}
		if (this.property.getEnvironments().equals("2")) {
			this.twoEnvironment.click();
		}
		if (this.property.getEnvironments().equals("3")) {
			this.threeEnvironment.click();
		}
		if (this.property.getEnvironments().equals("4")) {
			this.fourOrMore.click();
		}		
	}
	
	public void enterToilet() {
		if(this.property.isToilet()) {
			this.toilet.click();
		}
	}
	
	public void enterGarage() {
		if(this.property.isGarage()) {
			this.garage.click();
		}
	}
	
	public void enterBalcony() {
		if(this.property.isBalcony()) {
			this.balcony.click();
		}
	}
	
	public void enterPlayGround() {
		if(this.property.isPlayground()) {
			this.playground.click();
		}
	}
	
	public void enterAditionalInformation() {
		
		if(this.property.getAditionalInformation()!=null) {
				this.moreInformation.sendKeys(this.property.getAditionalInformation());
		}
		
	}
	
	public void backPage() {
		this.backButton.click();
	}
	
	public void nextPage() {
		this.nextButton.click();
	}
	
	public void cancelPage() {
		this.cancelButton.click();
	}
	
}
