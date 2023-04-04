package com.bw.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.bw.qa.base.Base;

public class CustomListener extends Base implements ITestListener  {
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED Test");
		takeScreenshotAtEndOfTest(result.getMethod().getMethodName());
	}
}

