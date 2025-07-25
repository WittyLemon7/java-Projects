package dev.TinkerLabSandbox.Calculator;

public class Calculator {

   private  double firstNumber; // Variable to hold the first number
    private double secondNumber; // Variable to hold the second number

    // Constructor to initialize the calculator with two numbers
    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    // Default constructor
    public Calculator() {
        this.firstNumber = 0.0; // Default value for first number
        this.secondNumber = 0.0; // Default value for second number
    }

    //getters and settters
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    // Method to add two numbers
    public double getAddResult() {
        return  firstNumber + secondNumber;
    }
    //method to substract two numbers
    public double getSubResult() {
        return firstNumber - secondNumber;
    }
    //method to multiply two numbers
    public double getMultiplyResult() {
        /*multiplication by zero is mathematically valid
        zero check is not necessary
        * if // & not cleared to to avoid confusion
         */
//        if (secondNumber == 0 || firstNumber == 0) { // Check for multiplication by zero
//            System.out.println("Cannot multiply by zero");
//            return 0; // Return 0 or throw an exception as per your requirement
//        }
        return  firstNumber * secondNumber;
    }
    //method to divide two numbers
    public double getDivideResult() {
        if (secondNumber == 0) { // Check for division by zero
            System.out.println("Cannot divide by zero");
            return 0; // Return 0 or throw an exception as per your requirement
        }
        return firstNumber / secondNumber;
    }
}
