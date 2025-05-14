package String_in_Java;

public class String_SplitFunction {
	
	public static void main(String[] args) {
		
		// String is predefined class in java.lang 
		// that's why it starts with uppercase
		// it has many predefined functions/methods which we can use directly to perform different operation 
		
		
		String a= "Manas Java and Selenium Classes ";
		
		String[] arr = a.split(" ");
		
		System.out.println(arr[1]); // Java
		System.out.println(arr[3]); // Selenium
		System.out.println(arr[0]);//Manas
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
		for(int i=arr.length-1;i >=0;i--) {
			System.out.println(arr[i]);
		}
		
		String[] arr2 = a.split("");
		for(int i=arr2.length-1;i >=0;i--) { //reversing the String using String array and Split method
			System.out.print(arr2[i]);
		}
		System.out.println();

		for(int i=a.length()-1;i >=0;i--) { // reversing the String using charAt
			System.out.print(a.charAt(i));
		}
		
	}

	

}
