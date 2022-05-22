package javavariables;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedlistprogram {

	public static void main(String[] args) {


		//linkedlist is dynamic nature hense insertion and deletion can be done easily
		//not sychrnozied ie not thread safe
		//it allows null values and duplicate values
		//in linkedlist manipulation is easy because there is no shifting of variables;
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(13);
		l.add(45);
		l.add(33);
		l.addFirst(5);
		l.addLast(69);
	//	l.add();
		//l.add(null);
		l.add(13);
		l.add(13);

		
		
		System.out.println(l);
		//for(int i: l) {
			//System.out.println(i);
		//}
		
		
		System.out.println("**********");

		Iterator<Integer> it = l.descendingIterator(); //decreasing order
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		System.out.println("**********");

		for(int i=0; i< l.size(); i++) {
			System.out.println(l.get(i));

		}
		System.out.println("***********");

		System.out.println(l);

		Collections.sort(l); // for increasing order
		l.remove(6);
		System.out.println(l);

		
	}

}
