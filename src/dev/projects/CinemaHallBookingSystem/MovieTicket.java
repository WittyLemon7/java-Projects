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
