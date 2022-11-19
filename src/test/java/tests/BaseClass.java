package tests;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass extends ExtentReportsDemo {
	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup(){
		try{
         DesiredCapabilities dc=new DesiredCapabilities();
		
        /*dc.setCapability("platformName", "Android");
		dc.setCapability(CapabilityType.PLATFORM_NAME, "Android");*/
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Vishal");
		dc.setCapability(MobileCapabilityType.UDID, "52101beebed614eb");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//dc.setCapability(MobileCapabilityType.APP, "");
		dc.setCapability("chromedriverExecutable", "D:\\Workspaces\\AppiumWorkSpace\\AppiumSelniumStepByStep\\drivers\\chromedriver.exe");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "CHROME");
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url, dc);
		//driver=new AndroidDriver<MobileElement>(url, dc);
		//driver=new IOSDriver<MobileElement>(url, dc);
		
	
		System.out.println("Application Started");
		}
		catch(Exception e){
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@AfterTest
	public void tearDown(){
		
		driver.quit();
	}
}
