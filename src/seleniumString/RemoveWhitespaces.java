package seleniumString;

public class RemoveWhitespaces {

	public static void main(String[] args) {

		String s = "  Hello all   " 
				+ "\ngoodmorning";
		
		System.out.println(s.replace(" ", "")); //direct method
		
		//another method to remove spaces and tabs
		String noWhiteSpace = "";
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i)!= ' ' && s.charAt(i) != '\t') {
				noWhiteSpace = noWhiteSpace+s.charAt(i);
				
			}
			//System.out.println(noWhiteSpace);
			
		}
		System.out.println(noWhiteSpace);

	}

}
