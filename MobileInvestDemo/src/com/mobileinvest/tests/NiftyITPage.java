package com.mobileinvest.tests;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobileinvest.utilities.InitiateApplication;
import com.mobileinvest.utilities.TakeScreenPrint;

@SuppressWarnings("unused")
public class NiftyITPage {
	InitiateApplication st=new InitiateApplication();
	TakeScreenPrint ts=new TakeScreenPrint();
	IndexWatchPage iwp=new IndexWatchPage(); 

	@BeforeTest
	public void initializeApp() throws Exception{
			iwp.initializeApp(); //Initializing and navigating to Index Watch Page by Re-using function from Index Watch Page class
				}
	@SuppressWarnings("static-access")
	@Test
	public void Open_NiftyITPage() throws Throwable{
		
			st.driver.swipe(500, 1400, 500, 200, 1000); //Swiping down to make Nifty IT visible
			st.driver.findElement(By.name("Nifty IT")).click();
			System.out.println("Found and clicked Nitfy IT");
			 Thread.sleep(2000);
			ts.TakeScreenSuccess();
	}
	
	@SuppressWarnings("static-access")
	@Test(dependsOnMethods="Open_NiftyITPage")
	public void Select_CandleStick_Chart() throws Throwable{
		
		//Finding the Spinner(Dropdown) element..
				st.driver.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'chartTypeFromModal')]")).click();
				System.out.println("Found the Chart Spinner(Dropdown)!");
								
				//Selecting Candlestick from Spinner(Dropdown)
				 st.driver.findElement(By.name("Candlestick Chart")).click();
				 System.out.println("Selected Candlestick Chart successfully!");
				 Thread.sleep(2000);
				 ts.TakeScreenSuccess();
	}
	
	
	@AfterTest
	public void closeApp(){
		System.out.println("Ending session & Closing App");
		st.Close();
	}
}
