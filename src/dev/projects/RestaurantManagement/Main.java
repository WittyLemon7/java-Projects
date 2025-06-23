package dev.projects.RestaurantManagement;

public class Main {
    public static void main(String[] args) {

        // Step 1: Initialize the restaurant
        Restaurant restaurant = new Restaurant();

        // Step 2: Display the menu
        System.out.println("\n=== Displaying Menu ===");
        restaurant.showMenu();

        // Step 3: Show initial restaurant details
        System.out.println("\n=== Initial Restaurant Details ===");
        restaurant.showRestaurantDetails();

        // Step 4: Customer 1 orders a dish
        System.out.println("\n=== Customer 1 Orders Idli ===");
        restaurant.orderDishForCustomer(restaurant.getCustomer1(), restaurant.getDish1());

        // Step 5: Customer 2 tries to order an unavailable dish
        System.out.println("\n=== Customer 2 Tries to Order Vada ===");
        restaurant.orderDishForCustomer(restaurant.getCustomer2(), restaurant.getDish2());

        // Step 6: Customer 2 orders an available dish
        System.out.println("\n=== Customer 2 Orders Dosa ===");
        restaurant.orderDishForCustomer(restaurant.getCustomer2(), restaurant.getDish3());

        // Step 7: Display restaurant details after orders
        System.out.println("\n=== Restaurant Details After Orders ===");
        restaurant.showRestaurantDetails();

        // Step 8: Restock a dish and display menu
        System.out.println("\n=== Restocking Vada ===");
        restaurant.restockDish(restaurant.getDish2());
        System.out.println("\n=== Updated Menu After Restock ===");
        restaurant.showMenu();

        // Step 9: Customer 1 cancels their order
        System.out.println("\n=== Customer 1 Cancels Order ===");
        restaurant.cancelDishOrderForCustomer(restaurant.getCustomer1(), restaurant.getDish1());

        // Step 10: Display final restaurant details
        System.out.println("\n=== Final Restaurant Details ===");
        restaurant.showRestaurantDetails();

    }
}
