package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath="//a[text()='User Management']")
	private WebElement um;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	private WebElement users;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void moveToAdmin(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(admin).perform();
	}
	
	public void moveToUserManagement(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(um).perform();
	}
	
	public void clickOnUser()
	{
		users.click();
	}

}
