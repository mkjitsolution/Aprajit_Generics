package p3;

public class Employee {
	String name;
	Project project;
	int salary;
	
	public Employee(String name, Project project) {
		super();
		this.name = name;
		this.project = project;
	}
	@Override
	public String toString() {
		return name+" "+project.projectName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
