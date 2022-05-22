package javavariables;

import java.util.Hashtable;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableProgram {

	public static void main(String[] args) {
		
		//Varaibles can store in the form of key and value format
		//No Null and Null values cant be allowed
		//Its slow because HashTable Synchronized and Thread safe 

		
	Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
	ht1.put(1, "RestAssure");
	ht1.put(2, "API");
	ht1.put(3, "AWS");
	ht1.put(4, "Testing");
	//ht1.put(5, null);
	
	System.out.println(ht1);
	
	Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

	ht2 = (Hashtable<Integer, String>) ht1.clone();
	System.out.println(ht2);
	
	for(Entry<Integer, String> s :  ht1.entrySet()) {
		System.out.println(s);
	}
	
	if(ht1.equals(ht2)) {
		System.out.println("Both are Equal");
	}
	
	System.out.println(ht1.get(3));
	
	//fetching Using Enumeration

	Enumeration<String> e = ht1.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		
	}
	Set s = ht1.entrySet();
	System.out.println(s);
	
			
			


	}

}
