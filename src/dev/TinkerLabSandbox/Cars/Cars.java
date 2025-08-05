package dev.TinkerLabSandbox.Cars;

/* This class defines base car
* will have attributes that define cars
* will extend other car class
 */
public class Cars {

    private boolean hasEngine;
    private int cylinders;
    private String name;
    private  String colour;
    private int wheels;

    //constructor
    //constructor initializes only no of cylinders, colour & name as all cars have engine & 4 wheels
    public Cars(int cylinders, String name, String colour) {
        this.hasEngine = true; // All cars have an engine
        this.wheels = 4;// all cars have 4 wheels
        this.cylinders = cylinders;
        this.name = name;
        this.colour = colour;
    }
    //getter & setter
    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        if (cylinders <= 0) {
            throw new IllegalArgumentException("Cylinders cannot be negative");
        }
         // Assuming a car must have at least 1 cylinder
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
         // Assuming a car must have a valid name
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour == null || colour.isEmpty()) {
            throw new IllegalArgumentException("Colour cannot be null or empty");
        }
         // Assuming a car must have a valid colour
        this.colour = colour;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = 4;
    }
    // Methods to simulate car actions
    // These methods can be overridden in subclasses for specific car behaviors
    public String startEngine() {
        return "The engine of " + name + " is starting.";
    }
    public String stopEngine() {
        return "The engine of " + name + " is stopping.";
    }
    public String accelerate() {
        return "The " + name + " is accelerating.";
    }
    public String brake() {
        return "The " + name + " is braking.";
    }
    // overriding toString method to provide a string representation of the car
    @Override
    public String toString() {
        return "Cars{" +
                "hasEngine=" + hasEngine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
