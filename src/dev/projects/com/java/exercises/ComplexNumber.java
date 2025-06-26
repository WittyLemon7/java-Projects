package dev.projects.com.java.exercises;

public class ComplexNumber {
    private double real;
    private double imaginary;

    //constructor for complex number
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    //getters & setters for real and imaginary
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    //add method for adding real & imaginary parts of complex numbers
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    //add method for adding complex numbers
    public void add(ComplexNumber complexNumber) {
        add(complexNumber.getReal(), complexNumber.getImaginary());
    }
    //subtract method for subtracting real & imaginary parts of complex numbers
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    //subtract method for subtracting complex numbers
    public void subtract(ComplexNumber complexNumber) {
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
}
