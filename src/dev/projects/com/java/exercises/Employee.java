package dev.projects.com.java.exercises;

public class Employee {

    private String name;
    private double salary;
    private int id;

    //constructor

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    //getters

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    //setter for salary

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //tostring method

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
