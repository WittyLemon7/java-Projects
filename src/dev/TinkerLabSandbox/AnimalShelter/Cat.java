package dev.TinkerLabSandbox.AnimalShelter;

/* This class represents a cat in the animal shelter project
* this class extends animal
 */
public class Cat extends Animal{

    // no variables

    //constructor
    public Cat(String name, int age, String breed, String color) {
        super(name, age, breed, color);
    }
    //overriden method for behaviour
    @Override
    public String makeSound() {
        return  " Cat " + getName() + getBreed() + " purrs & meows";
    }
    @Override
    public String eat() {
        return  " Cat " + getName() + getBreed() + " eats kibble , prefers fish";
    }
    @Override
    public String sleep() {
        return  " Cat " + getName() + getBreed() + "sleeps";
    }
}
