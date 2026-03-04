package OneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class, 10);
		System.out.println(p.getName());
		
		Adhar a = p.getAdhar();
		System.out.println(a.getLocation());
		
		
		
		
		
	}

}
