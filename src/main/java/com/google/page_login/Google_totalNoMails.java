package com.google.page_login;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class Google_totalNoMails extends LoginPage_Google {

	public static google_pageSiginOperations gpso_obj;

	@FindBy(xpath = Configuration.noofmail)
	public WebElement NoOfMail;

	@FindBy(xpath = Configuration.mailcountinpage)
	public WebElement Mailcount;

	@FindBy(xpath = Configuration.nextbuttonimail)
	public WebElement NextButtonMail;

	@FindBy(xpath = Configuration.mailopath)
	public WebElement mailPath;

	@FindBy(xpath = Configuration.mailapp)
	public WebElement mailapp;

	@FindBy(xpath = Configuration.googleapp)
	public WebElement googleapp;

	@FindBy(xpath = Configuration.signin)
	public WebElement signin;

	@FindBy(xpath = Configuration.mailbutton)
	public WebElement mailbutton;
	
	@FindBy(xpath = Configuration.nextbutton)
	public WebElement nextbutton ;
	
	@FindBy(xpath = Configuration.totalmailcount)
	public WebElement totalmailcount ;

	public Google_totalNoMails() {

		PageFactory.initElements(driver, this);
		gpso_obj = new google_pageSiginOperations();
	}

	public int verifyNoOfMails() throws InterruptedException {

		signin.click();

		gpso_obj.acc_username.sendKeys(Configuration.keyusername);

		gpso_obj.next_username.click();

		gpso_obj.acc_password.sendKeys(Configuration.key);

		gpso_obj.acc_next.click();

		mailbutton.click();

		
		int sum = 0;

	/*	sum += list.size();

		System.out.println(sum);*/
		
	//	System.out.println(totalmailcount.getText());

	int no = Integer.parseInt(totalmailcount.getText());
	System.out.println(no);
	int totalMail = no/50;
	
	System.out.println(totalMail);
	
	if(totalMail > 0)
	{
		
	
	for(int i = 0 ; i < totalMail ; i++)
	{
		List<WebElement> list = driver.findElements(By.xpath(Configuration.mailopath));
		sum += list.size();
		
		Thread.sleep(5000);
		nextbutton.click();
		Thread.sleep(5000);
	}
	}
	
	List<WebElement> list = driver.findElements(By.xpath(Configuration.mailopath));
	sum += list.size();
		return sum;

	}

}
