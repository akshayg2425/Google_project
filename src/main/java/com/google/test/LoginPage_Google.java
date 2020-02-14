package com.google.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.config.Configuration;
import com.google.page_login.google_loginPage;

public class LoginPage_Google {

	public static WebDriver driver;

	public static void intialization() {
		if (Configuration.browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Configuration.browser.equals("firefox")) {

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);

		
		driver.get(Configuration.testsite);
	}
	
	public static void intialization_two() {
		if (Configuration.browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Configuration.browser.equals("firefox")) {

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);

		
		driver.get(Configuration.testsite_two);
	}
	
	public static void intialization_three() {
		if (Configuration.browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Configuration.browser.equals("firefox")) {

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);

		
		driver.get(Configuration.testsite_gmail);
	}

}
