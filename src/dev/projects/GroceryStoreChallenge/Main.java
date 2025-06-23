package dev.projects.GroceryStoreChallenge;

public class Main {
    public static void main(String[] args) {

        // Step 1: Create a Store
        Store store = new Store();

        // Step 2: Show initial store details
        System.out.println("=== Initial Store Details ===");
        store.showStoreDetails();

        // Step 3: Customer buys an item
        System.out.println("\n=== Customer Buys Item ===");
        store.sellItemToCustomer(store.getItem1()); // Buying the "Book"

        // Step 4: Show store details after purchase
        System.out.println("\n=== Store Details After Purchase ===");
        store.showStoreDetails();

        // Step 5: Try to buy an unavailable item
        System.out.println("\n=== Attempting to Buy Unavailable Item ===");
        store.sellItemToCustomer(store.getItem1()); // Attempting to buy "Book" again

        // Step 6: Restock an item
        System.out.println("\n=== Restocking Item ===");
        store.restockItem(store.getItem1()); // Restocking the "Book"

        // Step 7: Show store details after restock
        System.out.println("\n=== Store Details After Restock ===");
        store.showStoreDetails();

        // Step 8: Customer buys another item
        System.out.println("\n=== Customer Buys Another Item ===");
        store.sellItemToCustomer(store.getItem2()); // Buying the "Magazine"

        // Step 9: Show final store details
        System.out.println("\n=== Final Store Details ===");
        store.showStoreDetails();

    }
}
