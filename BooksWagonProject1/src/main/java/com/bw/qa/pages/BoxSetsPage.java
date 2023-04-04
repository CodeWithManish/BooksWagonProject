package com.bw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.bw.qa.base.Base;

public class BoxSetsPage extends Base {

	@FindBy(xpath = "//li[@id='ctl00_lipreorder']//a[contains(text(),'Box Sets')]")
	WebElement boxSetsBtn;

	@FindBy(xpath = "//div[@class='container otherpage seeallfilter']//div[1]//div[1]//div[2]//a[1]")
	WebElement quickViewBtn;

	@FindBy(xpath = "//a[@id='btnAddtoCart']")
	WebElement addCartBtn;

	public void ClickOnNewArrivalsLink() {
		try {
			boxSetsBtn.click();
			quickViewBtn.click();
			addCartBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
