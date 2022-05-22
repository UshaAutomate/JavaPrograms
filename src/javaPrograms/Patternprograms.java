package javaPrograms;

public class Patternprograms {

	public static void main(String[] args) {

		//triangle pattern
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		
		//reverse triangle pattern
		
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		//both triangles
		
		for(int i=0; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
