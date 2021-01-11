package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GmailLogin {
	
	WebDriver driver;
	@BeforeTest
	public void initiBrowser(){
		System.out.println("initiating browser");
		driver=new ChromeDriver();
		driver.get("http://gmail.com");
		/*Implicit Wait
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);*/
	}
	@AfterTest
	public void closebrowser(){
		System.out.println("closing browser");
		driver.quit();
	}
	@Test
	public void Login() throws InterruptedException{
		
		System.out.println("Starting Login Test");
		WebElement username=driver.findElement(By.name("Email"));
	//	String a="hello";
		username.sendKeys("bharathn.cs05");
		username.submit();
		
		String xpathExpression="/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input[2]";
		//Explicit Wait Code follows
		WebDriverWait wait = new WebDriverWait(driver, 1);
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));//elementToBeClickable(By.id("someid")));
		password.sendKeys("Amma1987$");
		password.submit();	 
		/*driver.findElement(By.xpath(xpathExpression)).sendKeys("Amma1987$");
		driver.findElement(By.id("signIn")).click();*/
		//Thread.sleep(2000L);
					

	}
	
	
	
}
		