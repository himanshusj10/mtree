package com.Framework.Concentrix;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Listeners extends TestListenerAdapter{
	
	private static ExtentReports extent = ExtentManager.createInstance();
	private static ThreadLocal <ExtentTest> extentTest= new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult tr) {
		System.out.println("Test started !");
		ExtentTest test=extent.createTest(tr.getClass().getName()+"::"+tr.getMethod().getMethodName());
		extentTest.set(test);
	}
	
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test successfully executed  !");
		String logText="<b>Test Method"+tr.getMethod().getMethodName()+"Successfull </b>";
		Markup m = MarkupHelper.createLabel(logText,ExtentColor.GREEN);
		extentTest.get().log(Status.PASS, m);
		extent.flush();
		}
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test failed !");
		String logText="<b>Test Method"+tr.getMethod().getMethodName()+"Failed </b>";
		Markup m = MarkupHelper.createLabel(logText,ExtentColor.RED);
		extentTest.get().log(Status.FAIL, m);
		extent.flush();
	}
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test skipped !");
		String logText="<b>Test Method"+tr.getMethod().getMethodName()+"Skipped </b>";
		Markup m = MarkupHelper.createLabel(logText,ExtentColor.GREY);
		extentTest.get().log(Status.SKIP, m);
		extent.flush();
	}
	public void onTestFinish(ITestContext tr ) {
		System.out.println("Test finished !");
		extent.flush();
		
	}
	
}
