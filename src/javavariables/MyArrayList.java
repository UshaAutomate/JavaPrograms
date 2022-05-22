package javavariables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayList {

	public static void main(String[] args) {

		int[] a = new int[4]; // static array
		
		// dynamic arrray -- arraylist
		//In arraylist we can add any number of elements dynamcally
		// values are stored on basis of index
		// can have duplicate values
		//not sychnozied or thread safe so its slow
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(12);
		ar.add(56);
		ar.add(36);
		
		for(int i=0; i< ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("Array listed values***********");
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(12);
		ar1.add(556);
		ar1.add(346);
		
		
		//add all method
		ar.addAll(ar1);
		System.out.println("Values are :" +ar1);
		
		for(int i=0; i< ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("added all***********");

		// retain method -- common elements only
		ar.retainAll(ar1);
		for(int i=0; i< ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("retain***********");
		
		// creating employee values from employee classs
		Employee e1 = new Employee(1 , "tome", "qa");
		Employee e2 = new Employee(2 , "peter", "dev");
		Employee e3= new Employee(3 , "john", "prod");
		
		ArrayList<Employee> er = new ArrayList<Employee>();
		er.add(e1);
		er.add(e2);
		er.add(e3);
		
		//iterating values
		Iterator<Employee> ev = er.iterator();
		while(ev.hasNext()) {
			Employee emp = ev.next();
			System.out.println(emp.eid  + "  : " + emp.empName  + "  :" + emp.dept);
			
			
		}
		
		

		Collections.sort(ar1);
		System.out.println("Sorted Array  " + ar1);
		
	}
	
	
}
