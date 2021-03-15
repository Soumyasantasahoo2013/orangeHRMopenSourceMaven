package com.orangeHRMopenSource.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangeHRMopenSource.objectreposiretory.LogOutPage;
import com.orangeHRMopenSource.objectreposiretory.LoginPage;

public class BaseClass {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:/HSSM40/orangeHRMMaven/src/main/resources/Drivers/chromedriver.exe");
	}
	
	public static WebDriver driver;
	public FileLib f=new FileLib();
	public WebDriverCommonLib w=new WebDriverCommonLib();
	
	@BeforeTest
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		w.waitForElementInGui(driver);
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		String un=f.getPropertyValue("UN");
		String pw=f.getPropertyValue("PWD");
		driver.get(f.getPropertyValue("URL"));
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pw);
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		LogOutPage lo=new LogOutPage(driver);
		Thread.sleep(2000);
		lo.clickOnWp();
		Thread.sleep(2000);
		lo.clickOnLogout();
	}

}
