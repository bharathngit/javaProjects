package com.maven.firstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestMavenProject {
	@Test
	public void testHello() throws Exception{
		System.out.println("Hello! Welcome to Maven World!");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000L);
		driver.quit();
	}

}
