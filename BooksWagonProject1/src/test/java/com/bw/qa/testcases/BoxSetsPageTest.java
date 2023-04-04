package com.bw.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bw.qa.base.Base;
import com.bw.qa.pages.BoxSetsPage;
import com.bw.qa.pages.HomePage;
import com.bw.qa.pages.LoginPage;
import com.bw.qa.pages.NewArrivalsPage;

public class BoxSetsPageTest extends Base {
	
	LoginPage loginPage;
	HomePage homePage;
	BoxSetsPage boxSetsPage;
	
	
	public BoxSetsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@Test
	public void checkBoxSetsPageTest() {
		 boxSetsPage= new BoxSetsPage();
		boxSetsPage.ClickOnNewArrivalsLink();
		
	}
	
	@AfterMethod
	public void tearDown() {
		 driver.quit();
	}
	

}
