package p2;

public class Employee {
	
	String name;
	Project project;
	public Employee(String name, Project project) {
		super();
		this.name = name;
		this.project = project;
	}
	@Override
	public String toString() {
		return name+" "+project.projectName;
	}
	
	
}
