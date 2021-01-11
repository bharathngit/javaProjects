
public class String_Handling {

	public static void main(String[] args) {
		
		int i=100;
		String str = "We are learning Java. Java is important to learn selenium";

		String str1 = new String("We are learning Java. Java is important to learn selenium");
		
		int length = str.length();
		System.out.println(length);//57
		
		char c=str.charAt(56);
		System.out.println(c);
		
		int index=str.indexOf("J");
		System.out.println(index);
		
		
		//index=str.indexOf("J", 17);
		index=str.indexOf("J", str.indexOf("J")+1);
		System.out.println(index);
		
		if(str.equals(str1))
			System.out.println("Equal");
		
		System.out.println(str.substring(5, 10));// 5-9
		System.out.println(str.substring(10));
		System.out.println(str.startsWith("We are"));
		
		// About 76,50,000 results (0.65 seconds) 
		
		String temp[] = str.split("Java");
		System.out.println(temp.length);
		//System.out.println(temp[0]);
		//System.out.println(temp[1]);
		//System.out.println(temp[2]);
		
		for(int j=0;j<temp.length;j++){
			System.out.println(temp[j]);
		}
		
		String str3="         About 76,50,000 results (0.65 seconds)        ";
		System.out.println(str3);
		System.out.println(str3.trim());
		
		
		
		
		String ticketNumber="87156517283123";
		
		String a="100";
		String b="200";
		
		int a1=Integer.parseInt(a);
		int b1=Integer.parseInt(b);
		
		int c1=a1+b1;
		System.out.println(c1);
		
		
		
		int z=200;
		String z1 = String.valueOf(z);
		
		
		
		
		

	}

}
