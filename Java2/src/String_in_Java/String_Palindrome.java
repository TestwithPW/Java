package String_in_Java;

public class String_Palindrome {
	
	public static void main(String[] args) {
		String s = "GrowSkillIT";
		
		String rev ="";
		
		
		for(int i =s.length()-1; i>=0;i--) {
			rev +=s.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(s)) {
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
		
		String s2="Tat";
		String ls = s2.toLowerCase();
		System.out.println(" ls : " + ls);
		String rev2 ="";
		String[] arr = ls.split("");
		
		for(int i = arr.length-1; i>=0;i--) {
			rev2+=arr[i];
		}
		System.out.println(rev2);
		if(rev2.equals(ls)) {
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
	
	
	}
}
