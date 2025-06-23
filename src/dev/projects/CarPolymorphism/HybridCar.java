package dev.projects.CarPolymorphism;

public class HybridCar extends Car{

    private int batterySize;
    private double avgKWPerCharge;
    private double avgKmPerLitre;
    private int cylinders;

    public HybridCar(String description, int batterySize, double avgKWPerCharge, double avgKmPerLitre, int cylinders) {
        super(description);
        this.batterySize = batterySize;
        this.avgKWPerCharge = avgKWPerCharge;
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKWPerCharge() {
        return avgKWPerCharge;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
