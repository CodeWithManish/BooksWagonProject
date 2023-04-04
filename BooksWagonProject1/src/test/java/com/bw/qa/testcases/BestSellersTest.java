package com.bw.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.qa.pages.BestSellers;
import com.bw.qa.pages.HomePage;
import com.bw.qa.pages.LoginPage;

public class BestSellersTest extends LoginPage {
	LoginPage loginPage;
	HomePage homePage;
	BestSellers bestSellers;

	public BestSellersTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void toClickOnBestSellersPage() {
		bestSellers = new BestSellers();
		bestSellers.bestSellersPage();
	}

	@Test(priority = 2)
	public void toClickOnBhagavadGitaBook() {
		bestSellers = new BestSellers();
		bestSellers.bhagavadGitaBook();
	}

	@Test(priority = 3)
	public void toClickOnBuyNow() {
		bestSellers = new BestSellers();
		bestSellers.buyNowABook();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
