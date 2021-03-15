package com.orangeHRMopenSource.generics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class Listenerimplementation extends BaseClass implements ITestListener 
{

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult arg) {
		String result=arg.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File source =t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/"+result+".png");
		try {
			Files.copy(source, dest);
		}catch (IOException e) {
			
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
	}
	
}
