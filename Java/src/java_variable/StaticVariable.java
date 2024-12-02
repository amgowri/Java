package java_variable;

public class StaticVariable {

	// Declare static variable
	static String name;

	public static void main(String[] args) {

		// Initialize static variable
		name = "Gowri";

		// Print the value of the variable
		System.out.println(name);

		StaticVariable staticvariable = new StaticVariable();
		System.out.println(staticvariable.name);

	}

}
