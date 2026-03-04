package test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class testing {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();//DML
		
		Test t = new Test();
		
		t.setId(12);
		
		et.begin();
		em.persist(t);
		et.commit();
	}

}
