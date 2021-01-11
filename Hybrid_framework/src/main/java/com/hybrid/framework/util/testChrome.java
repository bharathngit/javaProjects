package com.hybrid.framework.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://google.com");
driver.close();
System.out.println("success");
	}

}
