package java_encapsulation;

public class JavaEncapsulation {
	
	private String employeeName;
	private int employeeID;
	private double employeeSalary;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public static void main(String[] args) {

		JavaEncapsulation encapsulation = new JavaEncapsulation();
		encapsulation.employeeName = "Gowri";
		encapsulation.employeeID = 101;
		encapsulation.employeeSalary = 90000;

		System.out.println(encapsulation.employeeName);

	}

}
