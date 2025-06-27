package dev.projects.GroceryStoreChallenge;

public class Item {

    private String name;
    private double price;
    private boolean isAvailable;

    public Item(String name, double price, boolean isAvailable) {
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
    public void purchaseItem() {
        if (isAvailable) {
            System.out.println("Item purchased: " + name);
            isAvailable = false;
        } else {
            System.out.println("Item not available for purchase: " + name);
        }
    }
    public void restockItem() {
        isAvailable = true;
        System.out.println("Item restocked: " + name);
    }
}
