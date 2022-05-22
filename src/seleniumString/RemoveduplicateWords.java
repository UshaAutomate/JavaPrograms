package seleniumString;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveduplicateWords {

	public static void main(String[] args) {

		String s = "I am a Web Designer I am a Web Developer I am a";
		String[] wordSplit = s.split(" ");
		StringBuilder sb = new StringBuilder();
		// using hashset remove duplicate words n store
		Set<String> setString = new LinkedHashSet<String>();
		
		for(String a:wordSplit) {
			setString.add(a);
		}
		for(String n:setString) {
			sb.append(n);
		}
		System.out.println(sb);
		System.out.println(setString);
		
		
		
		//Duplicate Character remove
		Set<Character> charSplit = new LinkedHashSet<Character>();
		StringBuilder sb1 = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			
			charSplit.add(s.charAt(i));
		
			
		}
		for(char ch:charSplit) {
			sb1.append(ch);
		}
		System.out.println(charSplit);
		System.out.println(sb1);
			
	}

}
