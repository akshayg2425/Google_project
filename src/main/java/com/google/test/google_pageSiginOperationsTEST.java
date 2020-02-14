package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.google_pageSiginOperations;
import com.google.page_login.google_pageTitle_verification;

public class google_pageSiginOperationsTEST extends LoginPage_Google{

	public static google_pageSiginOperations gpsignopertion_obj;
	
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		gpsignopertion_obj = new google_pageSiginOperations();

	}
	
	
	
	@Test(priority = 1)
	public void SigninAccount() throws InterruptedException
	{
		Assert.assertEquals(gpsignopertion_obj.AccountSignin(), true);
	}
	
	
	@Test(priority = 2)
	public void SigninSearch() throws InterruptedException
	{
		Assert.assertEquals(gpsignopertion_obj.searchSigin(), true);
	}
	
	@Test(priority = 3)
	public void SigninMap() throws InterruptedException
	{
		Assert.assertEquals(gpsignopertion_obj.mapSigin(), true);
	}
	
	@Test(priority = 4)
	public void SigninYoutube() throws InterruptedException
	{
		Assert.assertEquals(gpsignopertion_obj.youtubeSignin(), true);
	}
	
	@Test(priority = 5)
	public void SigninPlay() throws InterruptedException
	{
		Assert.assertEquals(gpsignopertion_obj.playSignin(), true);
	}
	
	@Test(priority = 6)
	public void SigninNews() throws InterruptedException
	{
		Assert.assertEquals(gpsignopertion_obj.newsSignin(), true);
	}
	
	@Test(priority = 7)
	public void SigninPhoto() throws InterruptedException
	{
		Assert.assertEquals(gpsignopertion_obj.photoSignin(), true);
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
