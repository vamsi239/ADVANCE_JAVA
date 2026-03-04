package ManyToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	private int id;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Subjects> getSub() {
		return sub;
	}

	public void setSub(List<Subjects> sub) {
		this.sub = sub;
	}

	public Student(int id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
	}
	public Student() { }

	private String name;
	private String loc;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable
	private List<Subjects> sub;

}