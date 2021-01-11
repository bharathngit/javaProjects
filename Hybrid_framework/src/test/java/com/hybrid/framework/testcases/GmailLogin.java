package com.hybrid.framework.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailLogin {
@Test
	public void doLogin(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("http://google.com");
	driver.findElement(By.xpath("//a[.='Gmail']")).click();
	//Sign In
	try {
		driver.findElement(By.xpath("//a[.='Sign In']")).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//.//*[@id='Email'] - Enter email id and click next
	driver.findElement(By.id("Email")).sendKeys("bharathn.cs05@gmail.com");;
	driver.findElement(By.id("next")).click();;
	//Enter passoword - id=Passwd
	driver.findElement(By.id("Passwd")).sendKeys("Amma1987$");;
	//Sign in id=signIn
	driver.findElement(By.id("signIn")).click();
	driver.close();
	
	}
}
