package firstJenkinsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestJenkins {

	@Test
	public void JenkinsJob() throws Exception{
		System.out.println("Welcome to Selenium-Jenkins intergration test");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
	
	Thread.sleep(1000L);
	driver.quit();
	}

}
