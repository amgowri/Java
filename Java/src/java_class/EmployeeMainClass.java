package java_class;

public class EmployeeMainClass {

	public static void main(String[] args) {

		// Employee 1
		EmployeeClass employee1 = new EmployeeClass();
		employee1.employeeName = "Gowri";
		employee1.employeeID = 1001;
		employee1.employeeSalary = 808040.84d;

		employee1.displayEmployeeInformation();

		// Employee 2
		EmployeeClass employee2 = new EmployeeClass();
		employee2.employeeName = "Karthick";
		// employee2.employeeName = "Karthick";
		employee2.employeeID = 1002;
		employee2.employeeSalary = 4004000.04d;

		employee2.displayEmployeeInformation();

	}

}
