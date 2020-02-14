package com.google.page_login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class google_outputVerification extends LoginPage_Google {

	public static google_loginPage glp_obj;

	@FindBy(xpath = Configuration.firstlink)
	public WebElement first_link;

	@FindBy(xpath = Configuration.secoundlink)
	public WebElement secound_link;

	@FindBy(xpath = Configuration.thiredlik)
	public WebElement thired_link;

	@FindBy(xpath = Configuration.fourthlink)
	public WebElement four_link;

	public google_outputVerification() {
		PageFactory.initElements(driver, this);
		glp_obj = new google_loginPage();
	}

	public boolean inputverify() {

		glp_obj.Ele_one.sendKeys(Configuration.nameinput);
		glp_obj.Ele_one.sendKeys(Keys.ENTER);

		boolean b = false;

		if (first_link.isDisplayed() == true && secound_link.isDisplayed() == true) {
			if (thired_link.isDisplayed() == true && four_link.isDisplayed() == true) {
				b = true;
			}
		}

		return b;
	}

}
