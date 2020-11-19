package p3;

public class ExecutionCode {

	public static void main(String[] args) {

		
		//------------- 2nd Data Type ----------------------------

		EmployeeTemplate<Employee> template2 = new EmployeeTemplate();
		
		Employee e1 = new Employee("Aprajit", new Project("Bank-Pro"));
		Employee e2 = new Employee("Mike", new Project("Railway-Pro"));
		Employee e3 = new Employee("Jenny", new Project("Supply Chain-Pro"));
		
		template2.addElement(e1);
		template2.addElement(e2);
		template2.addElement(e3);
		
		
		Employee emp = template2.getElement(0);
		System.out.println("Employee " + emp);
		
		//------------- 3rd Data Type ----------------------------

		EmployeeTemplate<Developer> template3 = new EmployeeTemplate();
				
		



	}// end main
}// end class
