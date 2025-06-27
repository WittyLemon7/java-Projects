package dev.projects.RestaurantManagement;

public class Customer {

    private String name;
    private double walletBalance;
    private String orderedDish;

    public Customer(String name,double walletBalance,String orderedDish) {
        //validation
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (walletBalance < 0) {
            throw new IllegalArgumentException(" Wallet balance cannot be negative");
        }
        this.name = name;
        this.walletBalance = walletBalance;
        this.orderedDish = null;
    }
    public String getName() {
        return name;
    }
    public double getWalletBalance() {
        return walletBalance;
    }
    public String orderedDish() {
        return orderedDish;
    }
    public void orderDish(Dish dish) {
        if (dish.isAvailable() && walletBalance >= dish.getPrice()) {
            walletBalance -= dish.getPrice();
            orderedDish = dish.getName();
            dish.orderDish();
            System.out.println(" Dish ordered " + dish.getName() + "for " + dish.getPrice());
        } else if ( dish.isAvailable()) {
            System.out.println(" Cannot order Dish " + dish.getName());
        } else {
            System.out.println("insufficient balance " + dish.getName());
        }
    }
    public void cancelOrder(Dish dish) {
        if (orderedDish != null && orderedDish.equals(dish.getName())) {
            walletBalance += dish.getPrice(); // Refund the price
            orderedDish = null; // Clear the order
            dish.restockDish(); // Restock the dish
            System.out.println("Order cancelled for dish: " + dish.getName());
        } else {
            System.out.println("No order to cancel or mismatched dish.");
        }
    }




    public void getDetails() {
        System.out.println("=== Customer Details ===");
        System.out.println(" Customer Name " + name);
        System.out.println(" Customer wallet Balance " + walletBalance);
        System.out.println(" Customer Ordered Dish " + orderedDish != null ? orderedDish : "None");
        System.out.println("========================");
    }
}
