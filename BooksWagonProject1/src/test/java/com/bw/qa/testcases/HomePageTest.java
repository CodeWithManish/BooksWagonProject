package com.bw.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.qa.base.Base;
import com.bw.qa.pages.HomePage;
import com.bw.qa.pages.LoginPage;

public class HomePageTest extends Base{
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
		log.info("loginPageTitle: "+homePageTitle);
	}

	@Test(priority = 2)
	public void verifyUserNameTest() {
		Assert.assertTrue(homePage.verifyUsernameLabel());
	}
	
	@Test(priority = 3)
	public void clickOnBook() {
		homePage.clickOnBookLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
