package dev.TinkerLabSandbox.Calculator;

public class Main {
    public static void main(String[] args) {

        //Example test case
        Calculator calculator1 = new Calculator();
        calculator1.setFirstNumber(23.0);
        calculator1.setSecondNumber(19.0);

        System.out.println("Sum of 23 & 19 = " + calculator1.getAddResult());//expected output  32
        System.out.println("Subtraction of  23 & 19 = " + calculator1.getSubResult());//Expected output 4
        System.out.println("Multply of 23 & 19 = " + calculator1.getMultiplyResult());// Expected output 437
        System.out.println("Division of 23 & 19 = " + calculator1.getDivideResult());// Expected output 1.2105263157894737
    }
}
