package com.google.page_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.config.Configuration;
import com.google.test.LoginPage_Google;

public class googleProduct_verification extends LoginPage_Google {

	@FindBy(xpath= Configuration.productone)
	public WebElement firstproduct;
	
	@FindBy(xpath= Configuration.producttwo)
	public WebElement secoundproduct;
	
	@FindBy(xpath= Configuration.productthree)
	public WebElement thiredproduct;
	
	@FindBy(xpath= Configuration.productfour)
	public WebElement fourthproduct;
	
	@FindBy(xpath= Configuration.productfive)
	public WebElement fifthproduct;
	
	@FindBy(xpath= Configuration.productsix)
	public WebElement sixthproduct;
	
	@FindBy(xpath= Configuration.productseven)
	public WebElement seventhproduct;
	
	@FindBy(xpath= Configuration.producteight)
	public WebElement eightthproduct;
	
	@FindBy(xpath= Configuration.productnine)
	public WebElement ninethproduct;
	
	
	public googleProduct_verification()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean first_set()
	{
		
		boolean b = false;
		if(firstproduct.isDisplayed() == true && secoundproduct.isDisplayed() == true)
		{
			b = true;
		}
		
		return b;
	}
	
	public boolean two_set()
	{
		
		boolean b = false;
		if(thiredproduct.isDisplayed() == true && fourthproduct.isDisplayed() == true)
		{
			b = true;
		}
		
		return b;
	}
	public boolean three_set()
	{
		
		boolean b = false;
		if(fifthproduct.isDisplayed() == true && sixthproduct.isDisplayed() == true)
		{
			b = true;
		}
		
		return b;
	}
	public boolean four_set()
	{
		
		boolean b = false;
		if(seventhproduct.isDisplayed() == true && eightthproduct.isDisplayed() == true && ninethproduct.isDisplayed() == true)
		{
			b = true;
		}
		
		return b;
	}
	
}
