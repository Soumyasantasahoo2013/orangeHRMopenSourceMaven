package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	@FindBy(xpath="//a[text()='Soumya']")
	private WebElement usn;
	
	@FindBy(id="welcome")
	private WebElement wp;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement lgt;
	
	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnWp()
	{
		wp.click();
	}
	
	public void clickOnLogout()
	{
		lgt.click();
	}
	
	public String getUserName()
	{
		return usn.getText();
	}

}
