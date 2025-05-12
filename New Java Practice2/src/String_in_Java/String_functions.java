package String_in_Java;

public class String_functions {
	
	public static void main(String[] args) {
		
		// String is predefined class in java.lang 
		// that's why it starts with uppercase
		// it has many predefined functions/methods which we can use directly to perform different operation 
		
		String s= "Manas QA";
		String s1 = "Manas QA";
		String s2 = "Manas qa";
		String s3 = "";
		
		// Length function return type int
		
		System.out.println(" lenght of the string s :" + s.length());
		int a = s.length();
		
		// Startswith  - return type boolean
		
		System.out.println(s.startsWith("M"));
		System.out.println(s.startsWith("Man"));
		System.out.println(s.startsWith("Mani"));
		
		// Endsswith  - return type boolean
		
		System.out.println(s.endsWith("QA"));
		System.out.println(s.endsWith(" QA"));
		System.out.println(s.endsWith(" QA "));
		
		// toLowerCase - covert every char to lowercase return type String 
		System.out.println(s.toLowerCase());
		
		// toUpperCase - covert every char to uppercase return type String
		System.out.println(s.toUpperCase());
		
		
		// equalsTo - case sensitive - return type boolean 
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s==s1);
		System.out.println(s1.equals(s2));
		
		// eqaulIgnoreCase
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		
		
		//isEmpty
		System.out.println(s.isEmpty());
		System.out.println(s3.isEmpty());
		
		
		// contains - return type boolean - case sensitive
		System.out.println(s.contains("QA"));
		System.out.println(s.contains("qa"));
		
		
		String s4= "Manas QA"; 
		
		System.out.println(s4.contains("QA"));
		int l = s4.length();
		if(l>5) {
			System.out.println( "lenght of s4 is greater than 5");
		}else {
			System.out.println("lenght of s4 is smaller than 5");
		}
		
		
		if(s4.contains("QA")==true && s4.length()>5) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
		if(s4.contains("M")==true && s4.length()<=10) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	}

}
