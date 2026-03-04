package pattren;
import java.util.Scanner;

public class Aphlaback {


		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			int col = sc.nextInt();
		
			
			for(int i =1; i<=row;i++) {
				for(int j =0 ; j<i;j++) {
					
					char z = (char)('Z' - j);
					System.out.print(z+"  ");
					}
					
					

				System.out.println("");
			}
		}


	}

/*
Z  
Z  Y  
Z  Y  X  
Z  Y  X  W  
Z  Y  X  W  V 
*/
