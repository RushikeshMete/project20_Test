package com.loginTest;

import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Library;

public class Test2  extends BaseClass{

	@Test
	public void verifyLodinTest_2() throws Exception {
		
		Library.custom_Sendkeys(null, null);
		Library.Capture_Screenshot(driver);
		
		excel.getStringData_Excel("login", 0, 0);
		
		
	}
	
}
