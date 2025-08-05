package dev.TinkerLabSandbox.AnimalShelter;

/* this base class represents a Dogl in an animal shelter system.
 * It has extended by animal class.
 * but it serves as a foundation for more specific animal classes.
 */
public class Dog extends Animal{

    // no variables

    //constructor
    public Dog(String name, int age, String breed, String color) {
        super(name, age, breed, color);
    }
    //override methods for animal brhaviour
    public String makeSound() {
        return  "Dog " + getName() + getBreed() + " barks, zoomies when excited";
    }

    @Override
    public String eat() {
        return " Dog " + getName() + getBreed() + " eats kibble, prefers chicken";
    }

    @Override
    public String sleep() {
        return " Dog " + getName() + getBreed() + " sleeps";
    }
}
