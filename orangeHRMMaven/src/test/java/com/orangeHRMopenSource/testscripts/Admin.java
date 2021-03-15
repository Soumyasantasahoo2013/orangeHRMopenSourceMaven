package com.orangeHRMopenSource.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHRMopenSource.generics.BaseClass;
import com.orangeHRMopenSource.objectreposiretory.AddUserPage;
import com.orangeHRMopenSource.objectreposiretory.HomePage;
import com.orangeHRMopenSource.objectreposiretory.LogOutPage;
import com.orangeHRMopenSource.objectreposiretory.UserPage;

public class Admin extends BaseClass{
	
	@Test
	public void User() throws IOException, InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.moveToAdmin(driver);
		hp.moveToUserManagement(driver);
		hp.clickOnUser();
		
		UserPage up=new UserPage(driver);
		up.clickOnAdd();
		
		AddUserPage aup=new AddUserPage(driver);
		aup.setUserRole();
		aup.setEmployeeName("Aaliyah Haq");
		aup.setUserName("Soumya");
		aup.setStatus();
		aup.setPassword("Test@123");
		aup.setConfirmPassword("Test@123");
		Thread.sleep(4000);
		aup.clickOnSave();
		
		LogOutPage lp1=new LogOutPage(driver);
		String text1=lp1.getUserName();
		Assert.assertEquals(text1, f.getPropertyValue("EU"));
	}

}
