package com.Framework.Concentrix;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	private static ExtentReports extent;

	public static ExtentReports createInstance() {
		String fileName = getReportName();
		String directory = System.getProperty("user.dir")+"/reports/";
		//new File(directory).mkdirs();
		String path =  directory + fileName ;
		
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter(path);
		htmlReporter.config().setEncoding("utf-8");
		
		
		htmlReporter.config().setDocumentTitle("Conc Report");
		htmlReporter.config().setReportName("Test 1 Report");
		htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
	
		extent.setSystemInfo("Hostname","Local-Host");
		extent.setSystemInfo("OS","Windows" );
		extent.setSystemInfo("Engineer Name ", "Himanshu");
		extent.attachReporter(htmlReporter);
		
		return extent;

}
	
	public static String getReportName() {
		Date d = new Date();
		String fileName = "Automation Report_"+d.toString().replace(":", "_").replace(" ", "_")+".html"	;	
		
		return fileName;
	}
	
}
