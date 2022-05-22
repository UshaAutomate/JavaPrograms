package seleniumString;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String s = "Java is a programming language";
		
		//print string without duplicates using string builder
		
		StringBuilder sb = new StringBuilder();
		
		s.chars().distinct().forEach(c -> sb.append((char)c));
		System.out.println(sb);
		
		/*for(int i=0; i< s.length(); i++) {
			IntStream c = s.chars().distinct();
			sb.append(s.chars().distinct());
			System.out.println(sb);
		}*/
		
		//using 
		
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			int index = s.indexOf(ch, i+1);
			if(index == -1)
			{
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		
		// using arrays

		char[] arr = s.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			boolean repeat = false;

			for(int j=i+1; j<s.length(); j++) {
				if(arr[i] == arr[j]) {
					repeat = true;
					break;
				}
			}
			if(!repeat) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);

		
		//using hashset which doesnt strore duplicate elements
		
		StringBuilder sb4 = new StringBuilder();
		Set<Character>  set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
			for(char c: set) {
				sb4.append(c);
			}
			System.out.println(sb4);

			distinctChars("India is my country");
		


}
	
	public static void distinctChars(String string) {
		
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i =0; i< string.length(); i++) {
			set.add(string.charAt(i));
		}
		for(char c: set) {
			sb.append(c);
		}
		System.out.println(sb);
		
	}
}
