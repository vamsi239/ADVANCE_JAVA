package javastreams;

import java.util.Arrays;
import java.util.List;

public class firstele {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ravi","sir","Vignan","savan","sanjan","Madav");
		
		String sname = names.stream()
				       .filter(s -> s.startsWith("s"))
				       .findFirst()
				       .orElse("null");
		System.out.println(sname);
		
	}
}
