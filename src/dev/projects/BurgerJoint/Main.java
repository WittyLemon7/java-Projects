package dev.projects.BurgerJoint;

public class Main {
    public static void main(String[] args) {

        MealOrder deluxMeal = new MealOrder("Delux", "Coke", "Fries");
        deluxMeal.addTopping("Avocado", "Cheese", "Egg", "Bacon", "Mayo");
        deluxMeal.setDrinkSize("LARGE");
        deluxMeal.printItemizesList();
        System.out.println("=====================================");


//        MealOrder secondMeal = new MealOrder("BLT", "Sprite","Chilli");
//        secondMeal.addTopping("BACON","CHEESE", "Mayo");
//        secondMeal.setDrinkSize("LARGE");
//        secondMeal.printItemizesList();



//MealOrder reularMeal = new MealOrder();
//reularMeal.printItemizesList();
//reularMeal.addTopping("Avocado","Cheese", "Mayo");
//reularMeal.setDrinkSize("Large");
//reularMeal.printItemizesList();

        // Uncomment the following lines to test the Car classes

//        Burger burger = new Burger("Regular",5.00);
//        burger.addTopping("Avocado","Cheese", "Mayo");
//        burger.printItem();

//        Item coke = new Item("Coke","Drink", 2.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item jalpenos = new Item("Jalapenos","Topping", 1.50);
//        jalpenos.printItem();

    }
}
