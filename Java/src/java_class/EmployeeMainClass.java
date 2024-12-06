package java_class;

/**
 * 
 * Object Syntax
 * 
 * Classname objectname = new Classname();
 * 
 * Object is an instance of class
 * 
 * Object is created by using new keyword followed by classname
 * 
 * Object doesn't occupy space in memory
 * 
 * Object is physical entity ( employee1, employee2 )
 * 
 * Using single class ( EmployeeClass ) we can have multiple objects( employee1,
 * employee2, employee3 )
 * 
 */
public class EmployeeMainClass {

	public static void main(String[] args) {

		// Employee 1
		EmployeeClass employee1 = new EmployeeClass();
		// Initialize variables
		employee1.employeeName = "Gowri";
		employee1.employeeID = 1001;
		employee1.employeeSalary = 808040.84d;

		employee1.displayEmployeeInformation();
		// System.out.println(employee1.employeeName);

		// Employee 2
		EmployeeClass employee2 = new EmployeeClass();
		employee2.employeeName = "Karthick";
		// employee2.employeeName = "Karthick";
		employee2.employeeID = 1002;
		employee2.employeeSalary = 4004000.04d;

		employee2.displayEmployeeInformation();

	}

}
