package pattren;
import java.util.Scanner;

public class pattren2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int z=1;
		
		for(int i =1; i<=row;i++) {
			for(int j =1 ; j<=col;j++) {
				if(z<10) {
				System.out.print(z+"  ");}
				else {
					System.out.print(z+" ");
				}
				z++;
			}
			System.out.println("");
		}
	}

}
