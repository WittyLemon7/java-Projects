package dev.projects.CarPolymorphism;

public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int  cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("All 8 cylinders fired up for " + getDescription());
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas usage exceeds the average:  %.2f %n "+  avgKmPerLitre);
    }
}
