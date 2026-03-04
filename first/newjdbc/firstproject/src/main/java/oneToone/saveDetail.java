package oneToone;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;


public class saveDetail {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();//DML
		
		Adhar a =new Adhar();
		a.setId(101);
		a.setLoc("Uganda");
		
		Person p = new Person();
		p.setId(10);
		p.setName("ABC");
		p.setAdhar(a);
		
		et.begin();
		em.persist(a);
		em.persist(p);
		et.commit();
		System.out.print("yes");
	}

}
