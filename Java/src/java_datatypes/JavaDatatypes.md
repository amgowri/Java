# Data types

## Data type specify the type of data that a variable can hold

```java 

datatype variablename = value;

```

## Primitive Data types

## 1. Primtive data types are built in data types that are predefined in java

| Data Type | Size (bits) | Range | Default Value | Description |
| --- | --- | --- | --- | --- |
| byte | 8 | -128 to 127 | 0 | Signed integer, useful for saving memory |
| short | 16 | -32,768 to 32,767 | 0 | Signed integer, larger range than byte |
| int | 32 | -2,147,483,648 to 2,147,483,647 | 0 | Signed integer, most commonly used integer type |
| long | 64 | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 0L | Signed integer, largest range of all integer types |
| float | 32 | 1.4E-45 to 3.4E+38 | 0.0f | Single-precision floating-point number |
| double | 64 | 4.9E-324 to 1.8E+308 | 0.0d | Double-precision floating-point number |
| boolean | 1 | true or false | false | Logical value, either true or false |
| char | 16 | 0 to 65,535 (Unicode) | '\u0000' | Single Unicode character |

```java

public class JavaPrimitiveDatatypes {

	public static void main(String[] args) {

		byte employeeID = 101;
		short employeeAge = 29;

		int employeeSalary = 90000;
		long employeePhoneNumber = 987653210L;

		float employeeRating = 4.5F;
		double employeePFAmount = 6000.880;

		boolean employeeMaritalStatus = false;
		char employeeGrade = 'A';

		System.out.println(" Employee ID: " + employeeID);
		System.out.println(" Employee Age: " + employeeAge);
		System.out.println(" Employee Salary: " + employeeSalary);
		System.out.println(" Employee Phone Number: " + employeePhoneNumber);
		System.out.println(" Employee PF Amount: " + employeePFAmount);
		System.out.println(" Employee Rating: " + employeeRating);
		System.out.println(" Employee Martial Status: " + employeeMaritalStatus);
		System.out.println(" Employee Grade: " + employeeGrade);

	}

}

```


