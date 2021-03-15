package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="txtUsername")
	private WebElement untbx;

	@FindBy(id="txtPassword")
	private WebElement pwdtbx;

	@FindBy(xpath="//input[@class='button']")
	private WebElement loginbtn;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Business Logic Method
	public void setLogin(String un, String pw)
	{
		untbx.sendKeys(un);
		pwdtbx.sendKeys(pw);
		loginbtn.click();
	}

}
