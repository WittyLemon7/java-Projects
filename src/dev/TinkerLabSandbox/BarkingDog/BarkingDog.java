package dev.TinkerLabSandbox.BarkingDog;

public class BarkingDog {
    public static void main(String[] args) {

        // Test cases for the shouldWakeUp method
        shouldWakeUp(true, 1);  // Expected: "Wake up!"
        shouldWakeUp(false, 2); // Expected: "Dog is not barking."
        shouldWakeUp(true, 8);  // Expected: "It's not time to wake up."
        shouldWakeUp(true, 23); // Expected: "Wake up!"
        shouldWakeUp(false, 23);// Expected: "Dog is not barking."

    }
    //method to determine if dog is barking and if it is time to wake up
    public static void shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {// if dog is barking and time is before 8am or after 10pm
            System.out.println("Wake up!");
        } else if (!barking) {
            System.out.println("Dog is not barking.");
        } else {
            System.out.println("It's not time to wake up.");
        }
    }
}
