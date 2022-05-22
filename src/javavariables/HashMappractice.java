package javavariables;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMappractice {

	public static void main(String[] args) {

		//It can store the values in the form of Key and Values
		// Its not synchronized,not thread safe
		//Hashmap impleming from map interface
		//Key can have one null key and Values can be duplicated and Null values
		//if more than one null key it will replace the old value with new value
		
		//It maintains no order
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "QTP");
		hm.put(2,  "Selenium");
		hm.put(3,  "Testing");
		 
		System.out.println(hm);
		

		// fetching the values using for loop
		for(int i= 1; i< hm.size()+1; i++) {
			System.out.println("For loop: " + hm.get(i));
		}
		
		//using Map
		
		
		System.out.println("********");
		
		for(Entry m : hm.entrySet() ){
			System.out.println(m.getKey() + " " + m.getValue());
			
			
		}
		
		System.out.println("********");

		HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee(1, "TOm", "Testing");
		Employee e2 = new Employee(2, "Lina", "Dev");
		Employee e3 = new Employee(3, "Sam", "Prod");
		
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		for(Entry m1: hm1.entrySet()) {
			int key =  (int) m1.getKey();
			Employee e =  (Employee) m1.getValue();
			
			System.out.println(key + "Key Info " );
			System.out.println(e.eid + " " + e.empName  + " " + e.dept);
		}
		
		
		
		
		
		
		
		
			}

}
