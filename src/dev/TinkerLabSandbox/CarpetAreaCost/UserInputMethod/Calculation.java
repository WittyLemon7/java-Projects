package dev.TinkerLabSandbox.CarpetAreaCost.UserInputMethod;

/*this class contends with the cost calculation required to cover the floor area with carpet.
    * It will include methods to calculate the cost based on user input for area and cost per square meter.
 */

public class Calculation {

    private Floor2 floor;
    private Carpet2 carpet;

    public Calculation(Floor2 floor, Carpet2 carpet) {
        if (floor == null || carpet == null) {
            throw new IllegalArgumentException("Floor and Carpet cannot be null");
        }
        if (floor.getWidth() <= 0 || floor.getLength() <= 0) {
            throw new IllegalArgumentException("Floor dimensions must be greater than zero");
        }
        if (carpet.getCostPerSquareMeter() <= 0) {
            throw new IllegalArgumentException("Carpet cost per square meter must be greater than zero");
        }
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double area = floor.getWidth() * floor.getLength(); // Calculate the area of the floor
        return area * carpet.getCostPerSquareMeter(); // Calculate total cost based on area and cost per square meter
    }
}
