package com.google.page_login;

import org.openqa.selenium.WebElement;////17///
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class googlegmail_SetingVerification extends LoginPage_Google {

	public static google_pageSiginOperations gpso_obj;

	public static Google_totalNoMails gtnm_obj;

	@FindBy(xpath = Configuration.settinglogogmail)
	public WebElement settinglogo;

	@FindBy(xpath = Configuration.settingButtonmail)
	public WebElement settingbuttonmail;

	@FindBy(xpath = Configuration.settingpageTitle)
	public WebElement settingtitlepage;

	public googlegmail_SetingVerification() {
		PageFactory.initElements(driver, this);

		gpso_obj = new google_pageSiginOperations();

		gtnm_obj = new Google_totalNoMails();

	}

	public boolean gmailSettingPage() {

		gtnm_obj.signin.click();

		gpso_obj.acc_username.sendKeys(Configuration.keyusername);

		gpso_obj.next_username.click();

		gpso_obj.acc_password.sendKeys(Configuration.key);

		gpso_obj.acc_next.click();

		gtnm_obj.mailbutton.click();
		settinglogo.click();

		settingbuttonmail.click();

		boolean b = false;

		if (settingtitlepage.isDisplayed() == true) {
			b = true;
		}
		return b;

	}

}
