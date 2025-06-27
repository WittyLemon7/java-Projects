package dev.projects.RestaurantManagement;

public class Dish {

    private String name;
    private double price;
    private boolean isAvailable;

    public Dish(String name,double price,boolean isAvailable) {
        //validation
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or Empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void orderDish() {
        if (isAvailable) {
            System.out.println(" Dish Ordered " + name);
            isAvailable = false;
        }
        else {
            System.out.println(" Dish not available for order " + name);
        }
    }
    public void restockDish() {
        isAvailable = true;
        System.out.println(" Dish restocked " + name);
    }
    public void getDetails() {
        System.out.println("===== Dish Details =====");
        System.out.println(" Dish name: " + name);
        System.out.println(" Dish price :" + price);
        System.out.println(" Dish available: " + isAvailable);
        System.out.println("=====================");
    }
}
