package book;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name ="book_table")
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "book_name",unique =true,nullable=false)
	private String name;
	@Column(updatable = false)
	private String Author;
	@CreationTimestamp
	private LocalDateTime created_datetime;
	@UpdateTimestamp
	private LocalDateTime updated_datetime;
	
	
	public Book() {}
	public Book(String name, String author) {
		
		this.id = id;
		this.name = name;
		Author = author;
		
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
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}

	
	
	
	
	

}
