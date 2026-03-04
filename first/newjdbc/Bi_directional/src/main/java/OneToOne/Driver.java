package OneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
//import sun.security.krb5.internal.crypto.EType;000

public class Driver {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Person p = new Person(10,"Pavan",adhar);
		
		Adhar adhar = new Adhar(101,"India");
		
		Person p = new Person(10,"Pavan");
		adhar.setPerson(p);
		p.setAdhar(adhar);
		et.begin();
		em.persist(adhar);
		em.persist(p);
		et.commit();
		
	}

}