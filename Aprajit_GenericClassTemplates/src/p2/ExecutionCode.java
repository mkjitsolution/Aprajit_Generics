package p2;

public class ExecutionCode {

	public static void main(String[] args) {

		MyCLassTemplate<Integer> template1 = new MyCLassTemplate();
		template1.addElement(10);
		template1.addElement(100);
		template1.addElement(210);
		template1.addElement(70);
		
		int data = template1.getElement(0);
		System.out.println("Data " + data);
		
		//------------- 2nd Data Type ----------------------------

		MyCLassTemplate<Employee> template2 = new MyCLassTemplate();
		
		Employee e1 = new Employee("Aprajit", new Project("Bank-Pro"));
		Employee e2 = new Employee("Mike", new Project("Railway-Pro"));
		Employee e3 = new Employee("Jenny", new Project("Supply Chain-Pro"));
		
		template2.addElement(e1);
		template2.addElement(e2);
		template2.addElement(e3);
		
		
		Employee emp = template2.getElement(0);
		System.out.println("Employee " + emp);
		



	}// end main
}// end class
