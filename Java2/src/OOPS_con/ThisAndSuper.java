package OOPS_con;



class Super {
	int a =20;
	public  void method() {
		System.out.println("this is parent property");
	}
}

public class ThisAndSuper extends Super{
		
	int a =30;
	public  void method() {
		System.out.println("this is child property");
		System.out.println(this.a);
		System.out.println(super.a);
		
	}

	public static void main(String[] args) {
		
		ThisAndSuper obj =new ThisAndSuper();
		// this will print child property 
		
		obj.method();
		obj.method();

	}

}
