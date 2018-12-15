/**
 * 
 */
package com.powersys.alquilaAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;
	public BasePage(WebDriver driver) {
		this.driver=driver;
		this.wait=  new WebDriverWait(driver, 10);
		
		PageFactory.initElements(driver, this);
		
	}

}
