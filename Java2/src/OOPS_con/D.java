package OOPS_con;
// This is Hybrid inheritance
class A{
	public void a() {
		
		System.out.println("This is A property");
	}
}

class B extends A{
	public void b() {
		
		System.out.println("This is B property");
	}
}

class C extends A{
	public void c() {
		
		System.out.println("This is C property");
	}
}

public class D extends B{
	public void d() {
		System.out.println("This is D property");
	}

	public static void main(String[] args) {
		
		
		System.out.println("This is D obj");
		D od = new D();
		od.a();od.b();od.d();
		
		System.out.println("This is C obj");
		C oc= new C();
		oc.a();oc.c();
		
		System.out.println("This is B obj");
		B ob = new B();
		ob.a();
		ob.b();
		
		System.out.println("This is A obj");
		A oa =new A();
		oa.a();
		
		
	}

}
