
## 📌Item Class
The `Item` class represents a generic item in the Burger Joint application. It serves as a base class for specific items like burgers, sides, and drinks, encapsulating common properties and behaviors.

## 💭Discussion
The `Item` class is a foundational part of the Burger Joint application, providing a common structure for all items in the menu. It allows for the creation of items with specific names and prices, and provides methods to retrieve these details. This class can be extended by other classes to create more specific item types.

## 👇Walkthrough
```java
package dev.projects.BurgerJoint;

public class Item {

    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM"; // Default size

    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if (type.equals("DRINK") || type.equals("SIDE")) {
            return name + " " + size;
        }
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getPrice() - 0.50;
            case "LARGE" -> getPrice() + 1.00;
            default -> getPrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%-20s $%.2f\n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}

```
## 💡Logic & Explanation
- **Constructor**: The constructor initializes the item with a name, type, and price. It ensures that these properties are set when a new item is created. The name and type are converted to uppercase for consistency.
- **Getters**: The `getName` method returns the name of the item, appending the size for drinks and sides. The `getPrice` method returns the base price of the item.
- **Adjusted Price**: The `getAdjustedPrice` method calculates the price based on the size of the item. It applies a discount for small items and a surcharge for large items, while returning the base price for medium items.
- **Size Management**: The `setSize` method allows the size of the item to be changed, which can affect the price.
- **Static Print Method**: The `printItem` method is a static utility that formats and prints the item name and price. It can be used to display items in a consistent format.
- **Instance Print Method**: The `printItem` method is an instance method that prints the item using its name and adjusted price, leveraging the static print method for formatting.



### Edge Cases
- **Invalid Price**: Ensure that the price is not negative when creating an item.
  - 
- **Empty Name**: Handle cases where the name string is empty or null.
- **Duplicate Names**: Consider how to handle items with the same name but different prices.
- **Special Characters in Name**: Ensure that special characters in the name string are handled correctly, especially if they are used in display or storage.

### Use Cases
- **Menu Management**: The `Item` class can be used to manage items in the menu, allowing for easy addition and retrieval of items.
- **Order Processing**: It can be used to process orders, where each item in the order is an instance of the `Item` class or its subclasses.

## Design Considerations
- **Extensibility**: The `Item` class is designed to be extended by other classes, such as `Burger`, `Drink`, and `Side`. This allows for specific behaviors and properties to be added while maintaining a common structure.

## ➡️ Constructor Diagram

