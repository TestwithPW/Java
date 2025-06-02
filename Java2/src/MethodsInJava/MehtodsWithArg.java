package MethodsInJava;

public class MehtodsWithArg {
	
	
	public static void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public void multiplication(int a, int b) {
		System.out.println(a*b);
	}
	

	public static void main(String[] args) {
		addition(20,30);
		
		MehtodsWithArg obj =new MehtodsWithArg();
		obj.multiplication(20, 30);

	}

}