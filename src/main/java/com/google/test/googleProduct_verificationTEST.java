package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.googleProduct_verification;
import com.google.page_login.google_outputVerification;

public class googleProduct_verificationTEST extends LoginPage_Google {

	
	public static googleProduct_verification gpve_obj;
	
	@BeforeMethod
	public void StartInit() {
		intialization_two();
		gpve_obj = new googleProduct_verification();

	}
	
	@Test(priority = 1)
	public void first_product()
	{
		Assert.assertEquals(gpve_obj.first_set(), true);
	}
	
	@Test(priority = 2)
	public void secound_product()
	{
		Assert.assertEquals(gpve_obj.two_set(), true);
	}
	
	@Test(priority = 3)
	public void thired_product()
	{
		Assert.assertEquals(gpve_obj.three_set(), true);
	}
	
	@Test(priority = 4)
	public void fourth_product()
	{
		Assert.assertEquals(gpve_obj.four_set(), true);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
}
