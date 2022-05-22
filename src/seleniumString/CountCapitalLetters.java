package seleniumString;

public class CountCapitalLetters {

	public static void main(String[] args) {

		String s = "I am A Web DeveLoper Designer Tester";
		int count =0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count++;
				//System.out.println(s.charAt(i));
			}
		}
		System.out.println("Capital Letters count in the String: " +count);
		
		//2 approach
		int count1 =0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				count1++;
			}
		}
		System.out.println(count1);
		//count small letters
		
		int count3 = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				count3++;
			}
			
		}
		System.out.println("small letters count in the String :" + count3);
	}

	

}
