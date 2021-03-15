package com.orangeHRMopenSource.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	
	/**
	 * Note: Implicit wait for element present in gui
	 * @param driver
	 */
	
	public void waitForElementInGui(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * Explicit wait for element present in Gui
	 * @param driver
	 * @param element
	 */
	public void waitForElementPresent(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * custom wait for element is displayed
	 * @param element
	 */
	public void customWait(WebElement element)
	{
		int i=0;
		while(i<100)
		{
			try {
				element.isDisplayed();
				break;
			}
			catch(Exception e)
			{
				i++;
			}
			
		}
	}
}
