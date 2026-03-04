package practice;

public class poly {

	public static int arearec(int a, int b) {
		int c = a*b;
		return c;
	}
	public static int areasq(int a) {
		int c = a*a;
		return c;
	}

public static double areacir(double r) {
	double c = (22/7)*(r*r);
	return c;
}

public static double areatri(int a, int b) {
	double c = (0.5)*a*b;
	return c;
}

public static void main(String[] args) {
	
	System.out.println(arearec(2,3));
	System.out.println(areasq(2));
	System.out.println(areacir(3.5));
	System.out.println(areatri(2,3));
}

}

