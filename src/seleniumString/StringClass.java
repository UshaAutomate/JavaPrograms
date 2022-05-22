package seleniumString;

public class StringClass {

	public static void main(String[] args) {

		String s = "Hello all good morining";
		System.out.println("Original String :" +s);
		String revs = "";
		
		for(int i=s.length()-1; i>=0; i--) {
		
			revs = revs + s.charAt(i);
			
		}
		System.out.println("Reverse String :" +revs);
		// Reverse String using StringBuffer
		
		StringBuffer s1= new StringBuffer(s);
		StringBuffer revstring = s1.reverse();
		System.out.println("reverse String :" +s1.reverse());
		
		String[] s2 = s.split(s);
		System.out.println("Split String :" +s2);
		
		if(revs.equals(s)) {
			System.out.println("String are same " );

		} else {
			System.out.println("String are not same " );

		}
		
		// reverse  int
		int  i = 1234;
		int revn = 0;
		while(i!=0) {
			revn = revn *10 + i % 10;
			i= i/10;
		}
		System.out.println("reverse number is " + revn);
		
		StringBuffer revi = new StringBuffer(String.valueOf(i));
		System.out.println(revi.reverse());
		
		String a = "$23.25";
		String an ="";
		for(int i1=1; i1<a.length(); i1++) {
		an = an+a.charAt(i1);
		}
		System.out.println(an);
		System.out.println(a.replace("$", ""));
		System.out.println(a.replaceAll("[^a-zA-Z0-9.]", ""));


		String s11 = "Testing Manual";
		String s21 = "Automation" ;
		System.out.println(s11.concat(s21));
		s11.split(" ");
		System.out.println(	);
		
		String date = "8/4/22";
		String[] d = date.split("/");
		for(int j=0; j< d.length; j++) {
			
			System.out.println(d[j]);
			
		}
		
		String newd = "java and selenium and manual and automation";
		String[] splitnewd = newd.split("and ");
		for(int j=0; j< splitnewd.length; j++) {
			
			System.out.println(splitnewd[j]);
			
		}
		
		System.out.println(newd.substring(1));
		
	}

	
		

		

	

}
