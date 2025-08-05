package dev.TinkerLabSandbox.Cars;

/* this class is a placeholder for the Rimac car model.
 * It is part of a larger project that deals with various car models.
 * this class will extend the Car class & this car is fully electric but has lectric motor
 * which will serve as its engine & the not of motors will be akin to no of cylinders
 */
public class Rimac extends Cars{

    // no variable attributes here

    //constructor
    public Rimac(int cylinders, String name, String colour) {
        super(cylinders, name, colour);
    }
    //overriding the actions methods
    @Override
    public String startEngine() {
        return "Rimac's C2 electric motor is starting silently.";
    }
    @Override
    public String stopEngine() {
        return "Rimac's C2 electric motor is stopping silently.";
    }
    @Override
    public String accelerate() {
        return "Rimac C2 is accelerating with electric power.";
    }
    @Override
    public String brake() {
        return "Rimac C2 is braking with regenerative braking system.";
    }
}
