package OOPS_con;

public class Method_Overloading {
	
	public void results(int rollNo) {
		System.out.println(" Results For Roll no: " + rollNo);
		
	}
	
	public void results(String Name) {
		System.out.println(" Results For Student Name: " + Name);
		
	}
	
	public void results(int rollNo, String Name) {
		System.out.println(" Results For" + Name + "&  Roll no: " + rollNo);
		
	}
	
	public String results() {
		String Name = "Rachana";
		System.out.println(" Results For "+ Name);
		return Name;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overloading obj =new Method_Overloading();
		
		obj.results(70);
		obj.results("Rachana");
		obj.results(70, " Rachana");
		obj.results();
	}

}
