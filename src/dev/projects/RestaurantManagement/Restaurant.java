package dev.projects.RestaurantManagement;

public class Restaurant {

    private Dish dish1;
    private Dish dish2;
    private Dish dish3;
    private Customer customer1;
    private Customer customer2;

    public Restaurant() {
        dish1 = new Dish("Idli", 50, true);
        dish2 = new Dish("Vada", 75, false);
        dish3 = new Dish("Dosa", 100, true);
        customer1 = new Customer("Alice", 500.00,"Dosa");
        customer2 = new Customer("Bob", 200.92,"Vada");
    }

    public Dish getDish1() {
        return dish1;
    }

    public Dish getDish2() {
        return dish2;
    }

    public Dish getDish3() {
        return dish3;
    }

    public Customer getCustomer1() {
        return customer1;
    }

    public Customer getCustomer2() {
        return customer2;
    }

    public void showMenu() {
        System.out.println("====== Menu ======");
        System.out.printf("Dish Name: %s for Rupees %.2f\n", dish1.getName(), dish1.getPrice());
        System.out.printf("Dish Name: %s for Rupees %.2f\n", dish2.getName(), dish2.getPrice());
        System.out.printf("Dish Name: %s for Rupees %.2f\n", dish3.getName(), dish3.getPrice());
        System.out.println("==================");
    }

    public void orderDishForCustomer(Customer customer, Dish dish) {
        if (dish.isAvailable() && customer.getWalletBalance() >= dish.getPrice()) {
            customer.orderDish(dish);
            System.out.println("Dish ordered by " + customer.getName() + ": " + dish.getName());
        } else if (!dish.isAvailable()) {
            System.out.println("Dish unavailable: " + dish.getName());
        } else {
            System.out.println("Insufficient Balance for " + customer.getName() + " to order " + dish.getName());
        }
    }

    public void cancelDishOrderForCustomer(Customer customer, Dish dish) {
        customer.cancelOrder(dish);
    }

    public void restockDish(Dish dish) {
        dish.restockDish();
        System.out.println("Dish restocked: " + dish.getName());
    }

    public void showRestaurantDetails() {
        System.out.println("====== Restaurant Details ======");
        System.out.printf("Dish Name: %s for Rupees %.2f\n", dish1.getName(), dish1.getPrice());
        System.out.printf("Dish Name: %s for Rupees %.2f\n", dish2.getName(), dish2.getPrice());
        System.out.printf("Dish Name: %s for Rupees %.2f\n", dish3.getName(), dish3.getPrice());
        System.out.printf("Customer Name: %s, Wallet Balance: %.2f\n", customer1.getName(), customer1.getWalletBalance());
        System.out.printf("Customer Name: %s, Wallet Balance: %.2f\n", customer2.getName(), customer2.getWalletBalance());
        System.out.println("===============================");
    }
}
