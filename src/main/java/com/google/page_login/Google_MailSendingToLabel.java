package com.google.page_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class Google_MailSendingToLabel extends LoginPage_Google {

	public static Google_totalNoMails gtnm_obj;

	public static google_pageSiginOperations gpso_obj;

	public Google_MailSendingToLabel() {
		PageFactory.initElements(driver, this);

		gtnm_obj = new Google_totalNoMails();

		gpso_obj = new google_pageSiginOperations();
	}

	@FindBy(xpath = Configuration.markmail)
	public WebElement Markmail;

	@FindBy(xpath = Configuration.labelimg)
	public WebElement Labelimg;

	@FindBy(xpath = Configuration.marklabel)
	public WebElement Marklabel;

	@FindBy(xpath = Configuration.applyclick)
	public WebElement Applyclick;

	@FindBy(xpath = Configuration.movedlabel)
	public WebElement Movedlabel;

	@FindBy(xpath = Configuration.inboxbutton)
	public WebElement inboxbutton;

	@FindBy(xpath = Configuration.archiveimg)
	public WebElement archiveimg;

	@FindBy(xpath = Configuration.checkmailinlabel)
	public WebElement Checkmailinlabel;

	public boolean verifyMovedMail_InMail() throws InterruptedException {
		gtnm_obj.signin.click();

		gpso_obj.acc_username.sendKeys(Configuration.keyusername);

		gpso_obj.next_username.click();

		gpso_obj.acc_password.sendKeys(Configuration.key);

		gpso_obj.acc_next.click();

		gtnm_obj.mailbutton.click();

		Markmail.click();

		Thread.sleep(5000);

		Actions action = new Actions(driver);

		action.moveToElement(archiveimg).click().build().perform();

		/*Thread.sleep(5000);
		Labelimg.click();*/

		Thread.sleep(5000);

		Marklabel.click();

		Thread.sleep(5000);

		Applyclick.click();

		Thread.sleep(5000);

		Actions actions = new Actions(driver);

		actions.moveToElement(inboxbutton).build().perform();

		Movedlabel.click();

		Thread.sleep(5000);

		boolean b = false;

		if (Checkmailinlabel.isDisplayed() == true) {
			b = true;
		}

		return b;
	}

}
