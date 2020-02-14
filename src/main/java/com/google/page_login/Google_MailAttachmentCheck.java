package com.google.page_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class Google_MailAttachmentCheck extends LoginPage_Google {

	public static Google_totalNoMails gtnm_obj;

	public static google_pageSiginOperations gpso_obj;

	public Google_MailAttachmentCheck() {
		PageFactory.initElements(driver, this);

		gtnm_obj = new Google_totalNoMails();

		gpso_obj = new google_pageSiginOperations();
	}

	public int countAttachmentMail() {
		gtnm_obj.signin.click();

		gpso_obj.acc_username.sendKeys(Configuration.keyusername);

		gpso_obj.next_username.click();

		gpso_obj.acc_password.sendKeys(Configuration.key);

		gpso_obj.acc_next.click();

		gtnm_obj.mailbutton.click();

		List<WebElement> list = driver.findElements(By.xpath(Configuration.attachment));

		return list.size();
	}

}
