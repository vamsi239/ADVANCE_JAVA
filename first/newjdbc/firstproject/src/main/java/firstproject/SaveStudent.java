package firstproject;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;


public class SaveStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s= new Student();
		s.setStudentId(11);
		s.setName("a");
		s.setPhone(56782);
		
		Student s1= new Student();
		s1.setStudentId(12);
		s1.setName("b");
		s1.setPhone(4556782);
		
		et.begin();
		em.persist(s);
		em.persist(s1);
		et.commit();
		
		
}
}
