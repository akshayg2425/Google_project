package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.Google_SendMail;
import com.google.page_login.Google_SentCheckMail;

public class Google_SentCheckMailTEST extends LoginPage_Google{

	public static Google_SentCheckMail gscm_obj;
	
	@BeforeMethod
	public void StartInit() {
		intialization();
		gscm_obj = new Google_SentCheckMail();

	}
	

	@Test
	public void testSendMailVerify() throws InterruptedException {

		
	Assert.assertEquals(gscm_obj.checkSentMails(), true);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
