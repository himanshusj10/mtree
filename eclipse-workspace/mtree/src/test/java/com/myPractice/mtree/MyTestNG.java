package com.myPractice.mtree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class MyTestNG {
	
	public static WebDriver driver ;
	public static String path = "D:\\Users\\XY59005\\chromedriver.exe";
	public static String path1 = "D:\\Users\\XY59005\\Desktop\\msedgedriver.exe";;
	//Implementing Extent reports
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	
	@BeforeTest
	public void setExtent() {
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
	htmlReporter.config().setDocumentTitle("MTREE Report");
	htmlReporter.config().setReportName("Test 1 Report");
	htmlReporter.config().setTheme(Theme.DARK);
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Hostname","Local-Host");
	extent.setSystemInfo("OS","Windows" );
	extent.setSystemInfo("Engineer Name ", "Himanshu");
	
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
  @Test
  @Parameters("browser")
  public void test1 (String browser) {
	  test = extent.createTest("Test1 Cross-Browser");
	  
	  if (browser.equals("Chrome")){
	  System.setProperty("webdriver.chrome.driver", path);
	  driver = new ChromeDriver();
	  }
	  if(browser.equals("Edge")){
	  System.setProperty("webdriver.edge.driver", path1);
	  driver = new EdgeDriver();
	  }
	  driver.navigate().to("https://www.amazon.in/");
	  String myUrl = driver.getCurrentUrl();
	  System.out.println(myUrl);
	  driver.quit();
	  test.log(Status.PASS, "Passed");
	  
	   }
 

@DataProvider(name="dp")
public Object [][] demDP(){
	Object [][] key = new Object[1][2];
	key[0][0]="chrome has started";
	key[0][1]="edge has started";
	
	return key;
	
}

@Test(dataProvider="dp")
void test2(String key, String key1) {
	test = extent.createTest("DP Test2 ");
	System.out.println(key1);
	System.out.println(key);
	test.log(Status.FAIL, "Failed to test ");
	 test.log(Status.PASS, "Passed");
	 test.log(Status.PASS, "Passed");
	 test.log(Status.PASS, "Passed");
	 test.log(Status.PASS, "Passed");
}
}
