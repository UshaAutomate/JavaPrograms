package javaPrograms;

import java.util.stream.IntStream;


public class PrintnumbersWithoutloop {

	public static void main(String[] args) {


		//print 1 to 100 without using loops
		//1. by using recrsive function ie calling a function in its same function
		//2. Using streams
		//printnum(1);
		PrintnumbersWithoutloop l = new PrintnumbersWithoutloop();
		
		//l.printnum(1, 50);
		


		IntStream.range(1, 101).forEach(e -> System.out.println(e));
			
		}
	public static void printnum(int num) {
		
		if(num <= 100) {
			System.out.println(num);
			num ++;
			printnum(num);
		}

	}
	
	public void printnum(int sNum, int eNum) {
		
		if(sNum <= eNum) {
			System.out.println(sNum);
			sNum++;
			printnum(sNum, eNum);
		}
	}

}
