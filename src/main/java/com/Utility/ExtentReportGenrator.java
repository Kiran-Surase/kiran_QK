package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		String ReportPath=System.getProperty("user.dir")+"\\TestReports\\index.html";
	
	
		ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("kiran_QK Report");
		reporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Demo Project");
		extent.setSystemInfo("Module Name", "XYZ");
		extent.setSystemInfo("O.S.", "Windows 10");
		extent.setSystemInfo("QA", "PQR");
		return extent;
		
		
	}

}
