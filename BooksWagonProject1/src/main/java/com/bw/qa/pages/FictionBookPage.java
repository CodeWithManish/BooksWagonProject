package com.bw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bw.qa.base.Base;

public class FictionBookPage extends Base{
	@FindBy(xpath = "//a[contains(text(),'Fictions Books')][1]")
	WebElement fictionBookLinkElement;
	
	@FindBy(xpath = "//img[@alt ='Your Time Will Come'][1]")
	WebElement yourTimeWillComeElement;
	
	@FindBy(xpath = "//input[@value='Buy Now']")
	WebElement buyNowBtn;
	
	public void fictionBookLink() {
		try {
			fictionBookLinkElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void yourTimeWillComeBook() {
		try {
			yourTimeWillComeElement.isSelected();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public void ClickOnBuyNow() {
		try {

		buyNowBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
