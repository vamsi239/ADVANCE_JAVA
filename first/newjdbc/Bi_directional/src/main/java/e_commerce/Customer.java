package e_commerce;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int customer_id;
	private String name;
	
	
	public Customer(int customer_id, String name) {
		
		this.customer_id = customer_id;
		this.name = name;
	}
	public Customer() {
		
	}

	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

		

}
