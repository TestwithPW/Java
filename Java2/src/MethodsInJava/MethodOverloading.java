package MethodsInJava;

public class MethodOverloading {
	
	
	public static void add(int num1, int num2) {
		
		System.out.println(num1+num2);
		System.out.println("This will fetch int");
	}
	
	public static void add(int num1, int num2, int num3) {
		
		System.out.println(num1+num2+num3);
	}
	
	public static void add(int num1, int num2, int num3, int num4) {
		
		System.out.println(num1+num2+num3+num4);
	}
	
	public static void add(int num1, double num2) {
		
		System.out.println(num1+num2);
		System.out.println("This will fetch double");
	}

	public static void main(String[] args) {
		add(20,30);
		add(20,30,40);
		add(50,60);
		add(20,25, 30);
		add(20,30.5);

	}

}
