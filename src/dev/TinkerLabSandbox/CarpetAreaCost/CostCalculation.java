package dev.TinkerLabSandbox.CarpetAreaCost;


public class CostCalculation {

    private Floor1 floor;
    private Carpet1 carpet;

    // Constructor to initialize the cost calculation with a floor and carpet
    public CostCalculation(Floor1 floor, Carpet1 carpet) {
        if (floor == null || carpet == null) {//invalid input check
            throw new IllegalArgumentException("Floor and Carpet cannot be null");
        }
        this.floor = floor;
        this.carpet = carpet;
    }
    // Method to calculate the total cost of carpeting the floor
    public double calculateTotalCost() {
        return floor.getArea() * carpet.getCost();// Calculate total cost by multiplying floor area with carpet cost
    }

}
