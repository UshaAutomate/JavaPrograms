	
package seleniumString;

public class RemovesplChar {

	public static void main(String[] args) {

		String s = ":$%%%^ Learn Selenium ***$% properly";
		
		String rep = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(rep.trim());
				
		String s1= "AAAAaaaaaa java selenium aaaa  testing";
		System.out.println(s1.replace("aaaa", "maven"));
	}

}
