package com.mobileinvest.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	TakeScreenPrint ts=new TakeScreenPrint();
	
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}	

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Unfortunately, the Test "+result.getName()+" failed.");
		System.out.println("--------------------------------------------------");
		try {
			ts.TakeScreenFail();
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to take screenshot."+e.getMessage());
			System.out.println("--------------------------------------------------");
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test "+result.getName()+" has been Skipped due to previous test Failing or being Skipped.");
		System.out.println("--------------------------------------------------");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------------------");
		System.out.println("***Starting Test:"+result.getName()+"***");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test "+result.getName()+" Passed!");
		System.out.println("--------------------------------------------------");
	}

}
