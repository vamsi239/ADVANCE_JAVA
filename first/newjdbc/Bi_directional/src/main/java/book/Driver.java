package book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Book b = new Book("java","pavan");
		
		et.begin();
		em.persist(b);
		et.commit();
		System.out.println("Done");
	}

}
