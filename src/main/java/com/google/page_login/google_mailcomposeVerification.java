package com.google.page_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;////13/////

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class google_mailcomposeVerification extends LoginPage_Google {

	public static google_pageSiginOperations gpso_obj;

	public static Google_totalNoMails gtnm_obj;

	@FindBy(xpath = Configuration.composmail)
	public WebElement composeMail;

	@FindBy(xpath = Configuration.composebody)
	public WebElement composeBody;

	public google_mailcomposeVerification() {
		PageFactory.initElements(driver, this);

		gpso_obj = new google_pageSiginOperations();

		gtnm_obj = new Google_totalNoMails();
	}

	public boolean composeMail_bodyVerification() {
		gtnm_obj.signin.click();

		gpso_obj.acc_username.sendKeys(Configuration.keyusername);

		gpso_obj.next_username.click();

		gpso_obj.acc_password.sendKeys(Configuration.key);

		gpso_obj.acc_next.click();

		gtnm_obj.mailbutton.click();

		composeMail.click();

		boolean b = false;

		if (composeBody.isDisplayed() == true) {
			b = true;
		}

		return b;

	}

}
