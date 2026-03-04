package practice;

import java.util.Arrays;

public class sort {
	public static void main(String[] args) {
		
		int a[] = {2,8,7,3,1,3,0,4,2,9};
		
		Arrays.sort(a);
		for(int i =0 ; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
