package MethodsInJava;

class Jan {
	public void roi() {
		System.out.println("Rate of interest : 8.1%");
	}
}

class Feb extends Jan{
	public void roi() {
		System.out.println("Rate of interest : 7.92%");
	}
}

class Mar extends Feb {
	public void roi() {
		System.out.println("Rate of interest : 8.02%");
	}
}

class Apr extends Mar{
	public void roi() {
		System.out.println("Rate of interest : 8.2%");
	}
}

public class MethodOverriding1 extends Apr{
	public void roi() {
		System.out.println("Rate of interest : 8.4%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding1 obj = new MethodOverriding1();
		
		obj.roi();
		
		Mar m = new Mar();
		m.roi();

	}

}
