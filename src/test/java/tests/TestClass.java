package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

public class TestClass extends BaseClass{

	@Test
	public void test1(){
		 logger=extent.createTest("Test 01", "Open Google and Search Automation");
		 logger.log(Status.INFO, "Open Google Page");
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 logger.log(Status.INFO, "Search Automation Keyword");
		
		System.out.println("Test 1 Completed.............");
	}
	
	
	@Test
	public void test2(){
		logger=extent.createTest("Test 02", "Open Google and Search Automation");
		 logger.log(Status.INFO, "Open Google Page");
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 logger.log(Status.INFO, "Search Selenium Keyword");
		
		System.out.println("Test 2 Completed.............");
	}
	
	@Test
	public void test3() throws Exception{
		 logger=extent.createTest("Test 03", "Login Test");
		
		logger.log(Status.INFO, "Access the URL");
		driver.get("http://selenium4testing.com/hms/");
		logger.log(Status.INFO, "URL Opened");
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("admin");
	    logger.log(Status.INFO, "User Name Entered");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("admin");
	    logger.log(Status.INFO, "Password Entered");
	    driver.findElement(By.name("submit")).click();
	    logger.log(Status.INFO, "Clicked on Submit Button");
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Logout")).click();
	    
	    Thread.sleep(3000);
	    logger.log(Status.INFO, "Clicked on Logout Button");
	}
	
}
