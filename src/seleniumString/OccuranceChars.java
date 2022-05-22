package seleniumString;

import java.util.HashMap;
import java.util.Map;

public class OccuranceChars {

	public static void main(String[] args) {

		String s = "Hi Iam an Indian. and I am proud to be an Indian";
		char stringArr[] = s.toCharArray();
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char c: stringArr) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c) +1);
			}else {
				hm.put(c, 1);
			}
		}
		System.out.println("String :" + hm);
		
		occurChar("Hi I am Automation Robot");
		occurWord("Hi I am Automation and Hi I am a Java and Hi I am Selenium");
		
	}
	
	public static void occurChar(String name) {
		
		char stringArr[] = name.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(char c: stringArr) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) +1);
				
			}else {
				charMap.put(c, 1);
			}
		}
		System.out.println("Occurance of Character in a String :" + charMap);
	}
	
public static void occurWord(String name) {
		
		String stringArr[] = name.split(" ");
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for(String c: stringArr) {
			if(wordMap.containsKey(c)) {
				wordMap.put(c, wordMap.get(c) +1);
				
			}else {
				wordMap.put(c, 1);
			}
		}
		System.out.println("Occurance of Word in a String :" + wordMap);
	}

}
