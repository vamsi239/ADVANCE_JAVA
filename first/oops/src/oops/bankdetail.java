package oops;
import java.util.Scanner;

public class bankdetail {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nam = sc.nextLine();
		double bal = sc.nextDouble();
		Bank obj=new Bank();
		
		obj.setname(nam);
		obj.setbal(bal);
		System.out.println("Account number: "+obj.getaccno());
		System.out.println("Account Holder name: "+obj.getname());
		System.out.println("Bank Balance: "+obj.getbal());
		System.out.println("Bank IFSC code: "+obj.getIFSC());
		System.out.println("Bank MICR code: "+obj.getMICR());
	

		
	}
	

}
