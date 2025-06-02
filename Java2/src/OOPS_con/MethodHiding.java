package OOPS_con;

// Method Hiding
class Super2{
    int a = 20;
    public static void method() { // Parent's static method
        System.out.println("this is parent property");
    }
}

public class MethodHiding extends Super2{

    public static void method() { // Child's static method (hides parent's)
        System.out.println("this is child property");
    }

    public static void main(String[] args) {
    	MethodHiding obj = new MethodHiding();
        // When you call method using an object of the child class,
        // it will invoke the child's static method because of method hiding.
    	MethodHiding.method(); // Prints "this is child property"
        Super2.method();      // Prints "this is parent property"

        // Even if you use obj.method(), it will still call the child's static method
        // because the compiler resolves static method calls based on the reference type.
        obj.method(); // Prints "this is child property"
    }

}
