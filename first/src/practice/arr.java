package practice;
import java.util.*;

public class arr {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of element: ");
		int a = sc.nextInt();
		int x[] = new int[a];
		for(int i =0; i <x.length;i++) {
			x[i]= sc.nextInt()	;
			}
		
		for(int i = a-1; i>=0;i--) {
		System.out.println(x[i]);
		
		}
	}

}
