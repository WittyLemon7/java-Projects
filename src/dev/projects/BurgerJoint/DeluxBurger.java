package dev.projects.BurgerJoint;

public class DeluxBurger extends Burger {

    Item delux1;
    Item delux2;

    public DeluxBurger(String name, double price) {
        super(name,price);
    }
    public void addTopping(String extra1, String extra2,
                           String extra3, String extra4, String extra5) {
        delux1 = new Item("TOPPING","extra4",0.00);
        delux2 = new Item("TOPPING","extra5",0.00);
    }
    @Override
    public void printItemizesList() {
        super.printItemizesList();
        if (delux1 != null) {
            delux1.printItem();
        }
        if (delux2 != null) {
            delux2.printItem();
        }
    }
    @Override
    public double getExtraTopping(String toppingName) {
        return 0;
    }

}
