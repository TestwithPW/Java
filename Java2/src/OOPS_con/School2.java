package OOPS_con;

interface Software{
	public void startDate();
	public void endDate();
	public void fee();
}

class School1 implements Software{

	@Override
	public void startDate() {
		System.out.println("18 June 2024");
		
	}

	@Override
	public void endDate() {
		System.out.println("18 Dec 2024");
		
	}

	@Override
	public void fee() {
		System.out.println("50000");
		
	}
	
	
	
}
public class School2 implements Software{
	
	@Override
	public void startDate() {
		System.out.println("20 June 2025");
		
	}

	@Override
	public void endDate() {
		System.out.println("20 Dec 2025");
		
	}

	@Override
	public void fee() {
		System.out.println("80000");
		
	}
	
	
	
	
	public static void main(String[] args) {

		Software s1 = new School1(); // upcasting 
		s1.startDate();
		s1.endDate();
		s1.fee();
		
		Software s2 = new School2(); // upcasting 
		s2.startDate();
		s2.endDate();
		s2.fee();

	}

	

}
