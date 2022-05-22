
package seleniumString;

public class string {

	public static void main(String[] args) {

		String s = "Hello all goodmoring" ; 
		System.out.println(s);
		/*for(int i=0; i< s.length(); i++)
		{
		System.out.println(s.charAt(i));
		}*/
		System.out.println(s.indexOf("l"));// first occurance of l
		int occur = s.indexOf("l");
		System.out.println(s.indexOf("l", occur+1)); // 2nd occurance of l
	//	System.out.println(s.indexOf("l", s.indexOf("l", s.indexOf("l")+1)+1 )); //3rd occurance of l
	//	System.out.println(s.indexOf("l",  s.indexOf("l", s.indexOf("l", s.indexOf("l")+1)+1)+1)); //4th occurance of l
		
		System.out.println(s.indexOf("all"));
		
		System.out.println(s.trim()); // remove space after quotes but not inside the string
		System.out.println(s.replace(" ", "")); // remove spaces inside the string and for replacing
		

		String s1 = "hello all goodmoring";
		System.out.println(s.equals(s1)); // to compare both stirngs
		System.out.println(s.equalsIgnoreCase(s1));

		System.out.println(s.substring(0, 2));
		
		
		//split the string
		String newString = "Hello_all_good_morning";
		String splitS[] = s.split(" ");
		
		for(int i=0; i <splitS.length; i++) {
			System.out.println(splitS[i]);

		}
		
		System.out.println(s.concat(newString));//combing two strings
		
		int a = 100;
		int b = 200;
		String newString1 = "String";
		
		System.out.println(a+b+s+ newString1);
		
		String revS = "Hello";

	// Reverse of String
		for(int i=0; i <=revS.length()-1; i++) {
			System.out.println(revS.charAt(i));
		}
		
		for(int i=revS.length()-1; i >=0; i--) {
			System.out.println(revS.charAt(i));
		}
		
		String rev = "";
		for(int i=s.length()-1; i >=0; i--) {
			rev = rev+ s.charAt(i);
		}
		
		System.out.println(rev);
		
		// print string from I
		
		
		String newone = "Hello I want pro on Testing";
		
		int sub = newone.indexOf("I");
		String subS = newone.substring(sub);
		System.out.println(subS);


		
		
		
		
		



		
		


		
		

		
		
		


		


		
	}

}
