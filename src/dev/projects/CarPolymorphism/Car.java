package dev.projects.CarPolymorphism;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void startEngine() {
        System.out.println("Engine started for " + description);
    }
    protected void runEngine() {
        System.out.println("Engine running for " + description);
    }
    public void drive() {
        System.out.println("Driving for " + getClass().getSimpleName());
        runEngine();
    }
}
