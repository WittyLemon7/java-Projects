package dev.projects.CarPolymorphism;

public class ElectricCar extends Car {

    private int batterySize;
    private double avgKWPerCharge;

    public ElectricCar(String description, int batterySize, double avgKWPerCharge) {
        super(description);
        this.batterySize = batterySize;
        this.avgKWPerCharge = avgKWPerCharge;
    }
    public int getBatterySize() {
        return batterySize;
    }
    public double getAvgKWPerCharge() {
        return avgKWPerCharge;
    }
}
