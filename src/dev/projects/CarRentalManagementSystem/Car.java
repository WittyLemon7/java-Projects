package dev.projects.CarRentalManagementSystem;

public class Car {

    private String model;
    private String registrationNumber;
    private boolean isRented;

    public Car(String model, String registrationNumber, boolean isRented) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.isRented = isRented;
    }
    public String getModel() {
        return model;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public boolean isRented() {
        return isRented;
    }
    public void rented() {
        if (!isRented) {
            System.out.println("Car is rented.");
            isRented = true;
        } else {
            System.out.println("Car is already rented.");
        }
    }
    public void returned() {
        if (isRented) {
            System.out.println("Car is returned.");
            isRented = false;
        } else {
            System.out.println("Car is already returned.");
        }

    }
}

