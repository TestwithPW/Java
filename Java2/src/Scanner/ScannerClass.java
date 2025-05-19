package Scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		
		//Importing the Scanner class by creating the obj of the Scanner class
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the value of a : ");
		int a = sc.nextInt(); // method for saving int 
		
		System.out.println(" Enter the value of b : ");

		int b = sc.nextInt();
		
		// swap using addition-sutraction
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println( " Value of a : " + a+ " &" + " b: " +b );
		
		// again swap using prodcut & division
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println( "Reswpped Value of a : " + a+ " &" + " b: " +b );
		
		
		
		

	}

}
