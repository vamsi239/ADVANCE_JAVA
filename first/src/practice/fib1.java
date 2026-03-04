package practice;


import java.util.Scanner;

public class fib1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int t =0;
		int r =1;
		int fb  =0;
		while(fb<x) {
			fb = t + r;
			t = r;
			r =fb;
			System.out.println(fb);
		}
		
		
	}

}

