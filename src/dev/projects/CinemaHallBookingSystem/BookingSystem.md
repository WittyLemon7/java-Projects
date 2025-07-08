# Booking System Class
 ## 📌Problem Statement
A cinema hall booking system allows users to book tickets for movies, manage bookings, and view available movies. The system should handle different types of movies (e.g., Adventure, Comedy, Science Fiction) and provide a user-friendly interface for booking tickets.
## 💭Discussion
The booking system is designed to manage movie bookings efficiently, allowing users to select movies, book tickets, and view their bookings. It incorporates polymorphism to handle different types of movies, making the system flexible and extensible for future enhancements.
## 💡Walkthrough
```java
package dev.projects.CinemaHallBookingSystem;

public class BookingSystem {

    private CinemaHall cinemaHall;
    private MovieTicket movieTicket;

    public BookingSystem(CinemaHall cinemaHall, MovieTicket movieTicket) {
        this.cinemaHall = cinemaHall;
        this.movieTicket = movieTicket;
    }

    public void bookTicket(int numberOfTickets, PaymentSystem paymentSystem,double availableBalance) {
        synchronized (cinemaHall) { //  Ensures thread safety
            if (cinemaHall.getAvailableSeats() >= numberOfTickets) {
                //Step 1 : Attempt payment
                double totalPrice = calculateTotalPrice(numberOfTickets);
                paymentSystem.processPayment(availableBalance);
                //Step 2 : check payment status
                if (paymentSystem.getStatus().equals("Success")) {
                    for (int i = 0; i < numberOfTickets; i++) {
                        cinemaHall.bookSeat();
                    }//close the for loop
                    System.out.println(numberOfTickets + " tickets booked successfully for " + movieTicket.getMovieName());
                } else {
                    System.out.println("Payment failed. Unable to book tickets for " + movieTicket.getMovieName());
                }
//             //  cinemaHall.bookSeat();
//               // System.out.println("Ticket booked successfully for " + movieTicket.getMovieName());
            } else {
                System.out.println("No seats available for " + movieTicket.getMovieName());
            }
        }
    }
//    public void bookTicket() {
//        if (cinemaHall.getAvailableSeats() > 0) {
//            cinemaHall.bookSeat();
//            System.out.println("Ticket booked successfully for " + movieTicket.getMovieName());
//        } else {
//            System.out.println("No seats available for " + movieTicket.getMovieName());
//        }
//    }

    public double calculateTotalPrice(int numberOfTickets) {
        if (numberOfTickets > cinemaHall.getAvailableSeats()) {
            System.out.println("Only " + cinemaHall.getAvailableSeats() + " tickets are available. Adjusting total price...");
            numberOfTickets = cinemaHall.getAvailableSeats();
        }
        return movieTicket.bulkBooking(numberOfTickets);
    }

//    public double calculateTotalPrice(int numberOfTickets) {
//        return movieTicket.bulkBooking(numberOfTickets);
//    }


    public void cancelTicket(PaymentSystem paymentSystem) {
        if (cinemaHall.getAvailableSeats() < cinemaHall.getTotalSeats()) {
            cinemaHall.cancelSeat();
            paymentSystem.refundPayment();// Simulate refund
            System.out.println("Ticket cancelled successfully for " + movieTicket.getMovieName());
        } else {
            System.out.println("No active bookings to cancel.");
        }
    }

//    public void processPayment(double amount) {
//        // Simulate payment processing
//        System.out.println("Processing payment of $" + amount + " for " + movieTicket.getMovieName());
//        // Here you can add actual payment processing logic
//    }
//    public void cancelTicket() {
//        cinemaHall.cancelSeat();
//        System.out.println("Ticket cancelled successfully for " + movieTicket.getMovieName());
//    }

    public void displayBookingDetails() {
        System.out.println("\n===== Booking Details =====");
        System.out.println("Movie: " + movieTicket.getMovieName());
        System.out.println("Show Time: " + movieTicket.getShowTime());
        System.out.printf("Price: $%.2f\n", movieTicket.getPrice());
        System.out.println("Seat Type: " + movieTicket.getSeatType());
        System.out.println("Cinema Hall: " + cinemaHall.getHallName());
        System.out.println("Available Seats: " + cinemaHall.getAvailableSeats());
    }
    public void displayCinemaHallDetails() {
        System.out.println("\n===== Cinema Hall Details =====");
        System.out.println("Hall Name: " + cinemaHall.getHallName());
        System.out.println("Total Seats: " + cinemaHall.getTotalSeats());
        System.out.println("Available Seats: " + cinemaHall.getAvailableSeats());
    }
    public void displayMovieTicketDetails() {
        System.out.println("\n===== Movie Ticket Details =====");
        movieTicket.printTicketDetails();
    }
    public void displayAllDetails() {
        displayCinemaHallDetails();
        displayMovieTicketDetails();
        displayBookingDetails();
    }
}
```
## 🧪Logic & Explanation
- **BookingSystem Class**: This class manages the booking process, including ticket booking, cancellation, and displaying booking details.
- **Synchronization**: The `bookTicket` method is synchronized to ensure thread safety when multiple users attempt to book tickets simultaneously.
- **Payment Processing**: The system simulates payment processing through the `PaymentSystem` class, which handles payment status and refunds.
- **Booking Logic**: The `bookTicket` method checks for available seats, processes payment, and books tickets if payment is successful. It also handles cancellation of tickets.
- **Display Methods**: The system provides methods to display booking details, cinema hall details, and movie ticket details, allowing users to view their bookings and available seats.
- **Total Price Calculation**: The `calculateTotalPrice` method calculates the total price based on the number of tickets booked, adjusting for available seats if necessary.
- **Cancellation Logic**: The `cancelTicket` method allows users to cancel their bookings, refunding the payment and updating the available seats in the cinema hall.
- **User Interface**: The system provides a user-friendly interface for booking tickets, displaying details, and managing bookings, making it easy for users to interact with the cinema hall booking system.
- **Polymorphism**: The system can be extended to support different types of movies and ticket types, allowing for flexible booking options and enhancing the user experience.
- **Encapsulation**: The properties of the `BookingSystem`, `CinemaHall`, and `MovieTicket` classes are private, ensuring that they can only be accessed or modified through the provided methods. This encapsulation promotes data integrity and security.

## 🛠️Edge Cases
- **Insufficient Seats**: The system checks if there are enough available seats before booking tickets. If not, it informs the user and adjusts the total price accordingly.
- **Payment Failure**: If the payment fails, the system does not book tickets and informs the user about the failure.
- **Cancellation of Non-Existent Bookings**: The system checks if there are active bookings before allowing cancellation. If there are no bookings, it informs the user.

