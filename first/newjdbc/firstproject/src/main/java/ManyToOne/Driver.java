package ManyToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("post");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Company company = new Company();
	
	company.setId(101);
	company.setName("CAP");
	company.setLoc("Banglore");
	
	Employee employee = new Employee();
	employee.setId(4);
	employee.setName("pavan");
	employee.setSal(50000.0);
	employee.setC(company);
	
	Employee employee1 = new Employee();
	employee1.setId(3);
	employee1.setName("vignan");
	employee1.setSal(500000.0);
	employee1.setC(company);
	
	et.begin();
	em.persist(employee);
	em.persist(employee1);
	em.persist(company);
	et.commit();
	System.out.println("done");
	

	
	
	
	
}

}
