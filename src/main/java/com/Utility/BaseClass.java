package com.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ConfigDataProvider config;
	
	@BeforeSuite
	public void initialization() throws IOException {
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(config.getBaseUrl());
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		//driver.close();
	}
}
