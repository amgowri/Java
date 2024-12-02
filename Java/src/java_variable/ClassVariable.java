package java_variable;

public class ClassVariable {

	// Declare and initialize class or instance variable
	int myAge = 29;

	void display() {

		// Print the value of the variable
		System.out.println(myAge);
	}

	public static void main(String[] args) {

		ClassVariable classvariable = new ClassVariable();

		// Print the value of the variable
		System.out.println(classvariable.myAge);

		classvariable.display();

	}

}
