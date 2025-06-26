package dev.projects.com.java.exercises;

public class Movie {

    private String name;
    private int  duration;
    private double ticketPrice;

    //constructor
    public Movie(String name, int duration, double ticketPrice) {
        this.name = name;
        this.duration = duration < 0 ? 0 : duration;
        this.ticketPrice = ticketPrice < 0 ? 0 : ticketPrice;
    }
    //getters
    public String getName() {
        return name;
    }
    public int getDuration() {
        return duration;
    }
    public double getTicketPrice() {
        return ticketPrice;
    }
}
