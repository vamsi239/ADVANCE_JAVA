package firstproject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateStudent {
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s1 = em.find(Student.class, 11);
	s1.setPhone(347);
	et.begin();
	em.merge(s1);
	et.commit();
	System.out.println("Updated");
}
}
