package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.google_outputVerification;

public class google_outputVerificationTEST extends LoginPage_Google {

	public static google_outputVerification gov_obj;
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		gov_obj = new google_outputVerification();

	}
	
	
	@Test
	public void firstinput_verifytest()
	{
		Assert.assertEquals(gov_obj.inputverify(), true);
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
