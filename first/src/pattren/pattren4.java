package pattren;
import java.util.Scanner;

public class pattren4 {
	
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			int col = sc.nextInt();
			
			for(int i =row; i>=1;i--) {
				for(int j =col ; j>=i;j--) {
					
						System.out.print(j+ " " );
					
				}
				System.out.println("");
			}
		}


	}



