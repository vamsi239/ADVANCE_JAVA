package pattrens;

public class reverse {
	
	    public static void main(String[] args) {

	        int n = 5;

	        for (int i = n; i >= 1; i--) {

	            // print spaces
	            for (int s = 1; s < n ; s++) {
	                System.out.print(" ");
	            }

	            // print numbers
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j + " ");
	            }

	            System.out.println();
	        }
	    }
	}


