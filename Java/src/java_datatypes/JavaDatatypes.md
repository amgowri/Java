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

		byte myHouseNumber = 108;
		short myAge = 29;

		int myCGPA = 72;
		long myPhoneNumber = 987653210L;

		float myMonthlySalary = 80000.8f;
		double myAnnualSalary = 960000.880d;

		boolean martialStatus = false;
		char myGender = 'f';

		System.out.println(" My Home Number is : " + myHouseNumber);
		System.out.println(" My Age is : " + myAge);
		System.out.println(" My CGPA : " + myCGPA);
		System.out.println(" My Phone Number is : " + myPhoneNumber);
		System.out.println(" My Monthly Salary is : " + myMonthlySalary);
		System.out.println(" My Annual Salary is : " + myAnnualSalary);
		System.out.println(" My Martial Status is : " + martialStatus);
		System.out.println(" My Gender is : " + myGender);

	}

}
```


