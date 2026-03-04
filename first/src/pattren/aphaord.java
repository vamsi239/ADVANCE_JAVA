package pattren;
import java.util.Scanner;

public class aphaord {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
	
		
		for(int i =1; i<row+1;i++) {
			for(int j =0 ; j<i;j++) {
				
				char z = (char)('A' +j);
				System.out.print(z+"  ");
				}
				
				

			System.out.println("");
		}
	}


}
/*
A  
A  B  
A  B  C  
A  B  C  D  
A  B  C  D  E 
*/