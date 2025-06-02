package OOPS_con;

// This is Multi-level Inheritance
class Grandparents{ // This is base class
	 
	 public void land() {
		
		 System.out.println("Lands");
	}
 }


class Parents extends Grandparents{ // This is Intermediary class
	 public void gold() {
		
		 System.out.println("Gold");

	}  
 }

public class Child2 extends Parents{ // This is Derived class
	
	public void shares() {
		
		System.out.println("Shares");

	}
	
	public static void main(String[] args) {
		
		System.out.println("This is chilld Object"); // This can access child2 & parent as well as grandparent as parent has extended gp properties
		Child2 ch = new Child2();
		ch.shares();
		ch.gold();
		ch.land();
		
		
		System.out.println("This is Parent Object"); // This can access parent properties and grandparent properties after extending it
		Parents p = new Parents();
		p.gold();
		p.land();
		
		System.out.println("This is Grandparent Object"); // This can access grandparent properties only it has not extended any class
		Grandparents g = new Grandparents();
		g.land();
		
		
	}
}
