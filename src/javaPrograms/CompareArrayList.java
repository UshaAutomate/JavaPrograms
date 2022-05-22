package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {

		//to compare first we need to sort and do modifications
		ArrayList<Integer> al1= new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 60));
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(20,10,30,50));
		
		Collections.sort(al1);
		Collections.sort(al2);
		 
		System.out.println(al1);
		System.out.println(al2);
		

		//equal method to compare two arrays its true if its same otherwise its fail
		System.out.println(al1.equals(al2));
		
		//compare two arrays to find out the additional elements
		
//al1.removeAll(al2);
//System.out.println(al1);
		
		// findout missing elements
		
		al2.removeAll(al1);
		System.out.println(al2);

		// findout common elements
		
		ArrayList<String> names1 = new ArrayList<String>(Arrays.asList("Java", "Selenium", "Phython", "Ruby"));
		ArrayList<String> names2 = new ArrayList<String>(Arrays.asList("Java", "Selenium", "Phython", "C#"));
		

		
		names1.retainAll(names2);
		System.out.println(names1);


		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num1.add(20);
		num1.add(52);
		num1.add(2);
		num1.add(36);
		
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(20);
		num2.add(552);
		num2.add(2);
		num2.add(366);
		
		num1.removeAll(num2);
		System.out.println(num1);
		

		
		
		
		
	}

}
