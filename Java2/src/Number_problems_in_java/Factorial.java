package Number_problems_in_java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the value of a : ");
		int a = sc.nextInt(); // method for saving int 
		int b= a;
		int f =1;
		
		// factorial 
		while (b!=0) {
			f= f*b;	
			b--;
		}System.out.println("factorial of " + a + " is " + f);
		
		System.out.println(" Enter the value of c : ");
		int c = sc.nextInt();
		int d =c;
		int fa =1; 
		
		for(int i= d; i>0 ; i--) {
			fa= fa*i;
		}System.out.println("factorial of " + a + " is " + fa);

	}

}
