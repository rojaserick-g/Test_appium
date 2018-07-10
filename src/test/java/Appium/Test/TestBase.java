package Appium.Test;

import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	private RemoteWebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeTest
	public void setUp() throws Exception{
		//Setup Appium
			
		  URL url = new URL ("http://127.0.0.1:4723/wd/hub");
		  URLConnection urlConnection = url.openConnection();
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("platformName", "Android");
		  capabilities.setCapability("deviceName", "Example2-5554");
		  capabilities.setCapability("app", "C:\\Users\\exerojg\\Downloads\\AUT.apk");
		  driver = new RemoteWebDriver(urlConnection.getURL(), capabilities);                             
	}
	@AfterTest
	public void teardown(){
	    //Teardown operation
	    driver.quit();
	}
}
