package seleniumString;

public class FindWordinString {

	public static void main(String[] args) {

		String str = "I am a Web Designer, I am an Automation Test Engineer, I am a Developer";
		String[] strSplit = str.split(" ");
		
		String find = "am";
		int count = 0;
		
		
		
		
		
		for(int i =0; i< strSplit.length; i++) {
			
				String s = strSplit[i];
				if(s.contains(find)) {
					
					System.out.println("Found the word in the String");
					count++ ;
					//break;
					
				} 
			
		}
		System.out.println("Number of words " + count);
		
		findinString("I am , I was, I will", "was");
	}

	public static void findinString(String str , String toFind) {
		String[] strSplit = str.split(" ");
	
		for(String newstr : strSplit) {
			if(newstr.contains(toFind)) {
				System.out.println("Found the " + toFind + " word in the String" );
				break;
				
			}else {
				System.out.println("Not Found the " + toFind + " word in the string");
				
				
			}
		}
	}
}
