package secoundcachememory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2 = emf.createEntityManager();
		
		gymMember g =em1.find(gymMember.class, 10);
		
		gymMember g1 =em2.find(gymMember.class, 10);
		
	}
	

}
