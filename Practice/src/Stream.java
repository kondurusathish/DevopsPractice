import java.util.List;

public class Stream {
	
	
	private String firstName;
	public String getFirstName() {
		return firstName;
	}


	public Stream(String firstName, String lastName, double salary, List<String> projects) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.projects = projects;
	}


	public Stream() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Stream [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", projects="
				+ projects + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSalary()=" + getSalary() + ", getProjects()=" + getProjects() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public List<String> getProjects() {
		return projects;
	}


	public void setProjects(List<String> projects) {
		this.projects = projects;
	}


	private String lastName;
	private double salary;
	private List<String> projects;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Stream s=new Stream();
		 
		
		
	
		

	}

}
