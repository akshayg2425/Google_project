package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.Google_CountUnreadMail;
import com.google.page_login.Google_StaredMailCount;
import com.google.page_login.google_newLabelCreateVerify;

public class Google_CountUnreadMailTEST extends LoginPage_Google{
	
	
	public static Google_CountUnreadMail gcum_obj;
	


	@BeforeMethod
	public void StartInit() {
		intialization();
		gcum_obj = new Google_CountUnreadMail();

	}
	

	@Test
	public void testCountMail() {

		
	int totalcount = gcum_obj.countUreadMails();
	
		System.out.println("No of unread mails are " + totalcount);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	

}
