package com.google.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.Google_CountUnreadMail;
import com.google.page_login.Google_MailAttachmentCheck;

public class Google_MailAttachmentCheckTEST extends LoginPage_Google {

	public Google_MailAttachmentCheck gmac_obj;

	@BeforeMethod
	public void StartInit() {
		intialization();
		gmac_obj = new Google_MailAttachmentCheck();

	}

	@Test
	public void testCountMail() {

		int totalcount = gmac_obj.countAttachmentMail();

		System.out.println("No. Of Attached Mails Are " + totalcount);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
