package com.google.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.Google_StaredMailCount;
import com.google.page_login.Google_totalNoMails;

public class Google_StaredMailCountTEST extends LoginPage_Google{

	public static Google_StaredMailCount gsmc_obj;
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		gsmc_obj = new Google_StaredMailCount();

	}
	

	@Test
	public void testCountMail() {

		
	int totalcount = gsmc_obj.countStaredMail();
	
		System.out.println("No of mails are " + totalcount);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


	
}
