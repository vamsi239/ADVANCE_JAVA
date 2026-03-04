package practice;


import java.util.Scanner;

public class fib2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int t =0;
		int r =1;
		int fb  =0;
		System.out.println(t);
		System.out.println(r);
		for(int i =0; i < x-2;i++){
			fb = t + r;
			t = r;
			r =fb;
			System.out.println(fb);
		}
		
		
	}

}

