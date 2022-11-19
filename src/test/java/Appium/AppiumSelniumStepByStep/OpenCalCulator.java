package Appium.AppiumSelniumStepByStep;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OpenCalCulator {
	
   
	//AndroidDriver driver;
	
	@Test
	public void openCalCulatorExample() throws Exception{
		try{
			
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability("deviceName", "Vishal");
		dc.setCapability("udid", "52101beebed614eb");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.0");
		
		dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		dc.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		Thread.sleep(5000);
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver<MobileElement> driver=new AppiumDriver<MobileElement>(url, dc);
		
	
		System.out.println("Application Started");
		}
		catch(Exception e){
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
