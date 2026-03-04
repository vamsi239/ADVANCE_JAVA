package OneToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Account a1 = new Account();
	Account a2 = new Account();
	a1.setId(10);
	a1.setName("vignan");
	a1.setBal(3456789);
	
	a2.setId(11);
	a2.setName("Pavan");
	a2.setBal(23456);
	
	Bank b = new Bank();
	
	b.setId(101);
	b.setName("SBI");
	b.setLoc("Punjab");
	
	List<Account> list = new ArrayList<Account>();	
	list.add(a1);
	list.add(a2);
	
	b.setAccount(list);//passing list of account to book
	
	
	et.begin();
	em.persist(a1);
	em.persist(a2);
	
	em.persist(b);
	et.commit();
	System.out.println("done");
	
	
	}
}
