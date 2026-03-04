package pattren;
import java.util.Scanner;

public class incre {

		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			int col = sc.nextInt();
		
			int g =0;
			for(int i =1; i<=row;i++) {
				for(int j =0 ; j<i;j++) {
					
					char z = (char)('l' + g);
					System.out.print(z+"  ");
					g++;
					}
					
					
				System.out.println("");
			}
		}


	}


/*
l  
m  n  
o  p  q  
r  s  t  u  
v  w  x  y  z  
*/
