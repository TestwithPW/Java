package String_in_Java;

public class ParseKeyword {

	public static void main(String[] args) {
		
		String s = "200";
		
		int a = Integer.parseInt(s);
		
		System.out.println( a + 100);
		
		
		float f = Float.parseFloat(s);
		
		System.out.println(f + 2);
		
		double d = Double.parseDouble(s);
		
		System.out.println(d + 2.5);

	}

}
