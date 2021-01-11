package readingxls;

public class Testing_xlsx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Xls_Reader xls = new Xls_Reader("F:\\temp\\TestCases.xlsx");//>2007+
		
		// rows, cols, read, write
		
		int rows = xls.getRowCount("Login");
		System.out.println("Rows -> "+ rows);
		
		int cols = xls.getColumnCount("Login");
		System.out.println("Cols -> "+ cols);
		
		
		String data = xls.getCellData("Login", "Username", 3);
		System.out.println(data);
		
		data = xls.getCellData("Login", "Password", 2);
		System.out.println(data);
		
		data = xls.getCellData("Login", 1, 4); //0,1,2
		System.out.println(data);
		
		data = xls.getCellData("Login", 1, 5); //0,1,2
		System.out.println(data);
		
		
		//xls.setCellData("Login", "Password", 10, "Selenium");
		// print all contents of the xls
		
	//	for(){//rows
			
	//		for(){//cols
			
	//		}
	//	}
		
		
		
		
		
		
		
		
	}

}
