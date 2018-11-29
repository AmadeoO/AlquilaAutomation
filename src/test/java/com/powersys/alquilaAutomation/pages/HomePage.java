package com.powersys.alquilaAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class HomePage extends BasePage {
	
	@FindBy(xpath="/html//div[@id='navbar']//a[@href='/property/add']")
	private WebElement crearAnuncio;

	public HomePage(WebDriver driver) {
		super(driver);
		}
	
	public void crearAnuncio() {
		this.crearAnuncio.click();
	}

}
