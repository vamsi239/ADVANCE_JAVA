package OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adhar {
	@Id
	private int id;
	private String location;
	@OneToOne(mappedBy = "adhar") //to achieve the bidirectional mapping between two entities.
	private Person person;
	public Adhar(int id, String location) {
		super();
		this.id = id;
		this.location = location;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	

}