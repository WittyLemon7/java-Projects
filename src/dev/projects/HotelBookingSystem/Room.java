package dev.projects.HotelBookingSystem;

public class Room {

    // This class represents a hotel room with a type, price, and duration of stay.
    // It includes methods to get the type, price, duration, and adjusted price based on the duration.
    // It also includes methods to print the room details.

    // Attributes
    public static final double SINGLE_ROOM_PRICE = 100.00; // Price for a single room
    public static final double DOUBLE_ROOM_PRICE = 150.00; // Price for a double room


    private String type;
    private int duration;
    private double price;

    // Constructor
    public Room(String type) {
        if (type.equalsIgnoreCase("SINGLE")) {
            this.type = "SINGLE ROOM";
            this.price = SINGLE_ROOM_PRICE;
        } else if (type.equalsIgnoreCase("DOUBLE")) {
            this.type = "DOUBLE ROOM";
            this.price = DOUBLE_ROOM_PRICE;
        } else {
            this.type = "UNKNOWN";
            this.price = 0.00; // Default price for unknown type
        }
    }

    //    public Room(String type, double price) {
//        if (type.equalsIgnoreCase("SINGLE") || type.equalsIgnoreCase("DOUBLE")) {
//            this.type = type;
//        } else {
//            this.type = "UNKNOWN";
//        }
//        }if (price > 0) {
//            this.price = price;
//        } else {
//            this.price = 0.00;
//        }if above for dynamic pricing
//        if (price ==100.00 || price == 150.00) {
//            this.price = price;
//        } else {
//            this.price = 0.00;
//        }
//        this.duration = 0; // Default duration
//    }
    public String getType() {
//        if (type.equalsIgnoreCase("SINGLE") || type.equalsIgnoreCase("DOUBLE")) {
//            return type + " Room";
//        }
        return type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price; // Set price only if it's non-negative
        } else {
            this.price = 0.00; // Default to 0.00 for negative prices
        }
    }
    public int getDuration() {
        return Math.max(duration, 1); // ✅ Ensures at least 1 night, returning an integer
    }
    //    public String getDuration() {
//        if (duration < 1) return "1 day"; // Default to 1 day
//        return duration + " days"; // Dynamically return based on duration
//    }
    public double getAdjustedPrice() {
        return price * Math.max(duration, 1); // Ensures at least 1 day
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public static void printItem(String type, double price) {
        System.out.printf("%-20s $%.2f\n", type, price);
    }
    public void printItem() {
        printItem(getType(), getAdjustedPrice());
    }


//    private String type;
//    private double price;
//    private int duration;
//
//    public Room(String type, double price) {
//        this.type = type;
//        this.price = price;
//        this.duration = 0;
//    }
//    public String getType() {//
//        if (type.equalsIgnoreCase("SINGLE") || type.equalsIgnoreCase("DOUBLE")) {
//            return type + " Room";
//        }
//        return type;
//    }
//    public double getPrice() {
//        return price;
//    }
//    public String getDuration() {
//        if (duration < 1) return "1 day"; // Default to 1 day
//        return duration + " days"; // Dynamically return based on duration
//    }
//    public double getAdjustedPrice() {
//        return price * duration;
//    }
//
////    public double getAdjustedPrice() {//
////        return switch (type) {
////            case "SINGLE" -> getPrice() - 100.00;
////            case "DOUBLE" -> getPrice() + 150.00;
////            default -> getPrice();
////        };
////    }
//    public void setDuration(int duration) {
//        this.duration = duration;
//    }
//    public static void printItem(String type, double price) {
//        System.out.printf("%-20s $%.2f\n", type, price);
//    }
//    public void printItem() {
//        printItem(getType(), getAdjustedPrice());
//    }
}
