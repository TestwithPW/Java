package OOPS_con;

public class Encapsulated {
	
	
	private int age ;
	private String name;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		 if(age <18 || age >64) {
			 throw new RuntimeException("The age should be between 18 to 64");
		 }
	}
	
	public String getname() {
		return name;
		
	}
	
	public void setname(String name) {
		
		if (name.length()<4 || name.length()>10) {
			throw new RuntimeException("The name field should accept 4 to 10 characters");
		}
		
	}
	
	

}
