package firstproject;

public interface StudentCRUD {
	void saveStudent(Student s);
	void UpdateStudentname(int id,String name);
	void UpdateStudentPhone(int id,int phone);
	void FindStudent(int id);
	void DeleteStudent(int id);
	void FindALlStudent();

}
