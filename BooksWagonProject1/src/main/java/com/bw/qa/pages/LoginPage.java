package com.bw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bw.qa.base.Base;

public class LoginPage extends Base {
	//page factory - object repository:
	
			@FindBy(xpath = "//li[@class='list-inline-item text-center loginpopupwrapper']")
			WebElement myAccount;
			
			@FindBy(xpath ="//input[@id='ctl00_phBody_SignIn_txtEmail']")
			WebElement username;
			
			@FindBy(id="ctl00_phBody_SignIn_txtPassword")
			WebElement password;
			
			@FindBy(id="ctl00_phBody_SignIn_btnLogin")
			WebElement loginBtn;
	
			//Initialize page objects
			public LoginPage() {
				PageFactory.initElements(driver, this);		
			}
			//Actions
			public String validateLoginPageTitle() {
				String title = driver.getTitle();
				return title;
			}
			
			public HomePage login(String un, String pwd) {
				myAccount.click();
				username.sendKeys(un);
				password.sendKeys(pwd);
				loginBtn.click();
				
				return new HomePage();
	}

}
