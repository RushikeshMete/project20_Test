package com.loginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1 extends BaseClass{

	//WebDriver driver;
	@Test
	public void VerifyLogin() throws Exception {
		System.out.println("JImmy112@gmail.com");
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		String Emaildata=excel.getStringData_Excel("login", 0, 0);
		String Passdata=excel.getStringData_Excel("login", 0, 1);
		
		Library.custom_Sendkeys(login.getTxt_Email(), Emaildata);
		Library.custom_Sendkeys(login.getTxt_password(), Passdata);
		Library.custom_Click(login.getBtn_login()); // element not found in that case we create reusable code in library class
		 
	
		// DropDownHandle
		//Library.handle_DropDown(null, null);
		
		// Actions Class 
		//Library.handle_Rightclick(driver, null);
		//Library.handle_Doubleclick(driver, null);
		
		// TakesScreenshot
		//Library.Capture_Screenshot(driver);
		
		//
		String location=System.getProperty("user.dir");
		System.out.println(location);
		/*login.getTxt_Email().sendKeys("jimmy123@gmail.com");
		login.getTxt_password().sendKeys("jimmy");
		login.getBtn_login().click(); */                // 
		
		
		/*String ActualTitle=driver.getTitle();
		String ExpectedTitle="Facebook";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);*/
		
		
	}
}
