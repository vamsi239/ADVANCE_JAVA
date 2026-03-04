package Banking;

public class BankAcc {
	private double amt =2345;
	private short pin =3456;
	
	public double getAmt(short pin) {
		if(this.pin==pin) {
		return amt;
		}
		return -1;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	

}
