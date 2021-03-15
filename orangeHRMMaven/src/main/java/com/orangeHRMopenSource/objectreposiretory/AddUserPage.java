package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {
	
	@FindBy(id="systemUser_userType")
	private WebElement ur;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement ename;
	
	@FindBy(id="systemUser_userName")
	private WebElement usnm;
	
	@FindBy(id="systemUser_status")
	private WebElement status;
	
	@FindBy(id="systemUser_password")
	private WebElement pwd;
	
	@FindBy(id="systemUser_confirmPassword")
	private WebElement cnfmpwd;
	
	@FindBy(id="btnSave")
	private WebElement save;
	
	public AddUserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserRole()
	{
		Select sel=new Select(ur);
		sel.selectByVisibleText("ESS");
	}

	public void setEmployeeName(String en)
	{
		ename.sendKeys(en);
	}
	
	public void setUserName(String un)
	{
		usnm.sendKeys(un);
	}
	
	public void setStatus()
	{
		Select sel1=new Select(status);
		sel1.selectByVisibleText("Enabled");
	}
	
	public void setPassword(String pw)
	{
		pwd.sendKeys(pw);
	}
	
	public void setConfirmPassword(String cpw)
	{
		cnfmpwd.sendKeys(cpw);
	}
	
	public void clickOnSave()
	{
		save.click();
	}
}
