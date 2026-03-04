package firstproject;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Student student =em.find(Student.class, 11);
		System.out.println("id: "+student.getStudentId());
		System.out.println("Name: "+student.getName());
		System.out.println("Phone: "+student.getPhone());
		
		
		
		
	}
	

}
