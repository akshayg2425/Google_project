package com.google.page_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class google_pageTitle_verification extends LoginPage_Google {

	public static google_loginPage glpobj;

	@FindBy(xpath = Configuration.googleApp)
	public WebElement google_app;

	@FindBy(xpath = Configuration.googleAccount)
	public WebElement google_account;

	@FindBy(xpath = Configuration.googlesearch)
	public WebElement search;

	@FindBy(xpath = Configuration.googlemaps)
	public WebElement maps;

	@FindBy(xpath = Configuration.googleyoutube)
	public WebElement youtube;

	@FindBy(xpath = Configuration.googleplay)
	public WebElement play;

	@FindBy(xpath = Configuration.googlenews)
	public WebElement news;

	@FindBy(xpath = Configuration.googlegmail)
	public WebElement gmail;

	@FindBy(xpath = Configuration.googletranslate)
	public WebElement trnslate;

	@FindBy(xpath = Configuration.googlephotos)
	public WebElement photos;

	@FindBy(xpath = Configuration.googleaccounttitle)
	public WebElement titlecheck;

	@FindBy(xpath = Configuration.mapsearchbox)
	public WebElement mapserchbox;

	@FindBy(xpath = Configuration.youtubesearchbox)
	public WebElement youtubeSbox;

	@FindBy(xpath = Configuration.youtubesearchboxlogo)
	public WebElement youtubelogo;

	@FindBy(xpath = Configuration.googleplaySearchbox)
	public WebElement googleplayserchbox;

	@FindBy(xpath = Configuration.googleplaylogo)
	public WebElement googleplaylogo;

	@FindBy(xpath = Configuration.newsstory)
	public WebElement newsstory;

	@FindBy(xpath = Configuration.newsstoryforme)
	public WebElement newsstoryforme;

	/*@FindBy(xpath = Configuration.mailoption1)
	public WebElement mailmethod1;

	@FindBy(xpath = Configuration.mailoption2)
	public WebElement mailmethod2;*/
	
	@FindBy(xpath = Configuration.gmailnewaccount)
	public WebElement gmailnewaccount;

	@FindBy(xpath = Configuration.trnslatetitle)
	public WebElement translatlogo;

	@FindBy(xpath = Configuration.trnslatesignin)
	public WebElement translatesignin;

	@FindBy(xpath = Configuration.photostitle)
	public WebElement photostitle;

	@FindBy(xpath = Configuration.photosoption)
	public WebElement photoloption;

	
	
	
	public google_pageTitle_verification() {
		PageFactory.initElements(driver, this);

		glpobj = new google_loginPage();
	}

	
	
	
	
	
	public boolean VerifyTitle_ggogle_account() {
		google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		google_account.click();
		boolean b = titlecheck.isDisplayed();

		return b;
	}

	
	
	public boolean Verifytitle_ggogle_search() {
		google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

		search.click();
		boolean b = false;

		if (glpobj.Verification_one() == true) {
			if (glpobj.Verification_two() == true) {
				if (glpobj.Verification_three() == true) {
					b = true;
				}
			}
		}

		return b;
	}

	
	
	
	public boolean Verifytitle_ggogle_maps() {
		google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

		maps.click();

		boolean b = mapserchbox.isDisplayed();

		return b;
	}

	
	
	public boolean Verifytitle_ggogle_youtube() {
		google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

		youtube.click();

		boolean b = false;

		if (youtubeSbox.isDisplayed() == true && youtubelogo.isDisplayed() == true) {
			b = true;
		}

		return b;
	}

	
	
	
	public boolean Verifytitle_ggogle_play() {
		google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

		play.click();

		boolean b = false;

		if (googleplayserchbox.isDisplayed() == true && googleplaylogo.isDisplayed() == true) {

			b = true;

		}

		return b;
	}

	
	
	
	
	public boolean Verifytitle_ggogle_news() {
		google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

		news.click();

		boolean b = false;

		if (newsstory.isDisplayed() == true && newsstoryforme.isDisplayed() == true) {
			b = true;
		}

		return b;
	}
	
	
	
	
	

	public boolean Verifytitle_ggogle_gmail() {
		google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

		gmail.click();

		boolean b = gmailnewaccount.isDisplayed();

		return b;
	}
	
	
	
	

	public boolean Verifytitle_ggogle_translate() {
		google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

		trnslate.click();

		boolean b = false;

		if (translatlogo.isDisplayed() == true && translatesignin.isDisplayed() == true) {
			b = true;
		}

		return b;
	}

	
	
	
	public boolean Verifytitle_ggogle_photos() {
		google_app.click();

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

		photos.click();

		boolean b = false;

		if (photoloption.isDisplayed() == true && photostitle.isDisplayed() == true) {
			b = true;
		}

		return b;
	}

}
