/**
 * 
 */
package com.powersys.alquilaAutomation.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.powersys.alquilaAutomation.DTOs.PropertyDTO;
import com.powersys.alquilaAutomation.pages.HomePage;
import com.powersys.alquilaAutomation.pages.Form.CreateAdPageStep1;
import com.powersys.alquilaAutomation.pages.Form.CreateAdPageStep2;

/**
 * @author Amadeo F. García nameGit{AmadeoO} emailGit{amadeo.fgarcia@gmail.com}
 */
public class CreatAdTest87_03a extends BaseTest {

	private PropertyDTO property = new PropertyDTO();

	@BeforeMethod
	public void initProperty() {
		this.property.setType("casa");
		this.property.setAmount(4000);
		this.property.setExpenses(false);
		this.property.setStreet("Bonaparte");
		this.property.setNumber("S/N");
	}

	@Test
	public void creatAdtest87_03a() {
		driver.get("http://localhost:9002/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage homePage = new HomePage(driver);
		homePage.createAd();
		CreateAdPageStep1 step1 = new CreateAdPageStep1(driver, this.property);
		step1.enterType();
		step1.enterExpenses();
		step1.nextPage();
		driver.switchTo().alert().accept();// FIRST ATTEMPT

		step1.enterAmount();
		step1.nextPage();
		driver.switchTo().alert().accept();// SECOND ATTEMPT;
		step1.enterStreet();
		step1.nextPage();
		driver.switchTo().alert().accept();// THIRD ATTEMPT
		step1.enterNumber();
		step1.nextPage();
		CreateAdPageStep2 step2 = new CreateAdPageStep2(driver, this.property);
		Assert.assertEquals("INFORMACIÓN LEGAL", step2.getTitle());
		
	}
}
