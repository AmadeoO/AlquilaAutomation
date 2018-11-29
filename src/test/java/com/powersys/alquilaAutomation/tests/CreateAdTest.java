/**
 *
 */
package com.powersys.alquilaAutomation.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.powersys.alquilaAutomation.DTOs.PropertyDTO;
import com.powersys.alquilaAutomation.builders.properties.DeptoStudentBuilder;
import com.powersys.alquilaAutomation.builders.properties.PropertyBuilder;
import com.powersys.alquilaAutomation.builders.properties.PropertyDirector;
import com.powersys.alquilaAutomation.pages.CreateAdPage;
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
		propertyDirector.setPropertyBuilder(new DeptoStudentBuilder());
		propertyDirector.constructProperty();


	}

	@Test
	public void creatAdtest() {
		driver.get("http://localhost:9000/");
		HomePage homePage = new HomePage(driver);
		homePage.crearAnuncio();
		CreateAdPage createAdPage = new CreateAdPage(driver, propertyDirector.getProperty());

		createAdPage.enterDescription();
		createAdPage.enterCalle();
		createAdPage.enterAltura();
		createAdPage.enterDepartamento();
		createAdPage.enterPiso();
		createAdPage.enterOtrosDetalles();
		createAdPage.selectDeptoOrHouse();
		createAdPage.selectRooms();
		createAdPage.enterMonto();
		createAdPage.selectExpensas();
		createAdPage.upImage();
		createAdPage.clickSubmit(); 
		driver.switchTo().alert().accept();
		Assert.assertEquals("¡ÚLTIMOS ANUNCIOS!", "¡ÚLTIMOS ANUNCIOS!");
	}
}
