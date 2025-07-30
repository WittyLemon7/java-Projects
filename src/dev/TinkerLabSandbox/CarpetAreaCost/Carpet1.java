package dev.TinkerLabSandbox.CarpetAreaCost;

public class Carpet1 {

    private double cost;

    //constructor to initialize the cost
    public Carpet1(double cost) {
        this.cost = cost < 0 ? 0 : cost; // Ensure cost is not negative
    }
    //getter for cost
    public double getCost() {
        return cost;
    }


}
