package firstproject;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class StudentCRUDimp implements StudentCRUD{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	@Override
	public void saveStudent(Student s){
		et.begin();
		em.persist(s);
		et.commit();
		
		System.out.println("Saved");
		
	}
	@Override
	public void UpdateStudentname(int id,String name) {
		Student s = em.find(Student.class, id);
		s.setName(name);
		
		et.begin();
		em.merge(s);
		et.commit();
		System.out.println("Updated");
		
	}
	@Override
	public void UpdateStudentPhone(int id,int phone) {
		Student s = em.find(Student.class, id);
		s.setPhone(phone);
		
		et.begin();
		em.merge(s);
		et.commit();
		System.out.println("Updated");
		
	}
	@Override
	public void FindStudent(int id) {
		Student s = em.find(Student.class, id);
		
		System.out.println("id: "+s.getStudentId());
		System.out.println("Name: "+s.getName());
		System.out.println("Phone: "+s.getPhone());
		
	}
	@Override
	public void DeleteStudent(int id){
		Student s = em.find(Student.class, id);
		
		et.begin();
		em.remove(s);
		et.commit();
		System.out.println("Deleted");
	}
	
	@Override
	public void FindALlStudent() {
        Query q = em.createQuery("select s from Student s");
		
		List<Student> students =q.getResultList();
		for(Student s:students) {
			System.out.println(s.getStudentId());
			System.out.println(s.getName());
			System.out.println(s.getPhone());
			System.out.println("--------------");
		}

		
	}
	public static void main(String[] args) {
		StudentCRUDimp cr = new StudentCRUDimp();
		
		Student s1 = new Student();
		s1.setStudentId(10);
		s1.setName("c");
		s1.setPhone(1234567);
		
		Student s2 = new Student();
		s2.setStudentId(11);
		s2.setName("y");
		s2.setPhone(1234567);
		
		cr.saveStudent(s2);
		//cr.UpdateStudentname(10,"d");
		//cr.DeleteStudent(10);
		cr.FindStudent(12);
		cr.UpdateStudentPhone(12,45789);
		cr.FindALlStudent();
		
	}
	
}
