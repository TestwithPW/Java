package Scanner;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		
		
		//Importing the Scanner class by creating the obj of the Scanner class
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your first name ");
		
		String  fn = sc.next(); // to give the single word string input
		
		
		System.out.println(" Enter your last name ");
		
		
		String  ln = sc.next();
		
		
		System.out.println(" Full name :  " + fn.concat(ln));

	}

}
