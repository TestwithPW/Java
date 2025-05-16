package AccessSpecifierModifier;

public class AccSpe2 {
	
	

	public static void main(String[] args) {
		
		// calling variables of the AccSpec class from the same package 
		
		
		// calling static variables using classname.variablename
		
		System.out.println(AccSpec.a+ AccSpec.b+ AccSpec.d ); // var c is final so it won't be called
		
		
		// calling non-static variables using obj ref
		
		AccSpec obj = new AccSpec();
		System.out.println( obj.k+ obj.l+ obj.n); // var m is final so 
		
		
		
		
		

	}

}
