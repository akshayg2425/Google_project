package com.google.page_login;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class GoogleLaungage_appear extends LoginPage_Google{
	
	@FindBy(xpath = Configuration.hindilang)
	public WebElement hindiLang;
	
	@FindBy(xpath = Configuration.marathilang)
	public WebElement marathiLang;
	
	@FindBy(xpath = Configuration.googleserchinverifction)
	public WebElement googlesearch;
	
	@FindBy(xpath = Configuration.imlucky)
	public WebElement imlucky;

	@FindBy(xpath = Configuration.imageverficaiton)
	public WebElement iamgeinverifacation;
	
	@FindBy(xpath = Configuration.mainXpath)
	public WebElement mainxpath;
	
	
	
	public GoogleLaungage_appear()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean lang_one_test()
	{
		
		hindiLang.click();
		boolean b = false;
		if(hindiLang.isDisplayed() == true)
		{
			b = true;
		}
		
		return b;
	}
	
	public boolean lang_two_test()
	{
		
		marathiLang.click();
		boolean b = false;
		if(marathiLang.isDisplayed() == true)
		{
			b = true;
		}
		
		return b;
	}
	
}
