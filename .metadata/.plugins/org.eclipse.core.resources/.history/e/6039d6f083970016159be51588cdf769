


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import readExcel.readExcel;

public class StartApplication {


		public static AndroidDriver driver;
		public static void main(String[] args) throws Exception {
			
			readExcel rd=new readExcel("C:\\Users\\Bharath\\Documents\\facebook.xlsx");
			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/APK/Facebook");
			File app = new File(appDir, "com.facebook.katana_v98.0.0.18.70-41212249_Android-4.0.3.apk");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "HTC One_M8");
			capabilities.setCapability("platformVersion", "6.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.facebook.katana");
			capabilities.setCapability("appWaitActivity", "dbl.activity.FacebookLoginActivity");
			int row;
			int col;
			int rowcount=rd.rowCount(0)+1;
			
System.out.println("Setting Capabilities- Sending request to appium server");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//System.out.println("Clearing on username");
			driver.findElementById("com.facebook.katana:id/login_username").clear();
	
	System.out.println("Fetching login details");
	String username=rd.sendData(0, 1, 0);//returns bharathnadukatla
	String password=rd.sendData(0, 1, 1);//returns Kittu143		
	
	System.out.println("Entering login details - Username and Password");
	driver.findElement(By.id("com.facebook.katana:id/login_username")).sendKeys(username);
			driver.findElement(By.id("com.facebook.katana:id/login_password")).sendKeys(password);
			driver.findElement(By.id("com.facebook.katana:id/login_login")).click();
			System.out.println("clicked submit");
			
			
			//driver.findElementById("com.facebook.katana:id/login_username").sendKeys(null);
			
			//driver.findElement(By.id("com.facebook.katana:id/login_username"));
			//driver.findElements(By.id("com.facebook.katana:id/login_username")).
			
			System.out.println("Test successfull..heading to sleep");
			Thread.sleep(10000);
			System.out.println("Ending session");
			driver.quit();

	}

		
}