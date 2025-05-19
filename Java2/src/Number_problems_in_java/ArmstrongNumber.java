package Number_problems_in_java;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		int org =a;
		
		int sum = 0;
		int rem=0;
		int q;
			while(a!=0) {
				
				rem =a%10; 

				sum=(sum)+(rem*rem*rem);
				
				a=a/10;
			} 
			
			System.out.println("Sum of digits in a is " + sum);
			
			if(sum==org) {
				System.out.println( " a is arm num");
			}
			else {
				System.out.println( " a is not arm  num");
			}
		

	} 
	

}
