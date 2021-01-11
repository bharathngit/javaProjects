
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		//Implicit wait - wait 1 sec for each webelement to show up - extends run time
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); //Wait 1 seconds for elements to appear
		
		WebElement username=driver.findElement(By.name("Email"));
		username.sendKeys("bharathn.cs05");
		username.submit();
		//xpath for dynamic element -password 
		String xpathExpression="/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input[2]";
		
		//Thread.sleep(2000L); - Extends execn time
				
		//Explicit wait 1 sec "only" for password webelement to appear
		WebDriverWait wait = new WebDriverWait(driver, 2);
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));//elementToBeClickable(By.id("someid")));
		password.sendKeys("Amma1987$");
		password.submit();
	
		Thread.sleep(2000L);
		driver.quit();
				

	}
	
}
		