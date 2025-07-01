## 📌Meal Order Class
The `MealOrder` class represents a complete meal order in the Burger Joint application. It encapsulates a burger, a side item, and a drink, allowing for the creation of a comprehensive meal order.

## 💭Discussion
The `MealOrder` class is a key component of the Burger Joint application, providing a way to represent a complete meal that includes a burger, a side item, and a drink. This class allows for the creation of meal orders that can be processed and displayed to customers.

## ➡️Walkthrough 👇
```java
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
```

## 💡Logic & Explanation
- **Constructor**: The `MealOrder` class has two constructors. The default constructor initializes a regular burger, a drink, and a side item with default values. The parameterized constructor allows for the creation of a meal order with specific burger, drink, and side item types.
- **Burger Type Check**: The constructor checks if the burger type is "delux". If it is, it creates a `DeluxBurger` instance; otherwise, it creates a regular `Burger` instance.
- **Calculate Total Price**: The `calculateTotalPrice` method computes the total price of the meal order. If the burger is a `DeluxBurger`, it returns the adjusted price of the burger. For regular burgers, it adds the prices of the side item and drink to the burger's price.
- **Print Itemized List**: The `printItemizesList` method prints the details of the meal order, including the burger, drink, and side item. If the burger is a `DeluxBurger`, it prints the drink and side item prices as 0.00, as they are included in the deluxe burger price.
- **Add Toppings**: The `addTopping` methods allow for adding toppings to the burger. The first method allows up to three toppings, while the second method allows for five toppings but only if the burger is a `DeluxBurger`. If a regular burger is used, it restricts the number of toppings to three.
- **Set Drink Size**: The `setDrinkSize` method allows for setting the size of the drink, which can be useful for customizing the meal order.
- **Encapsulation**: The properties of the `MealOrder` class are private, ensuring that they can only be accessed or modified through the provided methods. This encapsulation is a key principle of object-oriented programming, promoting data integrity and security.

## Edge Cases
- **Invalid Burger Type**: Ensure that the burger type provided in the constructor is valid. If an invalid type is given, handle it gracefully (e.g., throw an exception or default to a regular burger).
- **Empty Drink or Side Item**: Handle cases where the drink or side item strings are empty or null. This can be done by providing default values or throwing an exception.
- **Negative Prices**: Ensure that the prices of the burger, drink, and side item are not negative when creating a meal order. This can be validated in the constructors.
- **Duplicate Names**: Consider how to handle meal orders with the same burger, drink, or side item names but different prices. This can be managed by ensuring unique identifiers for each item.
- **Special Characters in Names**: Ensure that special characters in the burger, drink, or side item names are handled correctly, especially if they are used in display or storage. This can involve sanitizing input or escaping characters as needed.

## Use Cases
- **Meal Order Management**: The `MealOrder` class can be used
- to manage meal orders in the Burger Joint application, allowing customers to create and customize their meal orders with different burgers, drinks, and side items.

- **Order Processing**: It can be used to process meal orders, where each order consists of a burger, drink, and side item. This allows for easy calculation of total prices and itemized lists for customers.
- **Menu Display**: The `MealOrder` class can be used to display meal options to customers, showing the available burgers, drinks, and side items, along with their prices.

## ➡️Constructor Diagram
MealOrder
├── Burger / DeluxBurger
├── Item (Drink)
└── Item (Side)


## 🧠 Design Considerations
- Class handles both default and custom order flows.
- Responsibility is clearly divided: `MealOrder` orchestrates, `Burger`/`Item` handle specifics.
- Could expand to include discount logic, combo deals, or user input interfaces.
