package oneToone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Adhar {
	@Id
	private int id;
	private String loc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}
