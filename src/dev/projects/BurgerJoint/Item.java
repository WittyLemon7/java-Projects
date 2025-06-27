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
