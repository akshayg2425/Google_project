package com.google.page_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class google_loginPage extends LoginPage_Google {

	@FindBy(xpath = Configuration.searchbar)
	public WebElement Ele_one;

	@FindBy(xpath = Configuration.googlesearch_button)
	public WebElement Ele_two;

	@FindBy(xpath = Configuration.feelingLucky_button)
	public WebElement Ele_three;

	@FindBy(xpath = Configuration.Signin_homePage)
	public WebElement Ele_four;

	public google_loginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean Verification_one() {
		boolean b1 = Ele_one.isDisplayed();

		return b1;

	}

	public boolean Verification_two() {
		boolean b2 = Ele_two.isDisplayed();

		return b2;

	}

	public boolean Verification_three() {

		boolean b3 = Ele_three.isDisplayed();

		return b3;

	}

	public boolean Verification_four() {

		boolean b4 = Ele_four.isDisplayed();

		return b4;

	}

}
