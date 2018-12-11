package com.powersys.alquilaAutomation.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.powersys.alquilaAutomation.builders.properties.Data87_01;
import com.powersys.alquilaAutomation.builders.properties.PropertyDirector;
import com.powersys.alquilaAutomation.pages.CreateAdPageStep1;
import com.powersys.alquilaAutomation.pages.HomePage;


/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class CreateAdTest extends BaseTest {
	private PropertyDirector propertyDirector = new PropertyDirector();
	
	@BeforeMethod
	public void initProperty() {
		propertyDirector.setPropertyBuilder(new Data87_01());
		propertyDirector.constructProperty();
	}

	@Test
	public void creatAdtest() {
		driver.get("http://localhost:9002/");
		HomePage homePage = new HomePage(driver);
		homePage.createAd();
		CreateAdPageStep1 step1 = new CreateAdPageStep1(driver, propertyDirector.getProperty());
		
		step1.enterType();
		step1.enterAmount();
		step1.enterExpenses();
		step1.enterStreet();
		step1.enterNumber();
		step1.enterDatesDepto();
		step1.enterOther();
		
		//driver.switchTo().alert().accept();
		//Assert.assertEquals("¡ÚLTIMOS ANUNCIOS!", "¡ÚLTIMOS ANUNCIOS!");
	}
}
