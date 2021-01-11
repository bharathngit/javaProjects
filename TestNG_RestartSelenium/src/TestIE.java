
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestIE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.ie.driver", "C:\\Windows\\IEDriverServer.exe");
InternetExplorerDriver i1=new InternetExplorerDriver();
i1.get("http://google.com");
i1.quit();
	}

}
