package com.bw.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.qa.base.Base;
import com.bw.qa.pages.HomePage;
import com.bw.qa.pages.LoginPage;
import com.bw.qa.pages.NewArrivalsPage;

public class NewArrivalsPageTest extends LoginPage {
	LoginPage loginPage;
	HomePage homePage;
	NewArrivalsPage newArrivalsPage;

	
	public NewArrivalsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newArrivalsPage = new NewArrivalsPage();
	}

	@Test
	public void toClickOnNewArrivalsLink() {
		newArrivalsPage = new NewArrivalsPage();
	newArrivalsPage.checkNewArrivals();

      
	}

	@BeforeMethod
	public void tearDown() {
		// driver.quit();
	}
}
