package secoundcachememory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction et1 = em1.getTransaction();
		EntityTransaction et2 = em2.getTransaction();
		
//		gymMember a = new gymMember(10,"vignan");
		gymMember a1 = new gymMember(10,"pavan");
//		et1.begin();
//		em1.persist(a);
//		et1.commit();
		System.out.println("gym1 done");
		et2.begin();
		em2.persist(a1);
		et2.commit();
		System.out.println("gym1 done");

}
}
