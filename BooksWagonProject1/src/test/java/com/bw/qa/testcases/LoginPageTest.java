package com.bw.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.qa.base.Base;
import com.bw.qa.pages.HomePage;
import com.bw.qa.pages.LoginPage;

public class LoginPageTest extends Base {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"Online Bookstore | Buy Books Online | Read Books Online");
		log.info("loginPageTitle: "+title);
	}

	@Test(priority = 2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		log.info("Proper login "+homePage);
	}
	
	@AfterMethod
	public void tearDown() {
		 driver.quit();
	}
}
