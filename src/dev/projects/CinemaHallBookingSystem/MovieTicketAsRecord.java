package dev.projects.CinemaHallBookingSystem;

public class MovieTicketAsRecord {

    /* this class uses RECOD & aux constructor instead of the normal constructors
    * Record are  used here to create immutable data objects
    * all fields are private & final
     */
    public record MovieTicket(String movieName, String showTime, double price, String seatType) {
        // Auxiliary constructor with defaulting for seatType
        public MovieTicket(String movieName, String showTime, double price) {
            this(movieName, showTime, price, "REGULAR");
        }

        // Validation logic moves inside canonical constructor
        public MovieTicket {
            seatType = validateSeatType(seatType);
        }
        private static String validateSeatType(String seatType) {
            return switch (seatType.toUpperCase()) {
                case "REGULAR", "PRIME", "VIP" -> seatType.toUpperCase();
                default -> "REGULAR";
            };
        }
        public double bulkBooking(int numberOfTickets) {
            if (numberOfTickets < 1) throw new IllegalArgumentException("Invalid number of tickets");
            double totalPrice = price * numberOfTickets;
            if (numberOfTickets >= 5) totalPrice *= 0.9;
            return totalPrice;
        }
        // Add your ticket printing methods here, using record's auto accessors.
    }

}
