package Appium.AppiumSelniumStepByStep;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OpenCalCulator2 {
	
   AppiumDriver<MobileElement> driver;
	
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
		driver=new AppiumDriver<MobileElement>(url, dc);
		
	
		System.out.println("Application Started");
		
		MobileElement two=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
		MobileElement plus=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
		MobileElement four=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_04"));
		MobileElement equals=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
		
		two.click();
		plus.click();
		four.click();
		equals.click();
		
		MobileElement result=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc"));
		
		String res=result.getText();
		System.out.println("Result is: "+ res);
		
		System.out.println("Completed ............");
		
		}
		catch(Exception e){
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
