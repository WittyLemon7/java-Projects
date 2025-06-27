package dev.projects.GroceryStoreChallenge;

public class Customer {

    private String name;
    private double walletBalance;
    private String lastPurchasedItem;

    public Customer(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
        this.lastPurchasedItem = null;
    }
    public String getName() {
        return name;
    }
    public double getWalletBalance() {
        return walletBalance;
    }
    public String getLastPurchasedItem() {
        return lastPurchasedItem;
    }
    public void buyItem(Item item) {
        if (item.isAvailable() && walletBalance >= item.getPrice()) {
            walletBalance -= item.getPrice();
            lastPurchasedItem = item.getName();
            item.purchaseItem();
        } else {
            System.out.println("Cannot purchase item: " + item.getName());
        }
    }
    public void getDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Wallet Balance: $" + walletBalance);
        System.out.println("Last Purchased Item: " + (lastPurchasedItem != null ? lastPurchasedItem : "None"));
    }


}
