package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class loginToFacebook extends BaseClass{
  @Test
  public void test() throws Exception{  
	  
	  Library.capture_Screenshot(driver);
	  LoginPom login=PageFactory.initElements(driver, LoginPom.class);
	  String email=excel.getStringData_Excel("Sheet1", 0, 0);
	  Library.custom_SendKeys(login.getTxt_Email(), email, "email");
	  String pass=excel.getStringData_Excel("Sheet1", 0, 1);
	  Library.custom_SendKeys(login.getTxt_Password(), pass, "pass");
	  Library.custom_Click(login.getBtn_login(), "btn_login");
	  
	  
  }
}
