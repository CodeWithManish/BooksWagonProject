package com.bw.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.qa.pages.BestSellers;
import com.bw.qa.pages.FictionBookPage;
import com.bw.qa.pages.HomePage;
import com.bw.qa.pages.LoginPage;

public class FictionBookPageTest extends LoginPage {

	LoginPage loginPage;
	HomePage homePage;
	FictionBookPage fictionBookPage;

	public FictionBookPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void toClickOnFictionBook() {
		fictionBookPage = new FictionBookPage();
		fictionBookPage.fictionBookLink();
	}

	@Test(priority = 2)
	public void toSelectYourTimeWillComeBook() {
		fictionBookPage = new FictionBookPage();
		fictionBookPage.yourTimeWillComeBook();
	}

	@Test(priority = 3)
	public void toClickOnBuyNow() {
		fictionBookPage = new FictionBookPage();
		fictionBookPage.ClickOnBuyNow();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
