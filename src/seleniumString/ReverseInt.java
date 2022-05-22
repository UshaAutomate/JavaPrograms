package seleniumString;

public class ReverseInt {

	public static void main(String[] args) {

		int i = 2566364;
		int rev = 0;
		System.out.println("Integer : " + i);
		while(i != 0) {
			
			rev= rev*10 + i % 10;
			i = i/10; 

		}
		System.out.println("Reverse Integer: " + rev);

		//reverse integer using string buffer
		int s = 345;
		System.out.println(new StringBuffer(String.valueOf(s)).reverse());
		//or
		StringBuffer sb = new StringBuffer(String.valueOf(s));
		StringBuffer s1 = sb.reverse();
		
		System.out.println("Reverse Integer: " + s1);

		
	}

}
