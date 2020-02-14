package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod; ////13/////
import org.testng.annotations.Test;

import com.google.page_login.google_gmailVerification;
import com.google.page_login.google_mailcomposeVerification;

public class google_mailcomposeVerificationTEST extends LoginPage_Google{

	public static google_mailcomposeVerification gmcv_obj;
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		gmcv_obj = new google_mailcomposeVerification();

	}
	
	@Test
	public void gmail_body_Verification()
	{
		Assert.assertEquals(gmcv_obj.composeMail_bodyVerification(), true);
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
}
