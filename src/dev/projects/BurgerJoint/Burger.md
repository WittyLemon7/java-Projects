## Burger class
The `Burger` class represents a burger in the Burger Joint application. It is used to create and manage burgers, including their ingredients and prices.

## Discussion
The `Burger` class is a fundamental part of the Burger Joint application, encapsulating the properties and behaviors of a burger. It allows for the creation of burgers with specific ingredients and prices, and provides methods to retrieve these details.

## Walkthrough
```java
public class Burger {
    private String name;
    private String ingredients;
    private double price;
```
```java
    public Burger(String name, String ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", price=" + price +
                '}';
    }
}
```
## Logic & Explanation
- **Constructor**: The constructor initializes the burger with a name, ingredients, and price. It ensures that these properties are set when a new burger is created.
- **Getters**: The `getName`, `getIngredients`, and `getPrice` methods provide access to the burger's properties, allowing other parts of the application to retrieve this information.
- **toString Method**: The `toString` method provides a string representation of the burger, which is useful for debugging and logging purposes. It formats the burger's properties in a readable way.
- **Encapsulation**: The properties of the burger are private, ensuring that they can only be accessed or modified through the provided methods. This encapsulation is a key principle of object-oriented programming, promoting data integrity and security.
- **Immutability**: While the properties can be set during construction, they are not designed to be changed afterward, promoting immutability. This is a common practice in Java to ensure that objects remain consistent throughout their lifecycle.


## Edge Cases
- **Invalid Price**: Ensure that the price is not negative when creating a burger.
- **Empty Ingredients**: Handle cases where the ingredients string is empty or null.
- **Null Name**: Ensure that the burger name is not null or empty.
- **Duplicate Names**: Consider how to handle burgers with the same name but different ingredients or prices.
- **Special Characters in Ingredients**: Ensure that special characters in the ingredients string are handled correctly, especially if they are used in display or storage.

