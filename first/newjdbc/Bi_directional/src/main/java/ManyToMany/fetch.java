package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class fetch {
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
	EntityManager em  = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s = em.find(Student.class,10);
	
	
	List<Subjects> e = new ArrayList<>();
	e = s.getSub();	
	
	for(Subjects r: e) {
		if(r.getName().equals("HTML")) {
			r.setTrainer("Sandeep");
		}
	}
	
	et.begin();
	em.merge(s);
	et.commit();
	System.out.println("done");
	}
}
