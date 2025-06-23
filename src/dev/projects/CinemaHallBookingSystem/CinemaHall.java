package dev.projects.CinemaHallBookingSystem;

public class CinemaHall {

    private String hallName;
    private int totalSeats;
    private int availableSeats;

    public CinemaHall(String hallName, int totalSeats) {
        this.hallName = hallName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats; // Initially all seats are available
    }

    public String getHallName() {
        return hallName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Seat booked successfully in " + hallName);
        } else {
            System.out.println("No seats available in " + hallName);
        }
    }

    public void cancelSeat() {
        if (availableSeats < totalSeats) {
            availableSeats++;
            System.out.println("Seat cancelled successfully in " + hallName);
        } else {
            System.out.println("All seats are already available in " + hallName);
        }
    }
}
