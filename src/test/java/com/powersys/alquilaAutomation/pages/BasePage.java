/**
 * 
 */
package com.powersys.alquilaAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class BasePage {
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
