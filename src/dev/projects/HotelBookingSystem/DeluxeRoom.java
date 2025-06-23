package dev.projects.HotelBookingSystem;

public class DeluxeRoom extends Room{

    private static final double DELUXE_ROOM_PRICE = 200.00;

    private int duration = 1;

    public DeluxeRoom() {
        super("DELUXE");
        this.duration = Math.max(duration, 1);// Ensure at least 1 day duration
        if (getType().equalsIgnoreCase("DELUXE")) {
            super.setPrice(DELUXE_ROOM_PRICE);
        }
    }

    public double getPrice() {
        return super.getPrice();
    }
    public int getDuration() {
        return Math.max(duration, 1); // ✅ Ensures at least 1 night, returning an integer
    }





    public void setDuration(int duration) {
        this.duration = Math.max(duration, 1);
    }

    public static void printItem(String type, double price) {
        System.out.printf("%-20s $%.2f\n", type + " Room", price);
    }
    public void printItem() {
        printItem(getType(), getAdjustedPrice());
    }
    public double getAdjustedPrice() {
        double totalPrice = super.getAdjustedPrice();
        if (super.getDuration() >= 10) { // ✅ Correct: Compare as an integer
            totalPrice *= 0.90; // ✅ 10% discount for stays of 10+ nights
        } else if (super.getDuration() >= 5) { // ✅ Correct comparison
            totalPrice *= 0.95; // ✅ 5% discount for stays of 5+ nights
        }
        return totalPrice;
    }



//    @Override
//    public double getAdjustedPrice() {
//        double totalPrice = super.getAdjustedPrice();
//        if (super.getDuration() >= 10) {
//            totalPrice *= 0.90; // ✅ 10% discount for stays of 10+ nights
//        } else if (super.getDuration() >= 5) {
//            totalPrice *= 0.95; // ✅ 5% discount for stays of 5+ nights
//        }
//        return totalPrice;
//    }

//    public void displayDetails() {
//        super.displayDetails();
//        System.out.println("✅ FREE Pool Access Included!");
//    }


}
