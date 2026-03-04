package oops;
import java.util.*;

public class Tempconverter {
	
	
	
	public static double celcius( double y) {
		double c = (y-32)*5/9;
		return c;
		
	}
    public static double fahrenheit( double y) {
    	double f = (y*9/5)+32;
    	return f;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();   // temperature
        char s = sc.next().charAt(0);
		
		if(s == 'f' || s=='F') {
			System.out.println("converted into celsius : "+celcius(a)+"°C");
			
		}else if(s=='c'||s=='C') {
			System.out.println("converted into fahrenheit : "+fahrenheit(a)+"°F");
			
		}else {
			System.out.println("Wrong input");
		}
		
	
	
	    }
	

}
