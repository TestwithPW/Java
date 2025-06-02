package ReturnTypes;

public class Methods {
	
	public static int m1() {
		
		int a =10;
		int b = 20;
		int c =a+b;
		return c;
		
	}
	
	public String m2() {
		
		String a ="GSIT";
		String b = "QA";
		String c = a.concat(b);
		return c;
		
	}
	
	String m3() {
		
		String a ="GSIT2";
		String b = "QA2";
		String c = a.concat(b);
		return c;
		
	}

	public static void main(String[] args) {
		
		System.out.println(m1());
		
		Methods obj = new Methods();
		System.out.println(obj.m2());
		
		System.out.println(obj.m3());

	}

}
