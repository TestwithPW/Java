package String_in_Java;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowel = 0, cons = 0;
		String s = "GrowSkill IT"; 
		System.out.println(s.length());
		System.out.println("This is using ASCII code logic in maths");
		
		
		if(s==null || s.isEmpty()) {
			
			System.out.println("There is no input in the sting or the string is empty so vowels:0 , consonents:0");
			return;
		}
		String lwst = s.toLowerCase();
		
		for (int i=0; i<lwst.length();i++) {
			
			char ch = lwst.charAt(i);
			
			if(ch>='a' && ch<='z') {
				
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u') {
					vowel++;
				}
				else {
					cons++;
				}
			}
		}
		
		System.out.println("The count of vowels : " + vowel + " And  the count of consonants :" + cons);
		
		
		System.out.println("This is using isLetter function of stings");
		
		int v =0; int c=0;
	
		for(int i=0; i<lwst.length();i++) {
			char ch = lwst.charAt(i);
			if(Character.isLetter(ch)) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v++;
				}else {
					c++;
				}
			}
		}
		System.out.println("vowels : " + v + ", consonants : " + c);
	}
}
