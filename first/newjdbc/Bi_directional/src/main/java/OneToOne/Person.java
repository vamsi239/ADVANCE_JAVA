package OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	@JoinColumn   //to remove the extra column
	@OneToOne(fetch = FetchType.EAGER)
	private Adhar adhar;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
//		this.adhar = adhar;
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
	public Adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}

}