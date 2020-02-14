package com.google.page_login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class Google_SentCheckMail extends LoginPage_Google {

	public static google_pageSiginOperations gpso_obj;
	public static Google_totalNoMails gtnm_obj;
	public static Google_SendMail gsm_obj;

	public Google_SentCheckMail() {
		PageFactory.initElements(driver, this);

		gpso_obj = new google_pageSiginOperations();

		gtnm_obj = new Google_totalNoMails();

		gsm_obj = new Google_SendMail();
	}

	@FindBy(xpath = Configuration.cancelbutton)
	public WebElement cancelbutton;

	@FindBy(xpath = Configuration.searchbutton)
	public WebElement searchbutton;

	@FindBy(xpath = Configuration.searchresult)
	public WebElement searchresult;
	
	@FindBy(xpath = Configuration.sentbutton)
	public WebElement sentbutton;
	
	@FindBy(xpath = Configuration.inboxbutton)
	public WebElement inboxbutton;

	public boolean checkSentMails() {
		gtnm_obj.signin.click();

		gpso_obj.acc_username.sendKeys(Configuration.keyusername);

		gpso_obj.next_username.click();

		gpso_obj.acc_password.sendKeys(Configuration.key);

		gpso_obj.acc_next.click();

		gtnm_obj.mailbutton.click();
		
		
         Actions action = new Actions(driver);
		
		action.moveToElement(inboxbutton).build().perform();

		sentbutton.click();

		cancelbutton.click();

		searchbutton.sendKeys(Configuration.searchresult);

		searchbutton.sendKeys(Keys.ENTER);

		boolean b = false;

		if (searchresult.isDisplayed() == true) {
			b = true;
		}

		return b;

	}

}
