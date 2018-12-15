package com.powersys.alquilaAutomation.tests;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.powersys.alquilaAutomation.builders.properties.Data87_01;
import com.powersys.alquilaAutomation.builders.properties.PropertyDirector;
import com.powersys.alquilaAutomation.pages.HomePage;
import com.powersys.alquilaAutomation.pages.Form.CreateAdPageStep1;
import com.powersys.alquilaAutomation.pages.Form.CreateAdPageStep2;
import com.powersys.alquilaAutomation.pages.Form.CreateAdPageStep3;

/**
 * @author Amadeo F. Garcia userGit{AmadeoO} email{amadeo.fgarcia@gmail.com}
 */
public class CreateAdTest87_01 extends BaseTest {
	private PropertyDirector propertyDirector = new PropertyDirector();

	@BeforeMethod
	public void initProperty() {
		propertyDirector.setPropertyBuilder(new Data87_01());
		propertyDirector.constructProperty();
	}

	@Test
	public void creatAdtest87_01() {
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
		step1.nextPage();

		CreateAdPageStep2 step2 = new CreateAdPageStep2(driver, propertyDirector.getProperty());
		step2.enterGuarantor();
		step2.enterClerkship();
		step2.enterContract();
		step2.enterContractExpenses();
		step2.enterInitialDeposit();
		step2.enterMoreInformation();
		step2.enterEnvironment();
		step2.enterToilet();
		step2.enterGarage();
		step2.enterBalcony();
		step2.enterPlayGround();
		step2.enterAditionalInformation();
		step2.nextPage();
		
		CreateAdPageStep3 step3 = new CreateAdPageStep3(driver, propertyDirector.getProperty());
		step3.uploadImages();
		step3.nextPage();
		

		driver.switchTo().alert().accept();
		// Assert.assertEquals("¡ÚLTIMOS ANUNCIOS!", "¡ÚLTIMOS ANUNCIOS!");
	}
}
