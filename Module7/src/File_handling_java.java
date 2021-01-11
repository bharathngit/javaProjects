import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class File_handling_java {

	public static void main(String[] args) {
		// create
		File f  = new File("F:\\temp\\selenium.txt");
		System.out.println(f.exists());
		try {
			if(!f.exists())
				f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
		
		
		//write
		try {
			FileWriter fw = new FileWriter("F:\\temp\\selenium.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Line1");
			bw.newLine();
			bw.write("Line2");
			bw.newLine();
			bw.write("Line3");
			bw.newLine();
			bw.write("Line4");
			
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//read
		try {
			FileReader fr = new FileReader("F:\\temp\\selenium.txt");
			BufferedReader br = new BufferedReader(fr);
			String x="";
			//System.out.println(br.readLine());
			//System.out.println(br.readLine());
			
			while( (x=br.readLine()) !=null){
				System.out.println(x);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
