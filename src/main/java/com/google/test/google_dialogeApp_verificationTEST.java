package com.google.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.page_login.google_dialogeApp_verification;
import com.google.page_login.google_loginPage;

public class google_dialogeApp_verificationTEST extends LoginPage_Google {

	google_dialogeApp_verification gdv_obj;

	@BeforeMethod
	public void StartInit() {
		intialization();
		gdv_obj = new google_dialogeApp_verification();

	}

	@Test
	public void test_one() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_account(), true);
		System.out.println("success in the verification one");

	}

	@Test
	public void test_two() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_search(), true);
		System.out.println("success in the verification two");

	}

	@Test
	public void test_three() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_maps(), true);
		System.out.println("success in the verification three");

	}

	@Test
	public void test_four() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_youtube(), true);
		System.out.println("success in the verification four");

	}

	@Test
	public void test_five() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_play(), true);
		System.out.println("success in the verification five ");

	}

	@Test
	public void test_six() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_news(), true);
		System.out.println("success in the verification six");

	}

	@Test
	public void test_seven() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_gmail(), true);
		System.out.println("success in the verification seven");

	}

	@Test
	public void test_eight() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_contacts(), true);
		System.out.println("success in the verification eight");

	}

	@Test
	public void test_nine() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_drive(), true);
		System.out.println("success in the verification nine");

	}

	@Test
	public void test_ten() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_calender(), true);
		System.out.println("success in the verification ten");

	}

	@Test
	public void test_eleven() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_translate(), true);
		System.out.println("success in the verification eleven");

	}

	@Test
	public void test_twele() {

		Assert.assertEquals(gdv_obj.Verify_ggogle_photos(), true);
		System.out.println("success in the verification twele");

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
