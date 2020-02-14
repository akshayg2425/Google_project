package com.google.page_login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class google_newLabelCreateVerify extends LoginPage_Google {

	public static google_pageSiginOperations gpso_obj;
	public static Google_totalNoMails gtnm_obj;

	@FindBy(xpath = Configuration.moreoption)
	public WebElement moreoption;

	@FindBy(xpath = Configuration.createlabelbutton)
	public WebElement createlabelbutton;

	@FindBy(xpath = Configuration.labeloptionfiled)
	public WebElement labeloptionfiled;

	@FindBy(xpath = Configuration.createbuttoninlabel)
	public WebElement createbuttoninlabel;

	@FindBy(xpath = Configuration.newlabel)
	public WebElement newlabel;

	@FindBy(xpath = Configuration.scrolllocation)
	public WebElement scrolldown;

	public google_newLabelCreateVerify() {

		PageFactory.initElements(driver, this);
		gpso_obj = new google_pageSiginOperations();

		gtnm_obj = new Google_totalNoMails();

	}

	public boolean VerifyLabelCreate() throws InterruptedException {
		gtnm_obj.signin.click();

		gpso_obj.acc_username.sendKeys(Configuration.keyusername);

		gpso_obj.next_username.click();

		gpso_obj.acc_password.sendKeys(Configuration.key);

		gpso_obj.acc_next.click();

		gtnm_obj.mailbutton.click();

		Thread.sleep(5000);

		Actions action = new Actions(driver);

		action.moveToElement(scrolldown).build().perform();

		Thread.sleep(5000);

		moreoption.click();

		createlabelbutton.click();

		Thread.sleep(5000);

		labeloptionfiled.sendKeys(Configuration.datainoptionfiled);
		Thread.sleep(5000);

		createbuttoninlabel.click();

		return true;
	}

}
