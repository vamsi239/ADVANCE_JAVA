package e_commerce;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Catagories {
	@Id
	private int cat_id;
	private String cat_name;
	private String cat_type;
	
	public Catagories() {
		
	}
	
	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	public String getCat_type() {
		return cat_type;
	}

	public void setCat_type(String cat_type) {
		this.cat_type = cat_type;
	}


	
}
