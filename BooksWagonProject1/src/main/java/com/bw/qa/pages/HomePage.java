package com.bw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bw.qa.base.Base;

public class HomePage extends Base{
	
	@FindBy(xpath ="//span[text()='Manish Kumar']")
	WebElement usernamelabel;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[8]/ul[1]/li[1]/a[1]")
	WebElement BookLink;

	@FindBy(xpath = "//li[@id='ctl00_linewrelease']//a[contains(text(),'New Arrivals')]")
	WebElement NewArrivalsLink;

	@FindBy(xpath = "//li[@id='ctl00_lipreorder']//a[contains(text(),'Box Sets')]")
	WebElement BoxSetsLink;

	@FindBy(xpath = "//li[@id='ctl00_libestseller']//a[contains(text(),'Best sellers')]")
	WebElement BestsellersLink;

	// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}

		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
		
		public boolean verifyUsernameLabel() {
			return usernamelabel.isDisplayed();
		}
		
		public HomePage clickOnBookLink(){
			BookLink.click();
			return new HomePage();
		}
		
		
		
		public HomePage clickOnBoxSetsLink() {
			BoxSetsLink.click();
			return new HomePage();
		}
		
		public HomePage clickOnBestsellersLink() {
			BestsellersLink.click();
			return new HomePage();
		}
}
