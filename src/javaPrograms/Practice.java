package javaPrograms;

public class Practice {

	public static void main(String[] args) {

		String s ="India is my Country #$%^";
		System.out.println("Given String : "+s);
		//return string without specical characters
		String noSplString = s.replaceAll("[^A-Za-z0-9]", " ");
		System.out.println("No Special Characters in a string :"+noSplString);
		
		//reverse of a string
		StringBuffer sb= new StringBuffer(s);
		System.out.println("Reverse of a Given String is :" + sb.reverse());
		String rev ="";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+ s.charAt(i);
		}
		System.out.println("Reverse of a Given String is :" + rev);
		
		//reverse each word in a string
		String[] word = s.split(" ");

		String revW = "";
		for(int i=0; i<=word.length-1; i++) {
		String w = word[i];
			for(int j=w.length()-1; j>=0; j--) {
				revW = revW + w.charAt(j) ;
			}			 
		}
		System.out.println("Reverse of Each word in a String :" +revW);
		
		// Convert ALl capital Letters
		String sUp = s.toUpperCase();
		System.out.println("String in Upper case: " +sUp);
		System.out.println("String in Lower case : " + s.toLowerCase());
		
		//retrieve all capital letters
		
	}

}
