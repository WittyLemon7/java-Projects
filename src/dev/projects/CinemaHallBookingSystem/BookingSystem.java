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
