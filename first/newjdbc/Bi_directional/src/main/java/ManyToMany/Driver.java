package ManyToMany;

import java.util.Arrays;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student = new Student(10,"pavan","LawGate");
		Student student1 = new Student(11,"lal","Guntur");
		Subjects subject = new Subjects(101,"HTML","Ravi");
		Subjects subject1 = new Subjects(102,"CSS","Paul");
		
		student.setSub(Arrays.asList(subject,subject1));
		subject.setStu(Arrays.asList(student,student1));
		
		et.begin();
		em.persist(student);
		em.persist(student1);
//		em.persist(subject);
//		em.persist(subject1);
		et.commit();
		System.out.println("done");
		
		
	}

}