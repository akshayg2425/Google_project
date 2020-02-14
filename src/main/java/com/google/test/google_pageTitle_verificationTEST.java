package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.google_loginPage;
import com.google.page_login.google_pageTitle_verification;

public class google_pageTitle_verificationTEST extends LoginPage_Google{

      public static google_pageTitle_verification gptv_obj ;
	
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		gptv_obj = new google_pageTitle_verification();

	}
	
	
	@Test(priority = 7)
	public void titleVerificationTEST_one()
	{
		Assert.assertEquals(gptv_obj.VerifyTitle_ggogle_account(), true);
		
	}
	
	@Test(priority = 2)
	public void titleVerificationTEST_two()
	{
		Assert.assertEquals(gptv_obj.Verifytitle_ggogle_search(), true);
		
	}
	
	@Test(priority = 3)
	public void titleVerificationTEST_three()
	{
		Assert.assertEquals(gptv_obj.Verifytitle_ggogle_maps(), true);
		
	}
	
	@Test(priority = 4)
	public void titleVerificationTEST_four()
	{
		Assert.assertEquals(gptv_obj.Verifytitle_ggogle_youtube(), true);
		
	}
	
	@Test(priority = 5)
	public void titleVerificationTEST_five()
	{
		Assert.assertEquals(gptv_obj.Verifytitle_ggogle_play(), true);
		
	}
	
	@Test(priority = 6)
	public void titleVerificationTEST_six()
	{
		Assert.assertEquals(gptv_obj.Verifytitle_ggogle_news(), true);
		
	}
	
	@Test(priority = 1)
	public void titleVerificationTEST_seven()
	{
		Assert.assertEquals(gptv_obj.Verifytitle_ggogle_gmail(), true);
		
	}
	
	@Test(priority = 8)
	public void titleVerificationTEST_eight()
	{
		Assert.assertEquals(gptv_obj.Verifytitle_ggogle_translate(), true);
		
	}
	
	@Test(priority = 9)
	public void titleVerificationTEST_nine()
	{
		Assert.assertEquals(gptv_obj.Verifytitle_ggogle_photos(), true);
		
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
