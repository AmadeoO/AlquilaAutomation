package com.powersys.alquilaAutomation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class BaseTest {
	protected WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
		driver= new ChromeDriver();

	}
	/*
	@AfterMethod
	public void tearDown() {
		if(null != driver) {
			driver.quit();
		}
	}
*/
}	
