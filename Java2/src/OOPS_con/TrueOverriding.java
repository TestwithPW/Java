package OOPS_con;

class super3 { // Renamed from 'Super'
    int a = 20;
    public void method() { // Parent's non-static method
        System.out.println("this is parent property");
    }
}

public class TrueOverriding extends super3 { // Renamed from 'ThisAndSuper', extends 'super3'

     // Good practice to use @Override annotation
    int a =30;
    @Override
    public void method() { // Child's non-static method (overrides parent's)
    	
        System.out.println("this is child property");
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {

        TrueOverriding obj = new TrueOverriding();
        // This will print "this is child property" because of overriding.
        obj.method();

        super3 obj2 = new super3();
        obj2.method(); // Prints "this is parent property"

        super3 obj3 = new TrueOverriding(); // Polymorphism
        obj3.method(); // Prints "this is child property" (runtime polymorphism)
    }

}
