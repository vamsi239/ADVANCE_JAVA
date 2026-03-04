package OneToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Fetch {
		public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//Bank b = em.find(Bank.class, 101);
		//System.out.println("Bankname: "+b.getName());
		
//		for(Account a :b.getAccount()) {
//			System.out.print("Acc id: "+a.getId());
//			System.out.print("Acc Name: "+a.getName());
//			System.out.print("------------");
			Account a1 = em.find(Account.class, 10);
			Account a2 = em.find(Account.class, 11);
			
			et.begin();
			//em.remove(b);
			em.remove(a1);
			em.remove(a2);
			et.commit();
			
		}
		}
		
}
