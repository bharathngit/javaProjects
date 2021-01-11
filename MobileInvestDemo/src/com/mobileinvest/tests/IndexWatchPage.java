package com.mobileinvest.tests;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobileinvest.utilities.InitiateApplication;
import com.mobileinvest.utilities.TakeScreenPrint;

@SuppressWarnings("unused")
public class IndexWatchPage {
	InitiateApplication st=new InitiateApplication();
	//TakeScreenshot ts=new TakeScreenshot();
	TakeScreenPrint ts=new TakeScreenPrint();

	@SuppressWarnings("static-access")
	@BeforeTest
	public void initializeApp() throws Exception{
			st.Start();//Mobile Invest App starts up and Home page is displayed
			
			//Navigate to Index Watch Page
			
			System.out.println("Now, navigating to Index watch page");
			st.driver.findElement(By.name("IndexWatch")).click();
			//Validate whether Index watch page has loaded
			try {
				System.out.println("Verifying whethere the page has loaded..");
				st.driver.findElement(By.name("IndexWatch"));
				System.out.println("Page has loaded");
				//st.driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'IndexWatch')]"));
			} catch (Exception e) {
				
				System.out.println("Page could not be loaded.");
				e.printStackTrace();
			}
				}
	//Test to select BSE from Spinner(Dropdown) list
	@SuppressWarnings("static-access")
	@Test
	public void SelectBSE_from_Dropdown(){
		
		
		//Finding the Spinner(Dropdown) element
		st.driver.findElement(By.xpath("//android.widget.Spinner[contains(@resource-id,'indexWatchExchange')]")).click();
		System.out.println("Found the Spinner(Dropdown)!");
						
		//Selecting BSE from Spinner(Dropdown)
		 st.driver.findElement(By.name("BSE")).click();
		 System.out.println("Selected BSE successfully!");
		 
	}
	@SuppressWarnings("static-access")
	@Test(dependsOnMethods="SelectBSE_from_Dropdown")
	public void Validate_BSE_IndexWatchPage() throws Throwable{
		
		//Verifying whether BSE has been selected
		Boolean bse=st.driver.findElement(By.name("BSE")).isDisplayed();
		Assert.assertTrue("BSE not found",bse);
		System.out.println("BSE has been selected..now selecting index SENSEX");
		
		ts.TakeScreenSuccess();
		
		//Clicking on SENSEX displayed and navigating to Chart display page
		Boolean sensex=st.driver.findElement(By.name("SENSEX")).isDisplayed();
		Assert.assertTrue("Sensex Not Displayed", sensex);
		
		st.driver.findElement(By.name("SENSEX")).click();
		System.out.println("Selected SENSEX successfully.");
		
		
	}
	
	@AfterTest
	public void closeApp(){
		System.out.println("Ending session & Closing App");
		st.Close();
				
	}
}
