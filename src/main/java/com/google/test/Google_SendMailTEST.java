package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.Google_CountUnreadMail;
import com.google.page_login.Google_SendMail;

public class Google_SendMailTEST extends LoginPage_Google {

	public static Google_SendMail gsm_obj;

	@BeforeMethod
	public void StartInit() {
		intialization();
		gsm_obj = new Google_SendMail();

	}

	@Test
	public void testSendMail() throws InterruptedException {

		Assert.assertEquals(gsm_obj.verifySentMail(), true);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
