package hibernatelifecycle;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		LifeCycle l = em.find(LifeCycle.class, 1);
		
		//l.setId(2);
		l.setName("Baratam1");
		
		et.begin();
		em.merge(l);
		l.setName("Baratam22");
	
		et.commit();
		System.out.println("Done");
		
		
	}

}
