package pattren;
import java.util.Scanner;

public class oddev {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		
		for(int i = 1; i<=row;i++) {
			for(int j =1 ; j<=i;j++) {
				
					System.out.print(j%2+"  ");
				
				
			}
			System.out.println("");
		}
	}


}
/*
1  
1  0  
1  0  1  
1  0  1  0  
1  0  1  0  1  
*/
