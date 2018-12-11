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
	
	@FindBy(id="crear_anuncio")
	private WebElement createAd;

	public HomePage(WebDriver driver) {
		super(driver);
		}
	
	public void createAd() {
		this.createAd.click();
	}

}
