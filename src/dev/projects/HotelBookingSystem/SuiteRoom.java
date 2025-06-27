package dev.projects.HotelBookingSystem;

public class SuiteRoom extends Room {

    private static final double SUITE_ROOM_PRICE = 250.00;

    private int duration = 1; // Default duration is 1 day

    public SuiteRoom(int duration) {
        super("SUITE");
        this.duration = Math.max(duration, 1); // Ensure at least 1 day duration
        if (getType().equalsIgnoreCase("SUITE")) {
            super.setPrice(SUITE_ROOM_PRICE);
        }
    }



//    public SuiteRoom(int duration) {
//        super("SUITE", SUITE_ROOM_PRICE);
    //  this.duration = Math.max(duration, 1); // Ensure at least 1 day duration
//        if (type.equalsIgnoreCase("SUITE")) {
//            this.suiteRoom = "SUITE ROOM";
//        } else {
//            this.suiteRoom = "UNKNOWN";
//        }
    //}
//    public SuiteRoom() {
//        super("SUITE", SUITE_ROOM_PRICE);


//        if (type.equalsIgnoreCase("SUITE")) {
//            this.suiteRoom = "SUITE ROOM";
//        } else {
//            this.suiteRoom = "UNKNOWN";
//        }
//        if (price == SUITE_ROOM_PRICE) {
//            this.price = price;
//       } //else {
//            this.price = 0.00;
//        }

    //    public String getType() {
//        return super.getType();
//    }
    public double getPrice() {
        return super.getPrice();
    }
    public int getDuration() {
        return Math.max(duration, 1); // ✅ Ensures at least 1 night, returning an integer
    }
    //    public String getDuration() {
//        if (duration < 1) return "1 day"; // Default to 1 day
//        return duration + " days"; // Dynamically return based on duration
//    }
    public double getAdjustedPrice() {
        return super.getPrice() * Math.max(duration, 1); // Ensures at least 1 day
    }
    public void setDuration(int duration) {
        this.duration = Math.max(duration,1);
    }

    public void displayDetails() {
        System.out.println("\n===== Room Details =====");
        System.out.println("Room Type: " + getType());
        System.out.printf("Base Price: $%.2f\n", getPrice());
        System.out.printf("Duration: %s\n", getDuration());
        System.out.printf("Total Price: $%.2f\n", getAdjustedPrice());
        System.out.println("\n✅ Included Free Amenities:");
        System.out.println("✔ WiFi Access");
        System.out.println("✔ Complimentary Breakfast");
    }

    //    public void displayDetails() {
//        System.out.println("Room Type: " + getType());
//        System.out.printf("Base Price: $%.2f\n", getPrice());
//        System.out.printf("Duration: %s\n", getDuration());
//        System.out.printf("Total Price: $%.2f\n", getAdjustedPrice());
//        System.out.println("\n✅ Included Free Amenities:");
//        System.out.println("✔ WiFi Access");
//        System.out.println("✔ Complimentary Breakfast");
//
//    }
    public static void printItem(String type, double price) {
        System.out.printf("%-20s $%.2f\n", type, price);
    }
    public void printItem() {
        printItem(getType(), getAdjustedPrice());
    }
    public void displayBookingDetails() {
        System.out.println("\n===== Suite Room Booking Details =====");
        System.out.printf("Room Type: %s\n", getType());
        System.out.printf("Base Price: $%.2f\n", getPrice());
        System.out.printf("Duration: %s\n", getDuration());
        System.out.printf("Total Price: $%.2f\n", getAdjustedPrice());
    }
}
