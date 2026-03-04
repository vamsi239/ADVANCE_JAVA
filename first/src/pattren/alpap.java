package pattren;
import java.util.Scanner;

public class alpap {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
	
		
		for(int i =0; i<row;i++) {
			for(int j =0 ; j<col;j++) {
				
				char z = (char)('A' + j);
				System.out.print(z+"  ");
				}
				
				

			System.out.println("");
		}
	}


}
/*
A  B  C  D  E  
A  B  C  D  E  
A  B  C  D  E  
A  B  C  D  E  
A  B  C  D  E  
*/