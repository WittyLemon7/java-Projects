package dev.TinkerLabSandbox.Cars;

// this class defines a Ford car which is fuel powered & non electric or hybrid
public class Ford extends Cars{

    // no variables required here

    //constructor
    public Ford(int cylinders, String name, String colour) {
        super(cylinders, name, colour);
    }
    //override the move method
    @Override
    public String startEngine() {
        super.startEngine();
        return "Ford GT -> Engine Start";
    }

    @Override
    public String stopEngine() {
        super.stopEngine();
        return "Ford GT -> Engine Stop";
    }

    @Override
    public String  accelerate() {
        super.accelerate();
        return "Ford GT -> Accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return "Ford GT -> Braking";
    }
}
