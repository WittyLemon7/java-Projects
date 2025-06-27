package dev.projects.HotelBookingSystem;

public class RoomBooking {

    private int duration;
    private Room room;
    private Amenity wifi;
    private Amenity breakfast;
    private Amenity poolAccess;

    public RoomBooking(Room room, Amenity wifi, Amenity breakfast, Amenity poolAccess) {
        this.room = room;
        this.wifi = wifi;
        this.breakfast = breakfast;
        this.poolAccess = poolAccess;
    }

    public void setDuration(int duration) {
        this.duration = duration;
        if (room != null) room.setDuration(duration);
    }

    public void displayBookingDetails() {
        System.out.println("\n===== Room Booking Details =====");
        System.out.printf("Room Type: %s\n", room.getType());
        System.out.printf("Base Price: $%.2f\n", room.getPrice());
        System.out.printf("Duration: %s\n", room.getDuration());
        System.out.printf("Total Price: $%.2f\n", room.getAdjustedPrice());

        if (room instanceof SuiteRoom) {
            System.out.println("\n✅ Included Free Amenities:");
            System.out.println("✔ WiFi Access");
            System.out.println("✔ Complimentary Breakfast");
        } else if (room instanceof  DeluxeRoom) {
            System.out.println("\n✅ Included Free Amenities:");

            System.out.println("✔ Pool Access");
        } else {
            System.out.println("\n❌ No free amenities included for this room type.");

        }

        if (wifi != null) wifi.displayDetails();
        if (breakfast != null) breakfast.displayDetails();
        if (poolAccess != null) poolAccess.displayDetails();
    }

//    private Room room;
//    private Amenity wifi;
//    private Amenity breakfast;
//    private Amenity poolAccess;
//
//    public RoomBooking(Room room, Amenity wifi, Amenity breakfast, Amenity poolAccess) {
//        this.room = room;
//        this.wifi = wifi;
//        this.breakfast = breakfast;
//        this.poolAccess = poolAccess;
//    }
//    public void setDuration(int duration) {
//        this.duration = duration;
//        if (room != null) room.setDuration(duration);
//    }
//    public void displayBookingDetails() {
//        System.out.println("\n===== Room Booking Details =====");
//        System.out.printf("Room Type: %s\n", room.getType());
//        System.out.printf("Base Price: $%.2f\n", room.getPrice());
//        System.out.printf("Duration: %s\n", room.getDuration());
//        System.out.printf("Total Price: $%.2f\n", room.getAdjustedPrice());
//
//        if (room instanceof SuiteRoom) {
//            System.out.println("\n✅ Included Free Amenities:");
//            System.out.println("✔ WiFi Access");
//            System.out.println("✔ Complimentary Breakfast");
//        }
//
//        if (wifi != null) wifi.displayDetails();
//        if (breakfast != null) breakfast.displayDetails();
//        if (poolAccess != null) poolAccess.displayDetails();
//    }
}
