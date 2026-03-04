package oops;

public class Bank {

	private int accno =759234865 ;
	private String name="";
	private String IFSC = "SBIN0S1202";
	private double Balance;
	private int MICR =  1234;
	
	public int getaccno() {
		return accno;
	}
	public String getname() {
		return name;
	}
	public String getIFSC() {
		return IFSC;
	}
	public double getbal() {
		return Balance;
	}
	public int getMICR() {
		return MICR;
	}
	
	
	public void setname(String name) {
		this.name = name;
	}
	public void setbal(double Balance) {
		this.Balance =Balance;
	}
	
}
