package pattren;
import java.util.Scanner;

public class zero {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int z=1;
		
		for(int i =0; i<row;i++) {
			for(int j =0 ; j<col;j++) {
				
					System.out.print(z%2+"  ");
				z++;
				
			}
			System.out.println("");
		}
	}


}
/*

1  0  1  0  1  
0  1  0  1  0  
1  0  1  0  1  
0  1  0  1  0  
1  0  1  0  1  

*/
