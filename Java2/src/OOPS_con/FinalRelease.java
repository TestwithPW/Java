package OOPS_con;


abstract class FirstRelease {
	public void classroom() {
		System.out.println("Jan month offline class starts ....");

	}
	
	public abstract void online();
	public abstract void corp();
}

abstract class SecondRelease extends FirstRelease {

	@Override
	public void online() {
		System.out.println("Online class started....");
		
	}
}

class ThirdRelease extends SecondRelease{

	@Override
	public void corp() {
		System.out.println("Corp training started....");
		
	}
	
}

public class FinalRelease extends ThirdRelease{

	public static void main(String[] args) {
		
		FinalRelease f= new FinalRelease();
		f.classroom();
		f.online();
		f.corp();
	}

}
