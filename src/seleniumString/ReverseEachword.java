package seleniumString;

public class ReverseEachword {

	public static void main(String[] args) {

		String originalString = "Welcome to Selenium pro";
		String reverseString ="";
		
		System.out.println(originalString);
		
		String[] words= originalString.split(" ");
		
		for(String word:words) {
			String reverseWord="";

			for(int i=word.length()-1; i>=0; i--) {
				
				reverseWord= reverseWord + word.charAt(i);
			}
			
			reverseString = reverseString + reverseWord + " " ;
		}
		
		System.out.println(reverseString);
	}

}
