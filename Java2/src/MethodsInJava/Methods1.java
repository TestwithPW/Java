package MethodsInJava;

public class Methods1 {
	
	
	public void Methods1() {
		System.out.println(" This is static method");

	}
	
	public static void s1() {
		System.out.println(" This is static method");

	}
	
	public  void n1() {
		System.out.println(" This is non-static method");

	}

	public static void main(String[] args) {
		
		// calling methods in same class
		System.out.println("This is main method ");
		
		s1();
		
//		Methods1 obj = new Methods1();
//		obj.n1();


	}

}
