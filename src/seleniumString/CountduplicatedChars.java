package seleniumString;

public class CountduplicatedChars {

	public static void main(String[] args) {
		String s = "Iam learning java programming";
		int count = 0;
		int orgLength = s.length();
		System.out.println(orgLength);
		
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)== s.charAt(i+1))	{
				
				count = count++;
				
			}
			
					
		
		
		}
		
		System.out.println("Number of duplicated characters" + count);

		
		int remLength = s.replace("a", "").length();
		System.out.println(remLength);
		int newLength = orgLength-remLength;
		System.out.println("Number of a duplicated characters" + newLength);

	}

}
