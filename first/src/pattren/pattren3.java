package pattren;
import java.util.Scanner;

public class pattren3 {
	
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			int col = sc.nextInt();
			
			for(int i =1; i<=row;i++) {
				for(int j =1 ; j<=i;j++) {
					
						System.out.print(j+ " " );
					
				}
				System.out.println("");
			}
		}


	}

/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 */

