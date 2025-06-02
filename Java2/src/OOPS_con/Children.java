package OOPS_con;

// This is hierarchical one class extended by multiple classes

class Father {
	
	public void land() {
		System.out.println("Lands");
	}
}

class Child1 extends Father{
	public void shares() {
		System.out.println("Shares");

	}
}

public class Children extends Father {
	
	public void house() {
		System.out.println("House");

	}

	public static void main(String[] args) {
		
		System.out.println("This is Children Obj");
		Children ch = new Children();
		ch.house();
		ch.land();
		
		
		System.out.println("This is Child1 Obj");
		Child1 c = new Child1();
		c.shares();
		c.land();
		
		
		System.out.println("This is Father Obj");
		Father f= new Father();
		f.land();
	
		
		

	}

}
