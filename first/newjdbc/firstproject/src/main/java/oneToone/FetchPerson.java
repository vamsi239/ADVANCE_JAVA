package oneToone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchPerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();//DML
		Person p = em.find(Person.class,10);
		
		
		Adhar a= p.getAdhar();
		System.out.println(p.getName());
		System.out.println(a.getLoc());
		
	
	}

}
