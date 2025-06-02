package String_in_Java;

public class String_SplitFunction3 {
	
	public static void main(String[] args) {

		String a= "abcd";
		String b =" xyz ";
		String c = "abcd xyz kmln 1234 4567";
		String d = "ABcD";
		
		
		System.out.println(a.length());
		
		System.out.println(b.startsWith("x"));
		
		System.out.println(c.endsWith("t"));
		
		System.out.println(b.trim());
		
		System.out.println(c.contains("kml"));
		
		System.out.println(a.contains("kml"));
		
		System.out.println(a.equals(b));
		
		System.out.println(a.equalsIgnoreCase("d"));
		
		System.out.println(a.charAt(3));
		
		System.out.println(d.charAt(1));
		
		System.out.println();
		
		// String[] arr = c.split(" ");
		
		

	}
}
