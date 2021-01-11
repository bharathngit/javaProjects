package readExcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class readExcel {
	XSSFWorkbook wb;
	XSSFSheet st;
	
	public readExcel(String xlPath) throws Exception{
				
		try {
			File src=new File(xlPath);
			FileInputStream fi= new FileInputStream(src);
			wb = new XSSFWorkbook(fi);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public int rowCount(int sheet){
		st = wb.getSheetAt(sheet);
		int rowcount= st.getLastRowNum();
		return rowcount;
	}
	public String sendData(int sheet,int row,int col) throws Exception{
		st = wb.getSheetAt(sheet);
		String data=st.getRow(row).getCell(col).getStringCellValue();
		wb.close();
		return data;
			/*int rowcount= st.getLastRowNum();
			for(int rownum=1;rownum<=rowcount;rownum++){
			username= st.getRow(rownum).getCell(0).getStringCellValue();
			uname=username;
			System.out.println("Sending FB Username:"+username);
				//for(int colnum=0;colnum<rowcount;colnum++){
				pwd= st.getRow(rownum).getCell(1).getStringCellValue();
				pswd=pwd;
				System.out.println("Sending Passwd:"+pwd);	
				//}
			}*/
		}
	
}
