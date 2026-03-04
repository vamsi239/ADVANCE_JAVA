package ManyToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e = em.find(Employee.class, 1);
		System.out.println("Employee Name: "+e.getName());
		Company c =e.getC();
		System.out.println("Company name: "+c.getName());
		
		
		
		
	}
	

}
