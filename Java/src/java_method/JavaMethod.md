# Method / Functions / Procedures

## Method Syntax

```java

returntype method_name(parameters){

// method body

}

```

## 1. Method is a block of code that performs a certain task
## 2. Method used to organize code, reduce repetition

## Method Example

```java
public class JavaMethod {

	// method
	void display() {
		int myAge = 29;
		System.out.println(myAge);

	}

	// main method
	public static void main(String[] args) {

		JavaMethod method = new JavaMethod();
		method.display();

	}

}

```

# Static Method

## 1. Static Method is declared with static keyword
## 2. Static method can be accessed directly using method name
```java
public class StaticMethod {

	// method
	static void display() {
		int myAge = 29;
		System.out.println(myAge);

	}

	// main method
	public static void main(String[] args) {

		display();
	}

}
```






