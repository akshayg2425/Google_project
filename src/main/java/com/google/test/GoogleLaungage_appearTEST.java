package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.GoogleLaungage_appear;
import com.google.page_login.google_pageTitle_verification;

public class GoogleLaungage_appearTEST extends LoginPage_Google {

	
	public static GoogleLaungage_appear gla_obj ;
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		gla_obj = new GoogleLaungage_appear();

	}
	
	@Test
	public void LaungVerifcation_one()
	{
		Assert.assertEquals(gla_obj.lang_one_test(), true);
	}
	
	@Test
	public void LaungVerifcation_two()
	{
		Assert.assertEquals(gla_obj.lang_two_test(), true);
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
