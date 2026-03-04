package e_commerce;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Products {
	@Id
	private int product_id;
	private String product_name;
	
	public Products(int product_id, String product_name) {
	
		this.product_id = product_id;
		this.product_name = product_name;
	}
	@ManyToMany
	private List<Orders> order;
	@ManyToOne
	private Catagories cats;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public List<Orders> getOrder() {
		return order;
	}
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	public Catagories getCats() {
		return cats;
	}
	public void setCats(Catagories cats) {
		this.cats = cats;
	}
	
	
	

}
