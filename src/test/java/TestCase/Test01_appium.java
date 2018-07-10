package TestCase;

import org.testng.annotations.Test;

import Appium.Page.Login_page;
import Appium.Test.TestBase;

public class Test01_appium extends TestBase {
 
	@Test
	public void login_appium() throws InterruptedException {
		Login_page login_page = new Login_page(getDriver());
		
		
		login_page.ingreso_login("success@envato.com", "password");
		login_page.click_login();
	}
}
