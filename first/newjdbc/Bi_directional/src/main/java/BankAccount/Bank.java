package BankAccount;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int id;
	private String Bankname;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Account> acc;
	
	public Bank() {}
	public Bank(int id, String bankname) {
	
		this.id = id;
		Bankname = bankname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankname() {
		return Bankname;
	}
	public void setBankname(String bankname) {
		Bankname = bankname;
	}
	public List<Account> getAcc() {
		return acc;
	}
	public void setAccs(List<Account> acc) {
		this.acc = acc;
	}
	
	
	

}
