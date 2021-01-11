
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestChrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\AnyFolder");
		WebDriver driver = new ChromeDriver(options);

		// TODO Auto-generated method stub
///ChromeDriver C1= new ChromeDriver();
		driver.get("http://google.com");
		//driver.quit();
	}

}
