package com.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;

	 // Sendkeys actions on Element 
	public static void custom_SendKeys(WebElement element,String value,String fieldname) {
		try {
		   element.sendKeys(value);
		   test.log(Status.PASS, fieldname+"==Value succefully Send=="+value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}
	
	//Click on Element 
	public static void custom_Click(WebElement element,String Fieldname) {
	
		try {
		element.click();
		test.log(Status.PASS, Fieldname+"==clicked succefully ");
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}	
	}
	
	//Drop Down Handle
	public static void handle_DropDown(WebElement element,String text) {
		
		try {
		Select select=new Select(element);
		select.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	//Double click
	public static void handle_Doubleclick(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
	    act.doubleClick(element).build().perform();
	    
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// Right click
	public static void handle_Rightclick(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
	    act.contextClick(element).build().perform();
	    
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void capture_Screenshot(WebDriver driver) throws Exception {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn =new File(System.getProperty("user.dir")+"\\Test.png");
		FileUtils.copyFile(src, destn);
		
	}
	
	public static WebDriverWait ExplictWait(WebDriver driver,long time) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		return wait;
		
		
	}
	
}
