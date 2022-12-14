package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportsDemo {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeSuite
	public void reportSetup(){
		
		 htmlReporter=new ExtentHtmlReporter(".\\Reports\\extent.html");
		
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}
	
	@AfterSuite
	public void reportTearDown(){
		extent.flush();
	}

}
