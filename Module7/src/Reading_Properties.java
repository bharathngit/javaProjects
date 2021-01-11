import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class Reading_properties {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(System.getProperty("user.dir"));
			
			String path=System.getProperty("user.dir")+"\\test.properties";
			Properties prop = new Properties();
			FileInputStream fs = new FileInputStream(path);
			
			prop.load(fs);
			
			System.out.println(prop.getProperty("key"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("env"));
			
			System.out.println(prop.getProperty("xxxxxxxx"));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
