package dev.projects.BurgerJoint;

public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {//constructor with default values
        this("Regular", "Coke", "Fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {//constructor with parameters
        if (burgerType.equalsIgnoreCase("delux")){//checks if the burger is delux
            this.burger = new DeluxBurger(burgerType, 10.00);
        } else {//if the burger is regular
            this.burger = new Burger(burgerType, 5.00);
        }
        this.drink = new Item(drinkType, "Drink", 2.50);
        this.side = new Item(sideType, "Side", 2.00);

    }

    public double calculateTotalPrice() {//calculates the total price of the meal order
        if (burger instanceof DeluxBurger) {//instabce of checks if the burger is delux
            return burger.getAdjustedPrice();//if it is delux, return the burger price
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();

    }
    public void printItemizesList() {//prints the itemized list of the meal order
        System.out.println("\n===== Meal Order =====");
        burger.printItem();
        if (burger instanceof DeluxBurger) {
            Item.printItem(drink.getName(), 0.00);//if the burger is delux, print the drink price as 0.00
            Item.printItem(side.getName(), 0.00);//if the burger is delux, print the side price as 0.00
        } else {//if the burger is regular
            drink.printItem();//print the drink price
            side.printItem();//print the side price
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL", calculateTotalPrice());
    }

    public void addTopping(String extra1, String extra2, String extra3) {//adds toppings to the burger
        burger.addTopping(extra1, extra2, extra3);
    }
    public void addTopping(String extra1, String extra2, String extra3, String extra4,String extra5) {
        if (burger instanceof DeluxBurger db) {//instance of assigned to db&# checks if the burger is delux
            db.addTopping(extra1, extra2, extra3, extra4, extra5);//cast the burger to delux burger and add toppings
        } else {
            System.out.println("Cannot add more than 3 toppings to a regular burger.");
            burger.addTopping(extra1, extra2, extra3);//if the burger is regular, add the toppings
        }
    }
    public void setDrinkSize(String size) {//sets the size of the drink
        drink.setSize(size);
    }
}
