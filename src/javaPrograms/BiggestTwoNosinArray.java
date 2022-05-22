package javaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class BiggestTwoNosinArray {

	public static void main(String[] args) {

		int[] numbers = {10,20,30,40,50,60,70,80,65,77};
		Arrays.sort(numbers);
		
		System.out.println("Biggesst Number: " + numbers[numbers.length-1]);
		System.out.println("Second Biggest Number : " + numbers[numbers.length-2]);
		
		System.out.println(Arrays.toString(numbers));
	}

}
