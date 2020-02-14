package com.google.page_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class google_pageSiginOperations extends LoginPage_Google {

	public static google_pageTitle_verification gptv_obj;

	@FindBy(xpath = Configuration.accountsignin)
	public WebElement acc_sigin;

	@FindBy(xpath = Configuration.username)
	public WebElement acc_username;

	@FindBy(xpath = Configuration.password)
	public WebElement acc_password;

	@FindBy(xpath = Configuration.next)
	public WebElement acc_next;

	@FindBy(xpath = Configuration.next_username)
	public WebElement next_username;

	@FindBy(xpath = Configuration.acc_logout)
	public WebElement acc_logout;

	@FindBy(xpath = Configuration.acc_logo)
	public WebElement acc_logo;

	@FindBy(xpath = Configuration.account_splsignin)
	public WebElement acc_splsignin;

	@FindBy(xpath = Configuration.nameappear)
	public WebElement acc_nameappear;

	@FindBy(xpath = Configuration.Signin_homePage)
	public WebElement mainSignin;

	@FindBy(xpath = Configuration.imagelogo)
	public WebElement searchImagelogo;

	@FindBy(xpath = Configuration.searchnamVerify)
	public WebElement searchnamverify;

	@FindBy(xpath = Configuration.mapImageLogo)
	public WebElement mapimagelogo;

	@FindBy(xpath = Configuration.mapNameVerify)
	public WebElement mapnamverify;

	@FindBy(xpath = Configuration.youtubeSigin)
	public WebElement youtubesigin;

	@FindBy(xpath = Configuration.youtubeImageLogo)
	public WebElement youtubeimagelogo;

	@FindBy(xpath = Configuration.youtubeNameVerify)
	public WebElement youtubenameverify;

	@FindBy(xpath = Configuration.youtubesignout)
	public WebElement youtubesignout;

	@FindBy(xpath = Configuration.playLogo)
	public WebElement playlogo;

	@FindBy(xpath = Configuration.playNameVerify)
	public WebElement playnameverify;

	@FindBy(xpath = Configuration.newslogo)
	public WebElement newsLogo;

	@FindBy(xpath = Configuration.newsnameverify)
	public WebElement newsnameVerify;

	@FindBy(xpath = Configuration.photosgoto)
	public WebElement photosGoTo;

	@FindBy(xpath = Configuration.photonameverify)
	public WebElement photoverifyName;

	@FindBy(xpath = Configuration.photologinclick)
	public WebElement photologinclick;

	public google_pageSiginOperations() {

		PageFactory.initElements(driver, this);
		gptv_obj = new google_pageTitle_verification();
	}

	public boolean AccountSignin() throws InterruptedException {
		gptv_obj.google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));

		gptv_obj.google_account.click();

		acc_sigin.click();

		acc_username.sendKeys(Configuration.keyusername);

		next_username.click();

		acc_password.sendKeys(Configuration.key);

		acc_next.click();

		boolean b = false;

		if (acc_nameappear.isDisplayed() == true) {
			b = true;
		}

		System.out.println(acc_nameappear.getText() + " ****** For Account *******");

		acc_logo.click();
		acc_logout.click();

		return b;

	}

	public boolean searchSigin() {
		gptv_obj.google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));

		gptv_obj.search.click();

		mainSignin.click();

		acc_username.sendKeys(Configuration.keyusername);

		next_username.click();

		acc_password.sendKeys(Configuration.key);

		acc_next.click();

		searchImagelogo.click();

		boolean b = false;

		if (searchnamverify.isDisplayed() == true) {
			b = true;
		}
		System.out.println(searchnamverify.getText() + "****** For Search *******");

		acc_logout.click();

		return b;
	}

	public boolean mapSigin() {
		gptv_obj.google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));

		gptv_obj.maps.click();

		mainSignin.click();

		acc_username.sendKeys(Configuration.keyusername);

		next_username.click();

		acc_password.sendKeys(Configuration.key);

		acc_next.click();

		mapimagelogo.click();

		boolean b = false;

		if (mapnamverify.isDisplayed() == true) {
			b = true;
		}
		System.out.println(mapnamverify.getText() + "****** For map *******");

		acc_logout.click();
		return b;

	}

	public boolean youtubeSignin() {
		gptv_obj.google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));

		gptv_obj.youtube.click();

		youtubesigin.click();

		acc_username.sendKeys(Configuration.keyusername);

		next_username.click();

		acc_password.sendKeys(Configuration.key);

		acc_next.click();

		youtubeimagelogo.click();

		boolean b = false;

		if (youtubenameverify.isDisplayed() == true) {
			b = true;
		}

		System.out.println(youtubenameverify.getText() + "****** For youtube *******");

		youtubesignout.click();

		return b;
	}

	public boolean playSignin() {

		gptv_obj.google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));

		gptv_obj.play.click();

		mainSignin.click();

		acc_username.sendKeys(Configuration.keyusername);

		next_username.click();

		acc_password.sendKeys(Configuration.key);

		acc_next.click();

		playlogo.click();

		boolean b = false;

		if (playnameverify.isDisplayed() == true) {
			b = true;
		}

		System.out.println(playnameverify.getText() + "****** For play *******");

		acc_logout.click();

		return b;

	}

	public boolean newsSignin() {
		gptv_obj.google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));

		gptv_obj.news.click();

		acc_sigin.click();

		acc_username.sendKeys(Configuration.keyusername);

		next_username.click();

		acc_password.sendKeys(Configuration.key);

		acc_next.click();

		newsLogo.click();

		boolean b = false;

		if (newsnameVerify.isDisplayed() == true) {
			b = true;
		}

		System.out.println(newsnameVerify.getText() + "****** For news *******");

		acc_logout.click();

		return b;

	}

	public boolean photoSignin() {
		gptv_obj.google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));

		gptv_obj.photos.click();

		photosGoTo.click();

		acc_username.sendKeys(Configuration.keyusername);

		next_username.click();

		acc_password.sendKeys(Configuration.key);

		acc_next.click();

		photologinclick.click();

		boolean b = false;

		if (photoverifyName.isDisplayed() == true) {
			b = true;
		}

		System.out.println(photoverifyName.getText() + "****** For Photos *******");

		acc_logout.click();

		return b;

	}

}
