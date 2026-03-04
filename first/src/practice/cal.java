package practice;

import java.util.*;
public class cal {

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}
	public static int pro(int a, int b) {
		int c = a * b;
		return c;
	}
	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}
	public static int rem(int a, int b) {
		int c = a % b;
		return c;
	}
	public static int div(int a, int b) {
		int c = a / b;
		return c;
	}
	public static double dis(int a, int b) {
		double c =  a * b/100;
		return c;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter what you want to caluclate For example for sum : sum, Substration: sub,pro,div,rem,dis. After that enter two numbers you want to do");
		
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		
		switch(t) {
		
		case "sum":
		{
			System.out.println(sum(x,y));
		    break;
		}
		case "sub":
		{
			System.out.println(sub(x,y));
		    break;
		}
		case "pro":
		{
			System.out.println(pro(x,y));
		    break;
		}
		case "rem":
		{
			System.out.println(rem(x,y));
		    break;
		}
		case "div":
		{
			System.out.println(div(x,y));
		    break;
		}
		case "dis":
		{
			System.out.println(dis(x,y));
		    break;
		}
		}
	}
}

