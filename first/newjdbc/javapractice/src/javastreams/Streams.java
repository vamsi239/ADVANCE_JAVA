package javastreams;
import java.util.*;
import java.util.stream.*;
public class Streams {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,3,5,61,5,56,7);
		
		List<Integer> result = list.stream()
				               .map(n->n+1)
				               .collect(Collectors.toList());
		double avg = list.stream()
			      .mapToInt(Integer::intValue)
				  .average()
				  .orElse(0.0);
		int sum = list.stream()
                  
                  .reduce(0,Integer::sum);
		int secoundmax =list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
		int maxx = list.stream()
				.max(Integer::compare)
				.orElse(0);
		System.out.println(maxx);
	}
}