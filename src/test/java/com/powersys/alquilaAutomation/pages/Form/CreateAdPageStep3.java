package com.powersys.alquilaAutomation.pages.Form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.powersys.alquilaAutomation.DTOs.PropertyDTO;
import com.powersys.alquilaAutomation.pages.BasePage;

/**
 * @author Amadeo F. García nameGit{AmadeoO} emailGit{amadeo.fgarcia@gmail.com}
 */
public class CreateAdPageStep3 extends BasePage {
	private PropertyDTO property;

	// IMAGES
	@FindBy(xpath = "//form[@id='form']/div[3]/div[@class='wrapper']//input[@name='image']")
	private WebElement image1;
	@FindBy(xpath = "//form[@id='form']/div[3]/div[@class='wrapper']//input[@name='image2']")
	private WebElement image2;
	@FindBy(xpath = "//form[@id='form']/div[3]/div[@class='wrapper']//input[@name='image3']")
	private WebElement image3;
	@FindBy(xpath = "//form[@id='form']/div[3]/div[@class='wrapper']//input[@name='image4']")
	private WebElement image4;
	@FindBy(xpath = "//form[@id='form']/div[3]/div[@class='wrapper']//input[@name='image5']")
	private WebElement image5;

	// BUTTONS
	@FindBy(id = "prevBtn")
	private WebElement backButton;
	@FindBy(id = "nextBtn")
	private WebElement nextButton;
	@FindBy(id = "cancelar")
	private WebElement cancelButton;

	public CreateAdPageStep3(WebDriver driver, PropertyDTO property) {
		super(driver);
		this.property = property;
		super.wait.until(ExpectedConditions.visibilityOf(nextButton));

	}
	
	public void uploadImages() {
		this.image1.sendKeys(this.property.getImgs(1));
		this.image2.sendKeys(this.property.getImgs(2));
		this.image3.sendKeys(this.property.getImgs(3));
		this.image4.sendKeys(this.property.getImgs(4));
		this.image5.sendKeys(this.property.getImgs(5));
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
