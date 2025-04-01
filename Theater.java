package com.java.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater {
    private List<Movie> movies;
    private Map<Movie, Integer> availableSeats; // Tracks current seat counts
    private Map<Movie, Integer> initialSeats;   // Tracks original seat counts for revenue calculation

    // Constructor
    public Theater() {
        this.movies = new ArrayList<>();
        this.availableSeats = new HashMap<>();
        this.initialSeats = new HashMap<>();
    }

    // Add a movie with initial seats
    public void addMovie(Movie movie, int seats) {
        movies.add(movie);
        availableSeats.put(movie, seats);
        initialSeats.put(movie, seats); // Store the original seat count
    }

    // Book tickets for a movie
    public void bookTickets(String movieName, int numSeats) {
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                int available = availableSeats.get(movie);
                if (available >= numSeats) {
                    availableSeats.put(movie, available - numSeats); // Deduct booked seats
                    System.out.println("Tickets booked successfully for " + movieName);
                } else {
                    System.out.println("Not enough seats available for " + movieName);
                }
                return;
            }
        }
        System.out.println("Movie not found: " + movieName);
    }

    // Get available seats for a movie
    public void getAvailableSeats(String movieName) {
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                int available = availableSeats.get(movie);
                System.out.println("Available seats for " + movieName + ": " + available);
                return;
            }
        }
        System.out.println("Movie not found: " + movieName);
    }

    // Calculate total revenue
    public void getTotalRevenue() {
        double totalRevenue = 0;
        for (Movie movie : movies) {
            int initial = initialSeats.get(movie);      // Original seat count
            int remaining = availableSeats.get(movie);  // Current seat count
            int sold = initial - remaining;             // Tickets sold
            totalRevenue += sold * movie.getTicketPrice(); // Calculate revenue
        }
        System.out.println("Total revenue: " + totalRevenue);
    }
}
