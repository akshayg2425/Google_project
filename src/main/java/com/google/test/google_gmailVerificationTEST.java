package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.google_gmailVerification;
import com.google.page_login.google_pageSiginOperations;

public class google_gmailVerificationTEST extends LoginPage_Google {

	public static google_gmailVerification ggv_obj;
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		ggv_obj = new google_gmailVerification();

	}
	
	@Test
	public void gmail_oneVerification()
	{
		Assert.assertEquals(ggv_obj.verify_gmailProducts(), true);
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
}
