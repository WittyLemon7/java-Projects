package dev.TinkerLabSandbox.Cars;

/*
 * This class represents a Ferrari car.
 * this car is hybrid & has a V8 engine & electric motor.
 * It is part of a larger project that deals with car models and their specifications.
 */

public class Ferrari extends Cars {

    // no variable attributes

    //constructor

    public Ferrari(int cylinders, String name, String colour) {
        super(cylinders, name, colour);
    }
    //overriding the actions mwthods
    @Override
    public String startEngine() {
        return "Ferrari LaFerrari engine is starting with a roar!";
    }
    @Override
    public String stopEngine() {
        return "Ferrari LaFerrari engine is stopping smoothly!";
    }
    @Override
    public String accelerate() {
        return "Ferrari LaFerrari is accelerating with a powerful thrust!";
    }
    @Override
    public String brake() {
        return "Ferrari LaFerrari is braking with precision!";
    }
}
