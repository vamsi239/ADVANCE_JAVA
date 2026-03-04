package e_commerce;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Delivery {
	@Id
	private int delivery_id;
	private String Type;
	private String stats;
	
	public int getDelivery_id() {
		return delivery_id;
	}
	public void setDelivery_id(int delivery_id) {
		this.delivery_id = delivery_id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getStats() {
		return stats;
	}
	public void setStats(String stats) {
		this.stats = stats;
	}
	
}
