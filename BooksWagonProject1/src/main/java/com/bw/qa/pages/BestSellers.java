package com.bw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bw.qa.base.Base;

public class BestSellers extends Base {

	@FindBy(xpath = "//a[contains(text(),'Best sellers')][1]")
	WebElement bestSellerBtn;

	@FindBy(xpath = "//img[@alt='Bhagavad Gita: Yatharoop']")
	WebElement bhagavadGitaBtn;

	@FindBy(xpath = "//input[@value='Buy Now']")
	WebElement buyNowElement;

	public void bestSellersPage() {
		try {
			bestSellerBtn.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void bhagavadGitaBook() {
		try {
			bhagavadGitaBtn.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public void buyNowABook() {
		try {

			buyNowElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
