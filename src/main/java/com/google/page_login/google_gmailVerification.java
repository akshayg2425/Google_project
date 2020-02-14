package com.google.page_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class google_gmailVerification extends LoginPage_Google {

	public static google_pageSiginOperations gpso_obj;

	public static Google_totalNoMails gtnm_obj;

	@FindBy(xpath = Configuration.gmailsupport)
	public WebElement gmailSupport;

	@FindBy(xpath = Configuration.gmailmenu)
	public WebElement gmailMenu;

	public google_gmailVerification() {

		PageFactory.initElements(driver, this);

		gpso_obj = new google_pageSiginOperations();

		gtnm_obj = new Google_totalNoMails();

	}

	public boolean verify_gmailProducts() {

		gtnm_obj.signin.click();

		gpso_obj.acc_username.sendKeys(Configuration.keyusername);

		gpso_obj.next_username.click();

		gpso_obj.acc_password.sendKeys(Configuration.key);

		gpso_obj.acc_next.click();

		gtnm_obj.mailbutton.click();

		boolean b = false;

		if (gmailSupport.isDisplayed() == true && gmailMenu.isDisplayed() == true) {
			b = true;
		}

		return b;

	}

}
