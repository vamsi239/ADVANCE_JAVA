package pattren;
import java.util.Scanner;

public class pattren5 {
	
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			int col = sc.nextInt();
			int z=1;
			
			for(int i =1; i<=row;i++) {
				for(int j =1 ; j<=i;j++) {
					if(z<10) { 
						System.out.print(z+ "  " );
					}else {
						System.out.print(z+ " " );
					}
                       z++;
					
				}
				System.out.println("");
			}
		}


	}
/*
1  
2  3  
4  5  6  
7  8  9  10 
11 12 13 14 15 
 */



