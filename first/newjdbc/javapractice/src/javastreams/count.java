package javastreams;

import java.util.Arrays;
import java.util.List;

public class count {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,3,4,6,5,8,6,9,45,23,4,7);
		
	long count  = list.stream()
			     .filter(n -> n>7)
			     .count();
	
	System.out.print(count);
		
	}

}
