package dev.projects.InheritanceComputerFactory;

public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    // Constructor
    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}//close class Product
class Monitor extends Product {

    private String resolution;
    private int size;


    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public Monitor(String model, String manufacturer, String resolution, int size) {
        super(model, manufacturer);
        this.resolution = resolution;
        this.size = size;
    }
    public void drawPixelArt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

}//close class Monitor
class Motherboard extends Product {

    private int ramSlots;
    private int cardSlots;
    private  String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is loading...");
    }

}//close class Motherboard
class Case extends Product {

    private String powerSupply;

    public Case(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public Case(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

}



