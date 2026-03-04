package e_commerce;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
	@Id
	private int orders_id;
	private String or_date;
	
	@ManyToOne
	private Delivery d;
	@ManyToOne
	private Customer c;
	
	public Orders() {}
	
	public Orders(int orders_id, String or_date) {
		
		this.orders_id = orders_id;
		this.or_date = or_date;
	}
	
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}
	public String getOr_date() {
		return or_date;
	}
	public void setOr_date(String or_date) {
		this.or_date = or_date;
	}
	public Delivery getD() {
		return d;
	}
	public void setD(Delivery d) {
		this.d = d;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	
	
	
	
}
	
	
	
	