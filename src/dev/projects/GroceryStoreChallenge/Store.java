package dev.projects.GroceryStoreChallenge;

public class Store {

    private Item item1;
    private Item item2;
    private Item item3;
    private Customer customer;

    public Store() {
        item1 = new Item("Book", 10.99, true);
        item2 = new Item("Magazine", 5.99, true);
        item3 = new Item("Snack", 2.99, true);
        customer = new Customer("Alice", 50.00);
    }
    public Item getItem1() {
        return item1;
    }
    public Item getItem2() {
        return item2;
    }
    public Item getItem3() {
        return item3;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void sellItemToCustomer(Item item) {
        if (item.isAvailable() && customer.getWalletBalance() >= item.getPrice()) {
            customer.buyItem(item);
            System.out.println("Item sold to customer: " + item.getName());
        } else {
            System.out.println("Cannot sell item: " + item.getName());
        }
    }

    public void restockItem(Item item) {
        item.restockItem();
        System.out.println("Item restocked: " + item.getName());
    }
    public void showStoreDetails() {
        System.out.println("Store Items:");
        System.out.println("1. " + item1.getName() + " - $" + item1.getPrice());
        System.out.println("2. " + item2.getName() + " - $" + item2.getPrice());
        System.out.println("3. " + item3.getName() + " - $" + item3.getPrice());
        customer.getDetails();
    }
}
