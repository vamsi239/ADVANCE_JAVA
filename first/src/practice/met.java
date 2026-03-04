package practice;

public class met {
	 
	public static void sum1() {
		int a= 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
	}
	
	public static int sum(int a,int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		
		sum1();
		System.out.println(sum(12,20));
	}

}
