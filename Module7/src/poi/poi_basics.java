package poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poi_basics {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb = new XSSFWorkbook();
	    FileOutputStream fileOut = new FileOutputStream("F:\\temp\\workbook.xlsx");
	    wb.write(fileOut);
	    fileOut.close();

	}

}
