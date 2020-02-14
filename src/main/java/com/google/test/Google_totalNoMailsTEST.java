package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.Google_totalNoMails;
import com.google.page_login.google_dialogeApp_verification;

public class Google_totalNoMailsTEST extends LoginPage_Google{

	public static Google_totalNoMails gtnm_obj;
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		gtnm_obj = new Google_totalNoMails();

	}
	

	@Test
	public void test_NoMails() throws InterruptedException {

		Thread.sleep(5000);
	int count = gtnm_obj.verifyNoOfMails();
	Thread.sleep(5000);
		System.out.println("No of mails are " + count);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


	
	
}
