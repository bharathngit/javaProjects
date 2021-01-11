import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Rough {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Hello");
		System.out.println(new Date());
		
		 Workbook wb = new XSSFWorkbook();
	    FileOutputStream fileOut = new FileOutputStream("F:\\workbook.xlsx");
	    wb.write(fileOut);
	    fileOut.close();

	}

}
