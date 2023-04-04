package com.bw.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.qa.base.Base;
import com.bw.qa.pages.BookPage;
import com.bw.qa.pages.HomePage;
import com.bw.qa.pages.LoginPage;

public class BookTest extends Base {
	LoginPage loginPage;
	HomePage homePage;
	BookPage bookPage;

	public BookTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void checkArtPhotography() {
		bookPage = new BookPage();
		bookPage.verifyArtPhotography();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
