package hibernatelifecycle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LifeCycle {
	@Id
	private int id;
	private String name;
	
	public LifeCycle(){}
	public LifeCycle(int id, String name) {
	
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	

}
