package javavariables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraylistStreams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 30, 50, 60, 20);
		List<Integer> newlist = new ArrayList<Integer>();
		
		
		System.out.println(list);
		newlist = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(newlist);
		
		
		List<String> stringLi = Arrays.asList("MindTree", "Axix", "Automation", "Streams");
		List<String> newstringLi = new ArrayList<String>();
		
		newstringLi = stringLi.stream().filter(s -> s.length()>5 && s.length() <10).collect(Collectors.toList());
		System.out.println(newstringLi);
		
		stringLi.stream().filter(s -> s.length()>5 && s.length() <10).map(s->s).forEach(System.out::println);
		
		
		
		
		
	}

}
