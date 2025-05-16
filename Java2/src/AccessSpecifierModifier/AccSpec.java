package AccessSpecifierModifier;

public class AccSpec {
	
	//Creating Static variables with different specifier
	
	public static int a =10 ; // Acc any where within the project or out site the package
	protected static int b = 20; // Acc within the Package to any class 
	private static int c=30; // Acc within the same class 
	   		static int d =40; // Acc within the package to any class 
	   
	   
	//Creating Non-Static variables with different specifier
	   		
   	public  int k =10 ; // Acc any where within the project or out site the package using obj ref
	protected  int l = 20; // Acc within the Package to any class using obj ref
	private  int m=30; // Acc within the same class using obj ref
	   		int n =40; // Acc within the Package to any class using obj ref
	
	   		/* Note - Protected and Default behaves same for calling any in class of a same package 
	   		 * but protected keyword supports inheritance where as default doesn't */

	public static void main(String[] args) {
		
		
		// To call the static variables in same class we use variable name 
		
		System.out.println(a+b+c+d); // 10+ 20+30+40 
		
		
		
		// To call non-static variables in the same class we use Obj ref variable 
		
		AccSpec obj = new AccSpec();
		
		System.out.println(obj.k + obj.l + obj.m + obj.n); // 10+20+30+40
	}

}
