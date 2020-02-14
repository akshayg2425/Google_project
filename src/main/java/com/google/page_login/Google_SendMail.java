package com.google.page_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class Google_SendMail extends LoginPage_Google {

	public static google_pageSiginOperations gpso_obj;
	public static Google_totalNoMails gtnm_obj;
	public static google_mailcomposeVerification gmcv_obj;

	public Google_SendMail() {
		PageFactory.initElements(driver, this);
		gpso_obj = new google_pageSiginOperations();

		gtnm_obj = new Google_totalNoMails();

		gmcv_obj = new google_mailcomposeVerification();

	}

	@FindBy(xpath = Configuration.sendto)
	public WebElement Sendto;

	@FindBy(xpath = Configuration.sendsubject)
	public WebElement Sendsubject;

	@FindBy(xpath = Configuration.sendccclick)
	public WebElement Sendccclick;

	@FindBy(xpath = Configuration.sendcc)
	public WebElement Sendcc;

	@FindBy(xpath = Configuration.sendsubmit)
	public WebElement Sendsubmit;

	@FindBy(xpath = Configuration.sendbutton)
	public WebElement Sendbutton;

	@FindBy(xpath = Configuration.verifysentmail)
	public WebElement verifysentmail;

	@FindBy(xpath = Configuration.composebodyinsentmail)
	public WebElement composebody;
	
	public boolean verifySentMail() throws InterruptedException {
		gtnm_obj.signin.click();

		gpso_obj.acc_username.sendKeys(Configuration.keyusername);

		gpso_obj.next_username.click();

		gpso_obj.acc_password.sendKeys(Configuration.key);

		gpso_obj.acc_next.click();

		gtnm_obj.mailbutton.click();

		Thread.sleep(5000);
		gmcv_obj.composeMail.click();
		
		/*System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));*/
		
		/*Actions action = new Actions(driver);
		
		action.moveToElement(composebody).build().perform();*/
		
		/*Thread.sleep(5000);

		Sendccclick.click();*/
		
		Thread.sleep(5000);

	
		
		Sendto.sendKeys(Configuration.mailsend);
		
		Thread.sleep(5000);

		Sendsubject.sendKeys(Configuration.mailsubject);

		/*Thread.sleep(5000);
		
		Sendcc.sendKeys(Configuration.sendcc);*/
		
		Thread.sleep(5000);

		Sendsubmit.click();
		
		Thread.sleep(5000);

		Sendbutton.click();

		
		boolean b = false;
		Thread.sleep(5000);
		if (verifysentmail.isDisplayed() == true) {
			b = true;
		}
		
		return b;

	}

}
