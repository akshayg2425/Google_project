package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.Google_MailSendingToLabel;
import com.google.page_login.google_gmailVerification;

public class Google_MailSendingToLabelTEST extends LoginPage_Google {

	public static Google_MailSendingToLabel gmstl_obj;

	@BeforeMethod
	public void StartInit() {
		intialization();
		gmstl_obj = new Google_MailSendingToLabel();

	}

	@Test
	public void gmail_oneVerification() throws InterruptedException {
		Assert.assertEquals(gmstl_obj.verifyMovedMail_InMail(), true);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
