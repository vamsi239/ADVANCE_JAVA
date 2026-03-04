package m1practice;

class UnauthorizedAccessException extends Exception{
	public UnauthorizedAccessException(String message) {
		super(message);
	}
}

class InvalidSalaryException extends Exception{
	public InvalidSalaryException(String message) {
		super(message);
	}
}

interface payroll{
	double calculateSal();
	double calculateSal(double bonus);
}

abstract class Employee implements payroll{
	private int emid;
	private String name;
	private String role;
	private double salary;
	public Employee(int emid, String name, String role, double salary) throws InvalidSalaryException {
		
		this.emid = emid;
		this.name = name;
		this.role = role;
		setSal(salary);
		
	}
	
	public int getEmid() {
		return emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}
    
	
	private void setSal(double salary) throws InvalidSalaryException{
		if(salary < 0) throw new InvalidSalaryException("sal cant be negative");
		this.salary =salary;
	}
	
	
	
}
public class Employeepayroll {

}
