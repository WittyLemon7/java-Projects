# Movie Ticket class
## Purpose
 This class represents a movie ticket booking system, allowing users to book, cancel, and manage movie tickets in a cinema hall.
## Class Definition
```java
package dev.projects.CinemaHallBookingSystem;

public class MovieTicket {

    private String movieName;
    private String showTime;
    private double price;
    private String seatType;

    public MovieTicket(String movieName, String showTime, double price, String seatType) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.price = price;
        this.seatType = validateSeatType(seatType);// Validate and set seat type
    }

    public String getMovieName() {
        return movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public double getPrice() {
        return price;
    }
    public String getSeatType() {
        return seatType;
    }

    public double bulkBooking(int numberOfTickets) {

        if (numberOfTickets < 1) {
            throw new IllegalArgumentException("Invalid number of tickets");
        }
        double totalPrice = price * numberOfTickets;
        if (numberOfTickets >= 5) {
            totalPrice *= 0.9; // 10% discount for bulk booking
        }
        return totalPrice;
    }

    private String validateSeatType(String seatType) {
        switch (seatType.toUpperCase()) {
            case "REGULAR":
            case "PRIME":
            case "VIP":
                return seatType.toUpperCase(); // Return valid seat type in uppercase
            default:
                return "REGULAR"; // Default to Regular if invalid input
        }
    }




//    public void seatSelection(String seatType) {
//        switch (seatType.toUpperCase()) {
//            case "REGULAR":
//                System.out.println("You have selected a Regular seat.");
//                break;
//            case "VIP":
//                System.out.println("You have selected a VIP seat.");
//                break;
//            case "IMAX":
//                System.out.println("You have selected an IMAX seat.");
//                break;
//            default:
//                return "REGULAR"; // Default to Regular if invalid input
//        }
//    }

    public void printTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Type: " + getSeatType());
        System.out.printf("Price: $%.2f\n", price);
    }
    public void printTicketDetails(String movieName, String showTime, String seatType, double price) {
        System.out.printf("Movie: %s | Show Time: %s | Seat Type: %s | Price: $%.2f\n", movieName, showTime, seatType, price);
    }
    public void printTicket() {
        printTicketDetails(movieName, showTime,seatType, price);
    }
//    public static void printTicket(String movieName, String showTime, double price) {
//        System.out.printf("Movie: %s | Show Time: %s | Price: $%.2f\n", movieName, showTime, price);
//    }
//    public void printTicket() {
//        printTicket(movieName, showTime, price);
//    }
}
```
## 💡Logic & Explanation
- **Constructor**: Initializes the movie ticket with the movie name, show time, price, and seat type. The seat type is validated to ensure it is one of the allowed types (Regular, Prime, VIP).
- **Getters**: Provides access to the movie name, show time, price, and seat type.
- **Bulk Booking**: The `bulkBooking` method calculates the total price for booking multiple tickets, applying a 10% discount if 5 or more tickets are booked.
- **Seat Type Validation**: The `validateSeatType` method ensures that the seat type is valid, defaulting to "Regular" if an invalid type is provided.
- **Ticket Details**: The `printTicketDetails` method prints the ticket details, including the movie name, show time, seat type, and price. It can also print ticket details with parameters for flexibility.
- **Print Ticket**: The `printTicket` method prints the ticket details using the instance variables, providing a convenient way to display the ticket information.
- **Static Print Method**: The `printTicket` method can also be used as a static method to print ticket details with parameters, allowing for flexibility in how ticket information is displayed.
- **Encapsulation**: The properties of the movie ticket are private, ensuring that they can only be accessed or modified through the provided methods. This encapsulation is a key principle of object-oriented programming, promoting data integrity and security.
- **Polymorphism**: The class can be extended to support different types of movie tickets or additional features, allowing for flexible ticket management and enhancing the user experience.
## Edge Cases
- **Invalid Seat Type**: If an invalid seat type is provided, it defaults to "Regular".
- **Bulk Booking with Invalid Number**: If the number of tickets for bulk booking is less than 1, an `IllegalArgumentException` is thrown.
- **Negative Price**: Ensure that the price is not negative when creating a movie ticket.
- **Null or Empty Movie Name**: Ensure that the movie name is not null or empty when creating a movie ticket.
- **Null or Empty Show Time**: Ensure that the show time is not null or empty when creating a movie ticket.
- **Null or Empty Seat Type**: Ensure that the seat type is not null or empty when creating a movie ticket.
- **Duplicate Movie Names**: Consider how to handle movie tickets with the same movie name but different show times or seat types.

