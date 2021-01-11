
public class TestMain {

	public static void main(String[] args) {
		
System.out.println("inside 1st Main function");
main(6);
	}
	public static void main(int args) {
		
System.out.println("inside THE OTHER main, value sent from Main is"+args);
 display(7);
	}
	public static void display(int x){
		System.out.println("inside display "+x);
	}
	

}
