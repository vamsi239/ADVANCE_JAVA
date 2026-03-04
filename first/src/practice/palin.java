package practice;

import java.util.Scanner;

public class palin {
	public static boolean pal(int j,int g,int x[]) {
		
		
		while(j<g) {
			if(x[j] != x[g]) {
				return false;
			}
			else {
				int k = x[j];
				int temp =k;
				int rev =0;
				while (temp > 0) {
	                int rem = temp % 10;
	                rev = rev * 10 + rem;
	                temp /= 10;
	            }
				if(temp != rev) {
					return false;
				}
			}
			j++;
			g--;
		}
		return true;

	}
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of element: ");
		int a = sc.nextInt();
		int x[] = new int[a];
		for(int i =0; i <x.length;i++) {
			x[i]= sc.nextInt()	;
			}
		int j =0;
		int g =a-1;
		
		System.out.println(pal(j,g,x));
		
}

}