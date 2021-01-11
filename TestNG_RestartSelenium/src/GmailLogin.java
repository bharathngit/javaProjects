
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); //Wait 1 seconds for elements to appear
		WebElement username=driver.findElement(By.name("Email"));
	//	String a="hello";
		username.sendKeys("bharathn.cs05");
		username.submit();
		
		String xpathExpression="/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input[2]";
		
		//driver.wait(driver.findElement(By.xpath(xpathExpression))));
		//Thread.sleep(2000L);
		//WebElement next= driver.findElement(By.id("next"));
				//next.click();
				
		driver.findElement(By.xpath(xpathExpression)).sendKeys("Amma1987$");
		//password.sendKeys("Amma1987$");
		//Thread.sleep(1000L);				
		driver.findElement(By.id("signIn")).click();
	
		Thread.sleep(2000L);
		driver.quit();
				

	}
	
}
		