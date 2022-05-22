package seleniumString;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Hello all goodmoring";
		
		String rev ="";
		
		System.out.println(s);

		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		//using StringBuffter
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		//Diff bw String vs StringBuffter.. String immutable so cant reverse directly as SB is mutable so directly we can reverse


		
	}

}
