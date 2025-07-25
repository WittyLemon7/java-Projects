package dev.TinkerLabSandbox.PersonID;

public class PersonID {

    String firstName;
    String lastName;
    int age;

    // Constructor to initialize the PersonID object
    public PersonID(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //getter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Age cannot be negative or exceed 100.");
        }
        this.age = age;
    }
    // Method to get the full name of the person
    public String getFullName() {
        // Check if firstName and lastName are not null or empty
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("First name and last name cannot be empty.");
        } else if (firstName == null || getFirstName().isEmpty()) {
            return lastName; // If first name is empty, return only last name
        } else if (lastName == null || getLastName().isEmpty()) {
            return firstName; // If last name is empty, return only first name
        }
        return firstName + " " + lastName;
    }
    // Method to check if the person is a teenager
    public boolean isTeen() {
        // Check if age is between 13 and 19 (inclusive)
        return age >= 13 && age <= 19;
    }
    // Method to print the person's ID
    public String toString() {
        return "PersonID{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
