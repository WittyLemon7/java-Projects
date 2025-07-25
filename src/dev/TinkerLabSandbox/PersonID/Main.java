package dev.TinkerLabSandbox.PersonID;

public class Main {
    public static void main(String[] args) {

        // Example usage of the PersonID class
        PersonID person1 = new PersonID("John", "Doe", 30);

        // Print the person's ID
        System.out.println("Person Name: " + person1.getFullName());// expected output "John Doe"
        System.out.println("Person Age: " + person1.getAge());// expected output 30
        System.out.println("Person ID: " + person1.isTeen());// expected output false
        System.out.println("Person ID: " + person1.toString());// expected output "PersonID{name='John', surname='Doe', age=30}"
    }
}
