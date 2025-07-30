package dev.TinkerLabSandbox.ComplexNumber;

/* Complex number is a number that can be expressed in the form a + bi, where a and b are real numbers, and i is the imaginary unit with the property that i^2 = -1.
 * This class provides methods to perform basic arithmetic operations on complex numbers such as addition, subtraction, multiplication, and division.
 */

public class ComplexNumbers {
    public static void main(String[] args) {

        // Example usage of the ComplexNumbers class
        ComplexNumbers c1 = new ComplexNumbers(3, 4); // 3 + 4i
        ComplexNumbers c2 = new ComplexNumbers(1, 2); // 1 + 2i

        c1.add(c2); // Adds complex2 to complex1
        System.out.println("After addition: " + c1.getReal() + " + " + c1.getImaginary() + "i");

        c1.subtract(c2); // Subtracts complex2 from complex1
        System.out.println("After subtraction: " + c1.getReal() + " + " + c1.getImaginary() + "i");

        c1.multiply(c2); // Multiplies complex1 by complex2
        System.out.println("After multiplication: " + c1.getReal() + " + " + c1.getImaginary() + "i");

        c1.divide(c2); // Divides complex1 by complex2
        System.out.println("After division: " + c1.getReal() + " + " + c1.getImaginary() + "i");
    }

    //instance variables to hold complex number values
    private double real;
    private double imaginary;

    //constructor that initializes the real and imaginary parts of the complex number
    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    //getters
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    //method to add the real & imaginary parts of the complex number
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    //method to add another complex number to this complex number
    //it takes a ComplexNumbers object as a parameter
    //and adds its real and imaginary parts to this complex number
    //this allows for easy addition of complex numbers
    public void add(ComplexNumbers complexNumber) {
        add(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumbers complexNumber) {
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
    /*method to multiply the real and imaginary parts of the complex number
    /*it takes two double parameters representing the real and imaginary parts of another complex number
    /*and multiplies them with the real and imaginary parts of this complex number
    /*the result is stored back in the real and imaginary parts of this complex number
    // this allows for easy multiplication of complex numbers
    */

    public void multiply(double real, double imaginary) {

        double newReal = this.real * real - this.imaginary * imaginary;
        double newImaginary = this.real * imaginary + this.imaginary * real;
        this.real = newReal;
        this.imaginary = newImaginary;
    }
    // method to multiply another complex number with this complex number
    //it takes a ComplexNumbers object as a parameter
    public void multiply(ComplexNumbers complexNumber) {
        multiply(complexNumber.getReal(), complexNumber.getImaginary());
    }
    // method to divide the real and imaginary parts of the complex number
    //it takes two double parameters representing the real and imaginary parts of another complex number
    public  void divide(double real, double imaginary) {
        if (real == 0 && imaginary == 0) {//invalid input check
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double denominator = real * real + imaginary * imaginary;
        double newReal = (this.real * real + this.imaginary * imaginary) / denominator;
        double newImaginary = (this.imaginary * real - this.real * imaginary) / denominator;
        this.real = newReal;
        this.imaginary = newImaginary;
    }

    public void divide(ComplexNumbers complexNumber) {
        divide(complexNumber.getReal(), complexNumber.getImaginary());
    }


}
