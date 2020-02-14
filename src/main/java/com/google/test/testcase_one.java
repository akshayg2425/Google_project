package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.google_loginPage;

public class testcase_one extends LoginPage_Google {
	public static google_loginPage glp_obj;

	@BeforeMethod
	public void StartInit() {
		intialization();
		glp_obj = new google_loginPage();

	}

	@Test
	public void Verification_ofPart_one() {

		Assert.assertEquals(glp_obj.Verification_one(), true);

		System.out.println("Succes at First stage");

	}

	@Test
	public void Verification_ofPart_two() {
		Assert.assertEquals(glp_obj.Verification_two(), true);
Assert.assertEquals("Google Search", "Google Search", "Not verify successfully");
		System.out.println("Succes at Secound stage");
	}

	@Test
	public void Verification_ofPart_three() {
		Assert.assertEquals(glp_obj.Verification_three(), true);

		System.out.println("Succes at Thired stage");
	}

	@Test
	public void Verification_ofPart_four() {
		Assert.assertEquals(glp_obj.Verification_four(), true);

		System.out.println("Succes at Fourth stage");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
