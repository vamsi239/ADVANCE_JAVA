package javastreams;

import java.util.Arrays;
import java.util.List;

public class even {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,3,4,6,5,8,6,9,45,23,4,7);
		list.stream()
		.filter(n -> n%2 == 0)
		.map(n -> n*10)
		.forEach(System.out::println);
	}

}
