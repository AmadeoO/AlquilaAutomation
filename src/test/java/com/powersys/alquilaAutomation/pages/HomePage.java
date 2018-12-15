package com.powersys.alquilaAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class HomePage extends BasePage {
	
	@FindBy(xpath="/html//a[@name='btnC']/div[@class='btn_container']/span[@class='btn_crear']")
	private WebElement createAd;
	
	public HomePage(WebDriver driver) {
		super(driver);
		super.wait.until(ExpectedConditions.visibilityOf(this.createAd));
		
		}
	
	public void createAd() {
		this.createAd.click();
	}

}
