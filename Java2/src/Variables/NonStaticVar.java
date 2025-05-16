package Variables;

public class NonStaticVar {

	public int n1 = 20;
	int n2 = 40;
	
	String  st = "aaa a";
	
	
	public static void main(String[] args) {
		
		NonStaticVar obj = new NonStaticVar();
		System.out.println(obj.n1 + obj.n2);
		System.out.println(obj.st);
		
		

	}

}
