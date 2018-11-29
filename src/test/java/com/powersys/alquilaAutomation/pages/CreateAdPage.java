package com.powersys.alquilaAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.powersys.alquilaAutomation.DTOs.PropertyDTO;

/**
 * @author Amadeo F. Garcia
 * userGit{AmadeoO}
 * email{amadeo.fgarcia@gmail.com}
 */
public class CreateAdPage extends BasePage {
	
	private PropertyDTO property;
	
	@FindBy(id="ingresartexto")
	private WebElement textDescription;
	@FindBy(name="calle")
	private WebElement textCalle;
	@FindBy(name="altura")
	private WebElement textAltura;
	@FindBy(name="departamento")
	private WebElement textDepartamento;
	@FindBy(name="piso")
	private WebElement textPiso;
	@FindBy(id="otrosDetalles")
	private WebElement textOtrosDetalles;
	@FindBy(id="departamento")
	private WebElement buttonDepto;
	@FindBy(id="casa")
	private WebElement buttonCasa;
	@FindBy(xpath="//form[@action='/cargarInmueble']/div[@class='firstContainer']/div[@class='secondgridContainer']/div[@class='habContainer']/label[3]")//ver como implementarlo de forma general
	private WebElement buttonRadioRooms;
	@FindBy(id="monto")
	private WebElement textMonto;
	@FindBy(id="btnSinExpensas")
	private WebElement btnSinExpensas;
	@FindBy(id="BtnPublicar")
	private WebElement submitPublicar;
	@FindBy(id="imageUpload")
	private WebElement image;
	
	public CreateAdPage(WebDriver driver, PropertyDTO property) {
		super(driver);
		this.property=property;
	}
	
	public void enterDescription() {
		this.textDescription.sendKeys(this.property.getDescription());
	}
	
	public void enterCalle() {
		this.textCalle.sendKeys(this.property.getStreet());
	}
	public void enterAltura() {
		this.textAltura.sendKeys(this.property.getNumber());
	}
	public void enterDepartamento() {
		this.textDepartamento.sendKeys(this.property.getDepartment());
	}
	public void enterPiso() {
		this.textPiso.sendKeys(this.property.getFloor());
	}
	public void enterOtrosDetalles() {
		this.textOtrosDetalles.sendKeys(this.property.getOther());
	}
	public void selectDeptoOrHouse() {
		if(this.property.getType().equals("Departamento")) {
			this.buttonDepto.click();
		}
		if(this.property.getType().equals("Casa")) {
			this.buttonCasa.click();
		}
	}
	public void selectRooms() {
		this.buttonRadioRooms.click();
	}
	public void enterMonto() {
		this.textMonto.sendKeys(this.property.getAmount().toString());
	}
	public void selectExpensas() {
		this.btnSinExpensas.click();
	}
	public void clickSubmit() {
		this.submitPublicar.click();
	}
	
	public void upImage() {
		this.image.sendKeys("/home/rat/Imágenes/huracan.png");
	}
	
	
}
