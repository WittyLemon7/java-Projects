# Pattern Printer
This is a simple pattern printer that generates various patterns based on user input. The program prompts the user to enter a number and then prints a pattern of stars (`*`) in a pyramid shape.
## Problem Statement
Create a program that prints a `pyramid`, `diamond`, `hollow square` & a `Variable thickness aquare` pattern of stars based on a user-defined number of rows. The program should prompt the user for input and then display the pattern accordingly.
## Discussion
The Pattern Printer is a simple program that demonstrates the use of loops and conditional statements to generate different patterns based on user input. The program allows users to choose from various patterns, such as a pyramid, diamond, hollow square, and variable thickness square. Each pattern is printed using nested loops to control the number of rows and columns. - This tests the understanding of loops, conditionals, and basic arithmetic operations & string manipulation.
## Walkthrough
```java
private static void printPattern(int number) {
    //validate input
    if (number <= 5) {
        System.out.println("Please enter a positive integer greater than zero.");
        return;
    }
/*loop through rows
loop through columns for border patterns
if conditionals to establish borders
rows == 1 || rows == number || columns == 1 || columns ==  number etc        
 */
for (int i = 1; i <= number; i++) {
        // Print spaces for pyramid shape
        for (int j = number; j > i; j--) {
            System.out.print(" ");
        }
        // Print stars for pyramid shape
        for (int k = 1; k <= (2 * i - 1); k++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after each row
    }
}
```
## Logic & Explanation
- **Input Validation**: The method starts by checking if the input number is less than or equal to 5. If it is, it prompts the user to enter a valid positive integer greater than zero and exits the method.
- **Looping through Rows**: A `for` loop iterates from 1 to the input number, representing each row of the pyramid. 
- - ** Looping through Columns for Spaces**: Inside the outer loop, another `for` loop iterates from the input number down to the current row number (`i`).This loop is for patterns with borders like square or rectangle or squares with variable thicknessetc.
- **Printing Spaces**: Inside the outer loop, another `for` loop prints spaces before the stars to create the pyramid shape. The number of spaces decreases as the row number increases.
- **Printing Stars**: Another `for` loop prints the stars for each row. The number of stars increases as the row number increases, following the formula `(2 * i - 1)`, where `i` is the current row number.
- **Moving to the Next Line**: After printing all stars for a row, `System.out.println()` is called to move to the next line for the next row.
- **Output**: The method prints a pyramid pattern of stars based on the user-defined number of rows.
## Edge Cases
- **Negative Numbers**: The method checks if the input number is less than or equal to 5 and prompts the user to enter a valid positive integer greater than zero.
- **Zero Input**: If the input is zero, the method will prompt the user to enter a positive integer greater than zero.
## Related Concepts
- [[Loops]]: The program uses nested loops to control the number of rows and columns for the patterns.
- [[Conditionals]]: The program uses conditional statements to check the input and determine the pattern to print.
- [[String Manipulation]]: The program involves printing characters in a specific format, which requires understanding how to manipulate strings and output formatting.
- [[Input Validation]]: The program validates user input to ensure it is a positive integer greater than zero.