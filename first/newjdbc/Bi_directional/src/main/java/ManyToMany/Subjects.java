package ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToOne;
@Entity
public class Subjects {
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
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public List<Student> getStu() {
		return stu;
	}
	public void setStu(List<Student> stu) {
		this.stu = stu;
	}
	public Subjects() {
	}
	public Subjects(int id, String name, String trainer) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
	}
	private String name;
	private String trainer;
	@ManyToMany(mappedBy = "sub")
	private List<Student> stu;
	
	

}