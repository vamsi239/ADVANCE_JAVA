package javastreams;

import java.util.Arrays;
import java.util.List;

public class sortnames {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ravi","Ragu","Vignan","savan","Ranjan","Madav");
		
		names.stream()
		.map(str -> str.toUpperCase())
		.sorted()
		.forEach(System.out::println);
	}

}
