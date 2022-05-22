package seleniumString;

public class CountwordsinString {

	public static void main(String[] args) {

		String s = "I am an automation Engineer which i have 3 years of am";
		int count =1;
		for(int i=0; i<s.length()-1; i++) {
			if( (s.charAt(i) == ' ') && (s.charAt(i+1)!= ' ') ) {
				count++;
				
			}
		}
		System.out.println("No of words in the String are :" +count );
		
		
		
		
			}
	


}
