# Variable

## 1. Variable Syntax

```java

data_type variable_name = value;

```

## 2. Variable is a name given to a memory location that stores a value
## 3. Variables are used to store and manipulate data

## 4. Declaring Variable 

```java

int myAge;

```
## 5.Initializing Variable

```java

int myAge = 29;

```

## 6. Variable Example

```java

public class Variable {

	public static void main(String[] args) {

		// Declare and initialize variable
		int myAge = 29;

		// Print the value of the variable
		System.out.println(myAge);
	}

}

```




# Class Variable / Instance Variable

## 1. Class variable are declared inside a class but outside any method
```java
public class ClassVariable {

	// Declare and initialize class or instance variable
	int myAge = 29;

	void display() {

		// Print the value of the variable
		System.out.println(myAge);
	}

}
```
## 2. Class variable are accessed by using object reference variable
## 3. Class variable can be accessed anywhere inside the class

```java

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

```

# Local Variable

## 1. Local variable are declared inside a method and accessed only inside that method

```java
public class LocalVariable {

	public static void main(String[] args) {

		// Declare local variable
		int myAge;

		// Initialize local variable
		myAge = 29;

		// Print the value of the variable
		System.out.println(myAge);

	}

}

```
# Static Variable
## 1. Static variable are declared inside the class but outside the method with static keyword 
## 2. Static variable can be initialized inside static method

```java

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



```


















