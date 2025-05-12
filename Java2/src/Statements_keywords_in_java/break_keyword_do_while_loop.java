package Statements_keywords_in_java;

public class break_keyword_do_while_loop {
	
	public static void main(String[] args) {
		
		
		int i =1 ;
		
		do {
			
			System.out.println("Value of i : " + i);
			i++;
			if(i==4) {
				break;	
			}
			
		}
		while(i<=5);
		
		System.out.println("first loop stopped at i=4 ");
		System.out.println(" ");
		System.out.println("Second loop started at i=4 ");
		do { // this will start from i = 4
			
			System.out.println("Value of i : " + i);
			i++;
			if(i==8) {
				break;	
			}
			
		}
		while(i<=10);
		System.out.println("Second loop ended at i=8 ");
		
		
		
		
	}

}
