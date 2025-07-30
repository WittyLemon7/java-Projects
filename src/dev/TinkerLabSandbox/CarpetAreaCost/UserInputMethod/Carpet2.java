package dev.TinkerLabSandbox.CarpetAreaCost.UserInputMethod;

/*this class contends with the user input method for calculating carpet area cost.
 * It is part of a larger project that deals with carpet area calculations.
 */

public class Carpet2 {

    private double costPerSquareMeter;

    public Carpet2(double costPerSquareMeter) {
        if (costPerSquareMeter < 0) {
            throw new IllegalArgumentException("Cost per square meter cannot be negative.");
        }
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public double getCostPerSquareMeter() {
        return costPerSquareMeter;
    }
}
