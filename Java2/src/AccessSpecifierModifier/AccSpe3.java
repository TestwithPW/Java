package AccessSpecifierModifier;

public class AccSpe3 {
	
	

	public static void main(String[] args) {
		
		System.out.println(AccSpec.a +AccSpec.b +AccSpec.d); // calling variables from another class of same package 
		
		AccSpec obj = new AccSpec();
		System.out.println(obj.k + obj.l+ obj.n);
		 
	}

}
