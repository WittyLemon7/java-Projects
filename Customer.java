package com.java.exercises;

public class Customer {
    private String name;
    private  double creditLimit;
    private String email;

    public Customer(String name, String email) {
        this(name,1000.0,email);// calls another constructor

    }

    //no args constructors
    public Customer() {
        this.name = " ";
        this.creditLimit = 1000.0;
        this.email = " ";
    }



    //constructors

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    //only getters for this challenge


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
