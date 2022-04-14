package com.Framework.Concentrix;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Framework.Concentrix.OR.HomeOR;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase1 {
	public static String path = "D:\\Users\\XY59005\\chromedriver.exe";
	public static String url = "https://www.flipkart.com/";
	
	public static WebDriver driver;
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
    int temp=0;	

	
	@BeforeTest
public void setUP() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", path);
		   driver = new ChromeDriver();
		
		  // driver  = new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		//  WebDriverWait wait = new WebDriverWait(driver,10);
		  Thread.sleep(5000);
		  String title = driver.getTitle();
		  
		  System.out.println(title);
	}
  @Test
  public void LoginTest() throws InterruptedException {
	 
	
	  HomeOR hr=new HomeOR(driver);
	  hr.setUsername("himanshusj10@gmail.com");
	
	  hr.setPassword("Hsj1234@");
	  hr.clickLogin();
	  hr.clickCross();
	  
	  Thread.sleep(5000);
	  
	  driver.quit();
	 
	 
	
  }
  @Test
  public void  demo1() {
		
	  System.out.println("Hi "+temp);
	  temp= temp +2;
	  Assert.assertEquals("Apple", true);
	  
  }
  @Test
  public void  demo2() {
		
	  System.out.println("Hi "+temp);
	  temp= temp +2;
  }
  
  @Test(dependsOnMethods="demo1")
  public void  demo4() {
		
	  System.out.println("Hi "+temp);
	  temp= temp +2;
  }
  @Test
  public void  demo3() {
		
	  System.out.println("Hi "+temp);
	  temp= temp +2;
  }
  
  
}
