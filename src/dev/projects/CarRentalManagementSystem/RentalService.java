package dev.projects.CarRentalManagementSystem;

public class RentalService {

    private Car car;
    private Customer customer;

    public RentalService(Car car, Customer customer) {
        this.car = car;
        this.customer = customer;
    }
    public void rentCar() {
        if (!car.isRented()) {
            car.rented();
            System.out.println("Car rented to " + customer.getName());
        } else {
            System.out.println("Car is already rented.");
        }
    }
    public void returnCar() {
        if (car.isRented()) {
            car.returned();
            System.out.println("Car returned by " + customer.getName());
        } else {
            System.out.println("Car is already returned.");
        }
    }
    public void displayRentalDetails() {
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("License Number: " + customer.getLicense());
    }
}
