package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	@FindBy(id="btnAdd")
	private WebElement add;
	
	public UserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAdd()
	{
		add.click();
	}

}
