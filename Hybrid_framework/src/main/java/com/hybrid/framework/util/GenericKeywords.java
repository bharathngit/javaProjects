package com.hybrid.framework.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericKeywords {
	public static WebDriver driver;
	public Properties prop;
	
	public GenericKeywords(){
		prop = new Properties();
		
		try {
			FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+"//src//test//Resources//project.properties");
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void openBrowser(String brName){
		if(brName.equalsIgnoreCase("Mozilla")){
			driver=new FirefoxDriver();
		}
		else if(brName.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if(brName.equalsIgnoreCase("ie")){
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	public void click(String Locator){
		System.out.println("Clicking on:"+Locator);
		if(Locator.endsWith("xpath")){
		driver.findElement(By.xpath(prop.getProperty(Locator))).click();
		}else if(Locator.endsWith("id")){
			driver.findElement(By.id(prop.getProperty(Locator))).click();	
		}
		
	}
	public void navigate(String url){
		System.out.println("Navigating to:"+url);
		driver.get(prop.getProperty(url));
	}
	public void input(String locator, String text){
		System.out.println("Typing in :"+locator+" the text:"+text);
		if(locator.endsWith("xpath")){
			driver.findElement(By.xpath(prop.getProperty(locator))).sendKeys(prop.getProperty(text));
			}else if(locator.endsWith("id")){
				driver.findElement(By.id(prop.getProperty(locator))).sendKeys(prop.getProperty(text));	
			}
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
	System.out.println("Closing browser");
		driver.close();
	}
}
