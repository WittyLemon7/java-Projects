package dev.TinkerLabSandbox.AnimalShelter;

/* this class represents Rabbit in Animal shelter project
* this class extends animal
 */

public class Rabbit extends Animal{

    //no variables

    //constructor
    public Rabbit(String name, int age, String breed, String color) {
        super(name, age, breed, color);
    }
    //override methods for animal behaviour
    @Override
    public String makeSound() {
        return  " Rabbit " + getName() + getBreed() + " stays silent, squeaks when excited";
    }
    @Override
    public  String eat() {
        return " Rabbit " + getName() + getBreed() + "eats nuts, prefers carrots";
    }
    @Override
    public  String sleep() {
        return  " Rabbit " + getName() + getBreed() + "sleeps";
    }
}
