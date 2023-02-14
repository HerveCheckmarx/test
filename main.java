import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "topSecret";
		System.out.println(password);
		
		String Password = null;
		int prExp = 222;
		try {
			Scanner in = new Scanner(System.in);		
			Password = in.next();
			System.out.println(Password);
			
			int zz = System.in.read();
			
			long res = calc(2,3,4);
			
			long resDouble = doubleCalc(5);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		foo(); 
	}
	
}


