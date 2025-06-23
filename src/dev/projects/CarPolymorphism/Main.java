package dev.projects.CarPolymorphism;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("2019 Ferrari 458 Italia");  // Ensure correct constructor
        runRace(car1);

        Car ferrari = new GasPoweredCar("2019 Red Ferrari 458 Italia", 10.4, 8);
        runRace(ferrari);

        Car tesla = new ElectricCar("2023 Silver Tesla Model X", 75, 468);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2024 Yellow Ferrari SF90", 8, 16, 8, 8);
        runRace(ferrariHybrid);


    }


    public static void runRace(Car car1) {
        car1.startEngine();
        car1.drive();
    }

}
