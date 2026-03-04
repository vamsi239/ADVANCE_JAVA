package javastreams;

import java.util.*;
import java.util.stream.Collectors;

public class namestarts {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ravi","Ragu","Vignan","savan","Ranjan","Madav");
		
		List<String> result  = names.stream()
				               .filter(str -> str.startsWith("R")||str.startsWith("M"))
				               .map(str -> str.toUpperCase())
				               .sorted()
				               .collect(Collectors.toList());
		System.out.println(result);
	}
}
