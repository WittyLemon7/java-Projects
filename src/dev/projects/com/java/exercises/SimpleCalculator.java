package dev.projects.com.java.exercises;

public class SimpleCalculator {
    private  double firstNumber;
    private  double secondNumber;

    //getters and setters
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
    //addition method
    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    //subtraction method
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    //multiplication method
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    //division method
    public double getDivisionResult(){
        if (secondNumber == 0){
            return 0;
        }
        return firstNumber / secondNumber;
    }



}
