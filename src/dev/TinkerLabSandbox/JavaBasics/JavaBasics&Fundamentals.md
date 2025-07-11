# Java Fundamentals: Syntax, Arithmetic, and Conditionals
## Introduction
This note provides a concise overview of fundamental concepts in Java programming, including basic syntax, arithmetic operations, and conditional statements with logical operators. Mastering these building blocks is essential for writing any Java program.

### 1. Java Basic Syntax
   Java programs follow a specific structure. Here are the core elements:

#### 1.1. Main Method
Every executable Java application must have a main method, which serves as the entry point for the program.

```java
public class MyFirstProgram {
public static void main(String[] args) {
// Your code goes here
}
}
```

`public`: An access modifier, meaning the method is accessible from anywhere.

`static`: Allows the main method to be called without creating an instance of the class.

`void`: Indicates that the method does not return any value.

`main`: The name of the method, which is recognized by the Java Virtual Machine (JVM) as the starting point.

`String[] args`: An array of String objects that can hold command-line arguments passed to the program.

#### 1.2. Printing Output
The `System.out.println()` method is used to print output to the console.

```java
 class PrintExample {
public static void main(String[] args) {
System.out.println("Hello, Java!"); // Prints "Hello, Java!" followed by a new line
System.out.print("This is ");      // Prints "This is " without a new line
System.out.println("on the same line."); // Prints "on the same line." followed by a new line
}
}
```

#### 1.3. Comments
Comments are non-executable lines of code used to explain the program.

Single-line comments: Start with `//`

Multi-line comments: Start with `/*` and end with `*/`

Documentation comments: Start with `/**` and end with `*/ (used for generating API documentation)`
````java
public class CommentExample {
public static void main(String[] args) {
// This is a single-line comment

        /*
         * This is a multi-line comment.
         * It can span across several lines.
         */

        /**
         * This is a documentation comment.
         * It describes the purpose of the main method.
         * @param args Command line arguments
         */
        System.out.println("Comments help explain code.");
    }
}
````

#### 1.4. Variables and Data Types
Variables are containers for storing data values. Each variable must have a specified data type.

##### Primitive Data Types:

`int`: Integers (whole numbers), e.g., 10, -5.

`double`: Floating-point numbers (decimal numbers), e.g., 3.14, -0.5.

`boolean`: Boolean values (true or false).

`char`: Single characters, e.g., 'A', 'z'.

`byte`,` short`, `long`, `float`: Other numeric types for specific range/precision needs.

##### Non-Primitive Data Types:

`String`: A sequence of characters, e.g., "Hello World". (Technically an object, not a primitive).
```java
public class VariableExample {
public static void main(String[] args) {
// Declaring and initializing variables
int age = 30;
double price = 99.99;
boolean isActive = true;
char grade = 'A';
String name = "Alice";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Active: " + isActive);
        System.out.println("Grade: " + grade);

        // Reassigning a variable
        age = 31;
        System.out.println("New Age: " + age);
    }
}
````
### 2. Basic Arithmetic Operations
   Java provides standard arithmetic operators for mathematical calculations.

#### Operator

Name

Example

Result

+

Addition

5 + 3

8

-

Subtraction

10 - 4

6

*

Multiplication

6 * 2

12

/

Division

10 / 3 (int)

3

/

Division

10.0 / 3.0

3.33...

%

Modulo

10 % 3

1

*Important Notes*:

`Integer Division`: When both operands of / are integers, the result is an integer (the fractional part is truncated).

`Modulo (%)`: Returns the remainder of a division.

##### Operator Precedence: 
Multiplication, division, and modulo have higher precedence than addition and subtraction. Parentheses () can be used to control the order of operations.
````java
public class ArithmeticExample {
public static void main(String[] args) {
int num1 = 20;
int num2 = 7;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2; // Integer division: 20 / 7 = 2
        int remainder = num1 % num2; // Remainder: 20 % 7 = 6

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient (int): " + quotient);
        System.out.println("Remainder: " + remainder);

        double dNum1 = 20.0;
        double dNum2 = 7.0;
        double preciseQuotient = dNum1 / dNum2; // Floating-point division
        System.out.println("Precise Quotient (double): " + preciseQuotient);

        // Operator precedence example
        int result = 5 + 2 * 3; // 2 * 3 = 6, then 5 + 6 = 11
        System.out.println("Precedence Result: " + result); // Output: 11
    }
}
````
### 3. Basic Conditional Statements & Logic
   `Conditional statements` allow your program to make decisions and execute different blocks of code based on whether certain conditions are true or false.

#### 3.1. if Statement
Executes a block of code if a specified condition is true.
```java

public class IfStatementExample {
public static void main(String[] args) {
int score = 85;

        if (score >= 60) {
            System.out.println("You passed the exam!");
        }
    }
````


#### 3.2. if-else Statement
Executes one block of code if the condition is true, and another block if it's false.
```java
public class IfElseStatementExample {
public static void main(String[] args) {
int temperature = 25;

        if (temperature > 30) {
            System.out.println("It's hot outside.");
        } else {
            System.out.println("It's not too hot.");
        }
    }
}
```
#### 3.3. if-else if-else Statement
Allows for multiple conditions to be checked in sequence.
```java
public class IfElseIfElseStatementExample {
public static void main(String[] args) {
int time = 14; // 2 PM

        if (time < 12) {
            System.out.println("Good morning.");
        } else if (time < 18) { // This condition is checked only if the first one is false
            System.out.println("Good afternoon.");
        } else { // This block executes if none of the above conditions are true
            System.out.println("Good evening.");
        }
    }
}
```
### 3.4. Logical Operators
Used to combine or modify boolean expressions.

`&& (Logical AND)`: Returns true if both operands are true.

`|| (Logical OR)`: Returns true if at least one operand is true.

`! (Logical NOT)`: Reverses the boolean value of the operand.
```java
public class LogicalOperatorsExample {
public static void main(String[] args) {
int age = 25;
boolean hasLicense = true;

        // Logical AND (&&)
        if (age >= 18 && hasLicense) {
            System.out.println("Eligible to drive.");
        } else {
            System.out.println("Not eligible to drive.");
        }

        // Logical OR (||)
        String day = "Sunday";
        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }

        // Logical NOT (!)
        boolean isRaining = false;
        if (!isRaining) { // Equivalent to if (isRaining == false)
            System.out.println("It's not raining, let's go out!");
        }
    }
}
```
### Conclusion
This note has covered the foundational elements of Java programming: basic syntax for structuring your code, arithmetic operators for performing calculations, and conditional statements with logical operators for controlling program flow. A solid grasp of these concepts is crucial for building more complex and dynamic Java applications.