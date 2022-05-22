package javaPrograms;

public class FindDuplicatesinArray {

	public static void main(String[] args) {

// Find duplicate values in array
		String[] s = {"Selenium", "QTP", "Java", "Automation", "QTP", "JAVA"};
		
		for(int i=0; i< s.length; i++) {
			for(int j=i+1; j<s.length; j++)
			{
				if(s[i].equalsIgnoreCase(s[j])) {
					System.out.println(s[i]);
				}
			}
		}
		
		
		int[] i = {10,20,30,10, 40,20};
		
		for(int a =0; a<i.length;a++ ) {
			for(int b = a+1; b< i.length; b++) {
				if(i[a] == i[b]) {
					System.out.println("Duplicate numbers are: " + i[a]);
				}
			}
			
		}
	}
	

}
