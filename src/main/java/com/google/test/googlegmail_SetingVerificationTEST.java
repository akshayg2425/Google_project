package com.google.test;

import org.testng.Assert; ////17///
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.google_mailcomposeVerification;
import com.google.page_login.googlegmail_SetingVerification;

public class googlegmail_SetingVerificationTEST extends LoginPage_Google {

	
	public static googlegmail_SetingVerification gmsv_obj;
	
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		gmsv_obj = new googlegmail_SetingVerification();

	}
	
	@Test
	public void gmail_body_Verification()
	{
		Assert.assertEquals(gmsv_obj.gmailSettingPage(), true);
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
}
