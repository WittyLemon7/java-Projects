# Cinema Hall class
## Problem Statement
Create a Cinema Hall class for thye Cinema Hall Booking System that caters to the Cinema Hall which has the hall or auditorium name, total seats & the number of seats available.
## Discussion
The Cinema Hall class is designed to manage the details of a cinema hall, including its name, total number of seats, and available seats. This class can be used in a cinema hall booking system to facilitate seat management and booking operations.
## Walkthrough
```java
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
``` 
## Logic & Explanation
-**Attributes**: The class has three private attributes: `hallName`, `totalSeats`, and `availableSeats`. The `availableSeats` is initialized to the total number of seats when a new CinemaHall object is created.
- **Constructor**: The constructor initializes the `hallName` and `totalSeats`, and sets `availableSeats` to the total number of seats, indicating that all seats are available initially.
- **Getters**: The class provides getter methods for `hallName`, `totalSeats`, and `availableSeats` to allow access to these attributes.
- **Booking and Cancelling Seats**: The `bookSeat` method decreases the `availableSeats` by one if there are seats available, while the `cancelSeat` method increases the `availableSeats` by one if not all seats are available. Both methods print appropriate messages based on the operation's success or failure.
- **Encapsulation**: The attributes are private, ensuring that they can only be accessed or modified through the provided methods, promoting data integrity and security.

## Edge Cases
- **Booking with No Available Seats**: The `bookSeat` method checks if there are available seats before booking. If not, it prints a message indicating that no seats are available.
- **Cancelling with All Seats Available**: The `cancelSeat` method checks if there are any booked seats before allowing a cancellation. If all seats are available, it prints a message indicating that no seats can be cancelled.
- **Invalid Seat Count**: Ensure that the `totalSeats` is a positive integer when creating a `CinemaHall` object. If an invalid value is provided, it should be handled appropriately, perhaps by throwing an exception or printing an error message.
- **Null or Empty Hall Name**: Ensure that the `hallName` is not null or empty when creating a `CinemaHall` object. If it is, handle it appropriately, perhaps by throwing an exception or printing an error message.
