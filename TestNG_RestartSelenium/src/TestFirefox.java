
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestFirefox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver f1= new FirefoxDriver();
f1.get("http://google.com");
f1.quit();
	}

}
