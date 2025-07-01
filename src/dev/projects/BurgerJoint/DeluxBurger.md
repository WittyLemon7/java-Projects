## 📌Deluxe Burger Class
The `DeluxeBurger` class extends the
`Burger` class to represent a deluxe burger in the Burger Joint application. It adds additional features such as a side item and a drink, enhancing the burger experience.

## 💭Discussion
The `DeluxeBurger` class builds upon
the `Burger` class by adding properties for a side item and a drink. This allows for a more comprehensive representation of a deluxe burger, which typically includes additional items beyond just the burger itself.

## 👇Walkthrough
```java
public class DeluxeBurger extends Burger {
    private String sideItem;
    private String drink;

    public DeluxeBurger(String name, String ingredients, double price, String sideItem, String drink) {
        super(name, ingredients, price);
        this.sideItem = sideItem;
        this.drink = drink;
    }

    public String getSideItem() {
        return sideItem;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "DeluxeBurger{" +
                "name='" + getName() + '\'' +
                ", ingredients='" + getIngredients() + '\'' +
                ", price=" + getPrice() +
                ", sideItem='" + sideItem + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
```
## 💡Logic & Explanation
- **Inheritance**: The `DeluxeBurger` class extends the `Burger` class, inheriting its properties and methods. This allows the deluxe burger to have all the features of a regular burger while adding new ones.
- **Constructor**: The constructor initializes the deluxe burger with a name, ingredients, price, side item, and drink. It calls the superclass constructor
- `super(name, ingredients, price)` to set the common burger properties, ensuring that the base class is properly initialized.
- **Getters**: The `getSideItem` and `getDrink` methods provide access to the side item and drink properties, allowing other parts of the application to retrieve this information.
- **toString Method**: The `toString` method provides a string representation of the deluxe burger, including all its properties. This is useful for debugging and logging purposes, formatting the deluxe burger's details in a readable way.
- **Encapsulation**: The properties of the deluxe burger are private, ensuring that they can only be accessed or modified through the provided methods. This encapsulation is a key principle of object-oriented programming, promoting data integrity and security.

## Edge Cases
- **Invalid Price**: Ensure that the price is not negative when creating a deluxe burger.
- **Empty Side Item or Drink**: Handle cases where the side item or drink string is empty or null.
- **Null Name**: Ensure that the deluxe burger name is not null or empty.
- **Duplicate Names**: Consider how to handle deluxe burgers with the same name but different ingredients, side items, or drinks.
- **Special Characters in Ingredients**: Ensure that special characters in the ingredients string are handled correctly, especially if they are used in display or storage.
- **Side Item and Drink Compatibility**: Ensure that the side item and drink are appropriate for the type of burger being created, maintaining a logical consistency in the menu offerings.

