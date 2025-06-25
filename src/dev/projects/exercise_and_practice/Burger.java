package dev.projects.BurgerJoint;


public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, "Burger", price);
//        this.extra1 = extra1;
//        this.extra2 = extra2;
//        this.extra3 = extra3;
    }

    @Override
    public String getName() {
        return super.getName() + "Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice() +
                ((extra1 == null) ?  0 : extra1.getAdjustedPrice())  +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice())  +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice()) ;
    }
    public double getExtraTopping(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE", "MAYO" -> 1.00;
            case "BACON", "EGG", "HAM" -> 1.50;
            case "BBQ", "KETCHUP", "MUSTARD" -> 0.50;
            default -> 0;
        };
    }
    public void addTopping(String extra1, String extra2, String extra3) {
        this.extra1 = new Item(extra1, "Topping", getExtraTopping(extra1));
        this.extra2 = new Item(extra2, "Topping", getExtraTopping(extra2));
        this.extra3 = new Item(extra3, "Topping", getExtraTopping(extra3));
    }

    @Override
    public void printItem() {
        printItemizesList();
        System.out.println("-".repeat(30));
        super.printItem();
    }

    public void printItemizesList() {// This method prints the itemized list
        // of the burger and its extras
        printItem("BASE BURGER",getAdjustedPrice());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }

    }



}
