package com.bw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bw.qa.base.Base;

public class BookPage extends Base {
	
	@FindBy(xpath = "//a[normalize-space()='Books']")
	WebElement booksElement;
	
	@FindBy(xpath = "//ul[@class='dropdown list-unstyled hidewrapper']//a[@onclick='getSearchResult()'][normalize-space()='Art & Photography']")
	WebElement artPhotographyElement;
	
	@FindBy(xpath = "//div[@class='search-results fltrs demo3']//div[1]//div[4]//div[5]//a[1]//input[1]")
	WebElement buyNowElement;
	
	public void verifyArtPhotography() {
		try {
			booksElement.click();
			artPhotographyElement.click();
			//buyNowElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
