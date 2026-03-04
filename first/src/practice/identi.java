package practice;
import java.util.Scanner;

public class identi {
	public static boolean id(int arr1[],int arr2[]) {
		
		for(int i=0; i <arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}

	
	public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter size of element 1st array: ");
			int a = sc.nextInt();
			System.out.print("Enter size of element 2nd array: ");
			int b = sc.nextInt();
			
			if(a==b) {
			
			int x[] = new int[a];
			System.out.println("Enter elements of 1st array: ");
			for(int i =0; i <x.length;i++) {
				x[i]= sc.nextInt()	;
				}
			System.out.println("End of 1st array: ");
			
			int y[] = new int[a];
			System.out.println("Enter elements 2nd array: ");
			for(int i =0; i <y.length;i++) {
				y[i]= sc.nextInt()	;
				}
			System.out.println("End of 2nd array: ");
			System.out.println(id(x,y));
			}else {
				System.out.println(false);
			}
			

	}

}
