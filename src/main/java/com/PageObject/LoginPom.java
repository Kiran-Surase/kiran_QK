package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement txt_Email;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement txt_Password;
	
	@FindBy(how=How.XPATH,using="//button[@id=\"u_0_5_/Q\"]")
	private WebElement btn_login;
	
	
	public WebElement getTxt_Email() {
		return txt_Email;
	}

	public WebElement getTxt_Password() {
		return txt_Password;
	}

	public WebElement getBtn_login() {
		return btn_login;
	}

}
