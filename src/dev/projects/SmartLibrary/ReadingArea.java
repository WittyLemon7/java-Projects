package dev.projects.SmartLibrary;

public class ReadingArea {

    private int numberOfSeats;

    public ReadingArea(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void reserveSeat(int seatNumber) {
        if (seatNumber > 0 && seatNumber <= numberOfSeats) {
            System.out.println("Seat " + seatNumber + " reserved.");
        } else {
            System.out.println("Invalid seat number.");
        }
    }

    public void releaseSeat(int seatNumber) {
        if (seatNumber > 0 && seatNumber <= numberOfSeats) {
            System.out.println("Seat " + seatNumber + " released.");
        } else {
            System.out.println("Invalid seat number.");
        }
    }
}
