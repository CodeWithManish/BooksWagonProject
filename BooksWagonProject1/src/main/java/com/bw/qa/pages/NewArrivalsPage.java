package com.bw.qa.pages;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bw.qa.base.Base;

public class NewArrivalsPage extends Base {

	Actions action = new Actions(driver);
	WebElement NewArrivalsBtn = driver.findElement(By.xpath("//a[contains(text(),'New Arrivals')][1]"));
	
//	@FindBy(xpath = "//a[contains(text(),'New Arrivals')][1]")
//	WebElement NewArrivalsBtn;

	@FindBy(xpath = "//a[contains(text(),'Quick View')]")
	WebElement QuickViewBtn;

	@FindBy(xpath = "(//div[@class='card align-items-center'])[1]")
	WebElement ItStartWithUsBtn;

	@FindBy(xpath = "//a[contains(text(),'Add To Cart')]")
	WebElement AddToCartBtn;

	WebDriverWait wait = new WebDriverWait(driver, 30);

	public void checkNewArrivals() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(NewArrivalsBtn));
			NewArrivalsBtn.click();


			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i = 1; i < 5; i++) {
				js.executeScript("window.scrollBy(0, 1000)");
				Thread.sleep(1000);
			}
			for (int i = 1; i < 5; i++) {
				js.executeScript("window.scrollBy(0, -1000)");
				Thread.sleep(1000);
			}

			Actions action1 = new Actions(driver);
			action1.moveToElement(ItStartWithUsBtn).perform();

			wait.until(ExpectedConditions.visibilityOfAllElements(QuickViewBtn));
			QuickViewBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartBtn));
			AddToCartBtn.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

//	@FindBy(xpath = "(//a[contains(text(),'New Arrivals')])[2]")
//	WebElement NewArrivalsBtn;
//
//	@FindBy(xpath = "//a[contains(text(),'Quick View')]")
//	WebElement QuickViewBtn;
//
//	@FindBy(xpath = "(//div[@class='card align-items-center'])[1]")
//	WebElement ItStartWithUsBtn;
//
//	@FindBy(xpath = "//a[contains(text(),'Add To Cart')]")
//	WebElement AddToCartBtn;
//
//	public void checkNewArrivals() {
//		try {
//
//			NewArrivalsBtn.click();
//			QuickViewBtn.click();
//			AddToCartBtn.click();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//	}

}
