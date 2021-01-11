package com.mobileinvest.tests;

import java.io.File;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.thread.TestNGThread;

import com.mobileinvest.utilities.InitiateApplication;
import com.mobileinvest.utilities.TakeScreenPrint;


@SuppressWarnings("unused")
public class MobileInvestHome  {
	
	
	static InitiateApplication st=new InitiateApplication();
	TakeScreenPrint ts=new TakeScreenPrint();
	//TakeScreenshot ts=new TakeScreenshot();
	//AndroidDriver dr=st.driver;
	

	@BeforeTest
	public void initializeApp() throws Exception{
		
		st.Start();//Mobile Invest App starts up and Home page is displayed
				}
	
	//This test sets up indices from Index Watch Setting menu, by checking 4 check boxes and clicking Save
	
	@SuppressWarnings("static-access")
	@Test
	public void SetIndicesFromIndexSettings() throws Throwable{
		
		
		//Open Settings
			st.driver.findElement(By.xpath("//android.view.View[contains(@resource-id,'indexWatch')]/android.view.View[contains(@resource-id,'openSettings')]/android.view.View[@index='0']")).click();
			System.out.println("Successfully navigated to Index watch settings");
						
		//Un-tick the SENSEX, which is selected by default
			st.driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'SENSEX')]")).click();
			System.out.println("Un-ticked Sensex..");
		
			
			//Ticking Nifty  Next 50..	
				try {
					
					Boolean niftydisplay=st.driver.findElementByAndroidUIAutomator("UiSelector().description(\"Nifty Next 50\")").isDisplayed();
						
						Assert.assertTrue(niftydisplay, "Sorry. Couldn't find Nifty IT");
						System.out.println("Found Nifty Next 50..");
						st.driver.findElementByAndroidUIAutomator("UiSelector().description(\"Nifty Next 50\")").click();
						System.out.println("Ticked Nifty Next 50..");
						ts.TakeScreenSuccess();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				//Scrolling down to Save button
				st.driver.swipe(500, 1400, 500, 200, 2000);
				
				
				//Saving the selection
				//Find Save Button & Click
				Boolean saveDisplay=st.driver.findElement(By.name("Save ")).isDisplayed();
				
				try {
						Assert.assertTrue(saveDisplay, "Save button can't be found");
						System.out.println("Found Save Button! Now clicking..");
						ts.TakeScreenSuccess();
						st.driver.findElement(By.name("Save ")).click();
						System.out.println("Saved!");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					st.driver.closeApp();
				}
		
			//Finding Close button
			try {
				st.driver.findElementByAndroidUIAutomator("UiSelector().description(\"Close \")");
				System.out.println("Found Close Button.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Close");
			}
				
		
	}
	
	@Test(dependsOnMethods="SetIndicesFromIndexSettings")
	public void VerifyIndicesFromIndexSettings() throws Throwable{
		
		System.out.println("Starting Test -VerifyIndicesFromIndexSettings.");
			
			
				@SuppressWarnings("static-access")
				Boolean Nifty=st.driver.findElement(By.name("Nifty Next 50-NSE")).isDisplayed();
					Assert.assertTrue(Nifty, "Nifty  Next 50.. is not displayed on Home page");
					System.out.println("Successfully verified Index - Nifty Next 50.. on Home Page");
					ts.TakeScreenSuccess();
				
		
	}
	
	@AfterTest
	public void closeApp(){
		System.out.println("Ending session & Closing App");
		st.Close();
				
	}
}
