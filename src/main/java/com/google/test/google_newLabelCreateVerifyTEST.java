package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.google_newLabelCreateVerify;
import com.google.page_login.googlegmail_SetingVerification;

public class google_newLabelCreateVerifyTEST extends LoginPage_Google {
	public static google_newLabelCreateVerify gnlcv_obj;
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		gnlcv_obj = new google_newLabelCreateVerify();

	}
	
	@Test
	public void gmail_body_Verification() throws InterruptedException
	{
		Assert.assertEquals(gnlcv_obj.VerifyLabelCreate(), true);
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
