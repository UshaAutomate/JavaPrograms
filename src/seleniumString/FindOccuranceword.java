package seleniumString;

public class FindOccuranceword {

	public static void main(String[] args) {

		String s = "abcabcabc123abc345abc";
		String[] splicStr = s.split("abc");
		int count = 0;
		
		System.out.println(splicStr.length);
		for(String a: splicStr) {
			count++;
		}
		System.out.println(count);
		
		findOccur("123abcabc345abc", "abc");
		findOccur("123abc123abc123asd456", "456");
	}

	public static void findOccur(String s, String find) {
		int count =0;
		String[] split = s.split(find);
		for(String Fword: split) {
			count++;
		}
		System.out.println(count);
	}
}
