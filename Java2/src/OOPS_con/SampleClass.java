package OOPS_con;

public class SampleClass {

	public static void main(String[] args) {

		Encapsulated obj = new Encapsulated();
		
		obj.setAge(22);
		obj.setAge(18);
		obj.setAge(19);
		
		
		obj.setname("Manas");
		obj.setname("Mana");
		obj.setname("Man"); // it will throw exception and further execution will stop 
		obj.setname("Mana");
		
		obj.setAge(66);
		

	}

}
