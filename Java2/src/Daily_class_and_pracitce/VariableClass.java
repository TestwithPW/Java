package Daily_class_and_pracitce;

import AccessSpecifierModifier.AccSpec;

public class VariableClass  {
	
	
	
	public static void main(String[] args) {
		
		// Calling static var in another package using classname.varname
		System.out.println(AccSpec.a );  //  b & d cannot be called because protected or default cannot be called outside package
		
		
		// Calling Non-Static var in another package using obj ref
		
		AccSpec obj = new AccSpec();
		System.out.println(obj.a);  //  b & d cannot be called because protected or default cannot be called outside package
		
		// test commit d  
	
	}

}
