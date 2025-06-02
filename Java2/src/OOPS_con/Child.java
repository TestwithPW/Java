package OOPS_con;


class Parent{
	public void lands() {
		
		System.out.println("Lands");
	}
	
}

public class Child extends Parent { // This is single level inheritance 
	
	private static void stocks() {
		System.out.println("stocks");

	}

	public static void main (String[] args) {

		
		 System.out.println("This is child class object ");
		 Child c = new Child();
		 c.stocks();
		 c.lands();
		 
		 
		 System.out.println("This is Parent class object ");
		 Parent p = new Parent();
		 p.lands();
		 
		
	}
}
