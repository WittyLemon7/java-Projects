package dev.projects.CinemaHallBookingSystem;

public class Main {
    public static void main(String[] args) {

        CinemaHall screen1 = new CinemaHall("Screen 1", 200);
        MovieTicket ticketScreen1 = new MovieTicket("Avatar: The Way of Water", "7:00 PM", 12.50, "IMAX");
        BookingSystem bookingSystemScreen1 = new BookingSystem(screen1, ticketScreen1);
        PaymentSystem paymentSystemScreen1 = new PaymentSystem("Credit Card", 20.00, "TXN-123-H11", "Pending", "2023-10-01",
                "1230 PM", "John Doe", "john@example.com", "1234567890");
        bookingSystemScreen1.displayBookingDetails();
        bookingSystemScreen1.bookTicket(2, paymentSystemScreen1, 100.00);
        System.out.println("Total Price for 2 tickets: $" + bookingSystemScreen1.calculateTotalPrice(2));


//        CinemaHall cinemaHall = new CinemaHall("Hall 1", 100);
//        MovieTicket movieTicket = new MovieTicket("Top Gun: Maverick", "10:00 PM", 100.0, "REGULAR");
//        BookingSystem bookingSystem = new BookingSystem(cinemaHall, movieTicket);
//        bookingSystem.displayBookingDetails();
//        bookingSystem.bookTicket();
//        System.out.println("Total Price for 3 tickets: $" + bookingSystem.calculateTotalPrice(3));
//        bookingSystem.cancelTicket();
//        bookingSystem.displayBookingDetails();

    }

}
