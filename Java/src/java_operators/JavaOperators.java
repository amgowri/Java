package java_operators;

public class JavaOperators {

	public static void main(String[] args) {
		
	     String employeeName = "John Doe";
	        int currentSalary = 50000;
	        int increment = 10000;
	        int totalLeaves = 30;
	        int leavesTaken = 10;
	        int hourlyWage = 500;
	        int overtimeHours = 5;
	        int totalScore = 100;
	        int obtainedScore = 80;
	        int totalWorkingDays = 30;
	        int presentDays = 25;
	        int experience = 5;
	        int leaveBalance = 10;

	        // Addition
	        int newSalary = currentSalary + increment;
	        System.out.println(employeeName + "'s new salary: " + newSalary);

	        // Subtraction
	        int remainingLeaves = totalLeaves - leavesTaken;
	        System.out.println(employeeName + "'s remaining leaves: " + remainingLeaves);

	        // Multiplication
	        int overtimePay = hourlyWage * overtimeHours;
	        System.out.println(employeeName + "'s overtime pay: " + overtimePay);

	        // Division
	        double performanceRating = (double) obtainedScore / totalScore;
	        System.out.println(employeeName + "'s performance rating: " + performanceRating);

	        // Modulus
	        int bonus = presentDays % 5 == 0 ? 1000 : 0;
	        System.out.println(employeeName + "'s attendance bonus: " + bonus);

	        // Increment
	        experience++;
	        System.out.println(employeeName + "'s updated experience: " + experience);

	        // Decrement
	        leaveBalance--;
	        System.out.println(employeeName + "'s updated leave balance: " + leaveBalance);
		
		
		
		

	}

}
