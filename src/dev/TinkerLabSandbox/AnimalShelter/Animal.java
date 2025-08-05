package dev.TinkerLabSandbox.AnimalShelter;

/* this base class represents a generic Animal in an animal shelter system.
 * It can be extended by specific animal types like Dog, Cat, etc.
 * but it serves as a foundation for more specific animal classes.
 */

public class Animal {

    private String name;
    private int age;
    private String breed;
    private String color;

    // Constructor
    public Animal(String name, int age, String breed, String color) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (breed == null || breed.isEmpty()) {
            throw new IllegalArgumentException("Breed cannot be null or empty");
        }
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Color cannot be null or empty");
        }
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        if (breed == null || breed.isEmpty()) {
            throw new IllegalArgumentException("Breed cannot be null or empty");
        }
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Color cannot be null or empty");
        }
        this.color = color;
    }
    // methods for animal behaviours
    public String makeSound() {
        return "Animal " + getName() + getBreed() + " makes a sound";
    }
    public String eat() {
        return "Animal " + getName() + getBreed() + " is eating";
    }
    public String sleep() {
        return "Animal " +getName() + getBreed() + " is sleeping";
    }
    // Override toString method to provide a string representation of the Animal object
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
