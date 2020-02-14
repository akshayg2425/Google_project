package com.google.page_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class google_dialogeApp_verification extends LoginPage_Google {

	@FindBy(xpath = Configuration.googleApp)
	public WebElement google_app;

	@FindBy(xpath = Configuration.googleAccount)
	public WebElement google_account;
	
	@FindBy(xpath= Configuration.googlesearch)
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
	
	@FindBy(xpath = Configuration.googlecontacts)
	public WebElement contacts;
	
	@FindBy(xpath = Configuration.googledrive)
	public WebElement drive;
	
	
	@FindBy(xpath = Configuration.googlecalender)
	public WebElement calender;

	@FindBy(xpath=Configuration.googletranslate)
	public WebElement trnslate;
	
	@FindBy(xpath= Configuration.googlephotos)
	public WebElement photos;
	
	
	
	public google_dialogeApp_verification() {
		PageFactory.initElements(driver, this);
	}
	
	

	public boolean Verify_ggogle_account() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = google_account.isDisplayed();
      
		return b;
	}
	
	public boolean Verify_ggogle_search() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = search.isDisplayed();
      
		return b;
	}
	public boolean Verify_ggogle_maps() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = maps.isDisplayed();
      
		return b;
	}
	public boolean Verify_ggogle_youtube() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = youtube.isDisplayed();
      
		return b;
	}
	
	public boolean Verify_ggogle_play() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = play.isDisplayed();
      
		return b;
	}
	public boolean Verify_ggogle_news() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = news.isDisplayed();
      
		return b;
	}
	public boolean Verify_ggogle_gmail() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = gmail.isDisplayed();
      
		return b;
	}

	public boolean Verify_ggogle_contacts() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		boolean b = contacts.isDisplayed();
      
		return b;
	}
	
	public boolean Verify_ggogle_drive() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = drive.isDisplayed();
      
		return b;
	}
	public boolean Verify_ggogle_calender() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = calender.isDisplayed();
      
		return b;
	}
	public boolean Verify_ggogle_translate() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = trnslate.isDisplayed();
      
		return b;
	}
	public boolean Verify_ggogle_photos() {
		google_app.click();
		
		
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		boolean b = photos.isDisplayed();
      
		return b;
	}
}
