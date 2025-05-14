package String_in_Java;

public class String_SplitFunction2 {
	
	public static void main(String[] args) {
		
		// String is predefined class in java.lang 
		// that's why it starts with uppercase
		// it has many predefined functions/methods which we can use directly to perform different operation 
		
		
		String a= "Manas Java and Selenium Classes Banglore";
		
		String[] arr = a.split(" ");
		
		System.out.println(arr[1]); // Java
		System.out.println(arr[3]); // Selenium
		System.out.println(arr[0]);//Manas
		
		
		System.out.println("Print each split String");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Print Strings which contains letter e ");
		for(int i=0; i<arr.length;i++) {
			if(arr[i].contains("e")) {
			System.out.println(arr[i]);
			}
		}
		
		System.out.println("Print Strings whoes length greater than 4 ");
		
			for(int i=0; i<arr.length;i++) {
				String value = arr[i];
				if(value.length()>4) {
				System.out.print(arr[i] + " ");
				}
			}	
			
		System.out.println();
		System.out.println("Print Strings which starts with letter a ");
		
			for(int i=0; i<arr.length;i++) {
				String value = arr[i];	
				if(value.startsWith("a")) {
					System.out.println(value);
				}
		}
			
		System.out.println("Print Strings which starts with letter s or b ");
		for(int i=0; i<arr.length;i++) {
			String value = arr[i];	
			if(value.startsWith("S") || value.startsWith("B")) {
				System.out.println(value);
			}
		}
		
		System.out.println("Print strings which ends with letter s");
		for(int i=0; i<arr.length;i++) {
			String value = arr[i];
			if(value.endsWith("s") || value.endsWith("d")) {
				System.out.println(value + " ");
			}
		}
		
		System.out.println("Print the Strings in reverse order");
		for(int i=arr.length-1; i>=0;i--) {
			
			String value = arr[i];
			System.out.print(value + " ");
			
		}
		
		System.out.println("Print the Strings in reverse order which contains a");
		for(int i=arr.length-1; i>=0;i--) {
			
			String value = arr[i];
			if(value.contains("a"))
			System.out.print(value + " ");
			
		}
		System.out.println();
		System.out.println("Print the Strings in reverse order which contains a and e");
		for(int i=arr.length-1; i>=0;i--) {
			
			String value = arr[i];
			if(value.contains("a") && value.contains("e"))
			System.out.print(value + " ");
			
		}

	}
}
