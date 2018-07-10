package Appium.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Appium.Test.TestBase;

public class Login_page extends TestBase {
	public Login_page(WebDriver driver) {
		getDriver();
	    PageFactory.initElements(driver, this);
	  }

	@FindBy(id = "com.example.mkim.aut:id/email")
	private WebElement ingreso_email;
	@FindBy(id = "com.example.mkim.aut:id/password")
	private WebElement ingreso_clave;
	@FindBy(id = "com.example.mkim.aut:id/email_sign_in_button")
	private WebElement btn_Ingresar;
	
	public String ingreso_login (String email, String clave) {
		String msg = "OK";
		if(ingreso_email.isDisplayed()) {
			ingreso_email.isSelected();
			ingreso_email.clear();
			ingreso_email.sendKeys(email);
		}
		if(ingreso_clave.isDisplayed()) {
			ingreso_clave.isSelected();
			ingreso_clave.clear();
			ingreso_clave.sendKeys(clave);
		}
		
		return msg;
	}
	public void click_login () throws InterruptedException {
		btn_Ingresar.click();
		Thread.sleep(3000);
	}
}
