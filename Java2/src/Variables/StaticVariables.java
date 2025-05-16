package Variables;

public class StaticVariables {
	
	
	
	
	public static int a =10 ;
	static int b=20;
	public static int c =30 ;

	public static void main(String[] args) {
		
		System.out.println(a*b*c);
		NonStaticVar obj = new NonStaticVar();
		System.out.println(obj.n2);
		System.out.println(obj.n1);

	}

}
