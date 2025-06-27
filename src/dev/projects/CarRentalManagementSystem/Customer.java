package dev.projects.CarRentalManagementSystem;

public class Customer {

    private String name;
    private String license;

    public Customer(String name, String license) {
        this.name = name;
        this.license = license;
    }
    public String getName() {
        return name;
    }
    public String getLicense() {
        return license;
    }
    public void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("License Number: " + license);
    }
}
