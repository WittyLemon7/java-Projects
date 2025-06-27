package dev.projects.HotelBookingSystem;

public class Amenity {

    private boolean wifi;
    private boolean breakfast;
    private boolean poolAccess;
    private double wifiPrice = 5.00; // Price per night for WiFi
    private double breakfastPrice = 10.00; // Price per night for breakfast
    private double poolAccessPrice = 15.00; // One-time charge for pool access
    private int duration; // Duration of stay in nights

    public Amenity(boolean wifi, boolean breakfast, boolean poolAccess) {
        this.wifi = wifi;
        this.breakfast = breakfast;
        this.poolAccess = poolAccess;
        this.duration = Math.max(duration,1);// Default duration
    }
    public boolean hasWifi() {
        return wifi;
    }
    public boolean hasBreakfast() {
        return breakfast;
    }
    public boolean hasPoolAccess() {
        return poolAccess;
    }


    public double calculatePrice(int nights, boolean isSuiteRoom) {
        double totalPrice = 0;
        if (isSuiteRoom) {//ensure charges if not a suite

            if (wifi) totalPrice += nights * wifiPrice;  // WiFi is charged per night
            if (breakfast) totalPrice += nights * breakfastPrice;  // Breakfast per night
        }
        if (poolAccess) totalPrice += poolAccessPrice;  // One-time charge for pool access irrespective of room type

        return totalPrice;
    }
    public double calculateTotalPrice(boolean isSuiteRoom) {
        return calculatePrice(duration,isSuiteRoom);  // Default to 1 night uses stored data
    }
    public void displayDetails() {
        System.out.println("\n===== Amenity Details =====");
        if (wifi) System.out.println("WiFi: Available");
        if (breakfast) System.out.println("Breakfast: Available");
        if (poolAccess) System.out.println("Pool Access: Available");
    }
    public void displayDetails(int nights, boolean isSuiteRoom) {
        System.out.println("\n===== Amenity Details =====");
        if (wifi) {
//            System.out.printf("WiFi (%d nights): $%.2f\n", nights, nights * wifiPrice);
            if (isSuiteRoom) {
                System.out.println("WiFi: ✅ Included for FREE");
            } else {
                System.out.printf("WiFi (%d nights): $%.2f\n", nights, nights * wifiPrice);
            }
        }

        if (breakfast) {
//            System.out.printf("Breakfast (%d nights): $%.2f\n", nights, nights * breakfastPrice);
            if (isSuiteRoom) {
                System.out.println("Breakfast: ✅ Included for FREE");
            } else {
                System.out.printf("Breakfast (%d nights): $%.2f\n", nights, nights * breakfastPrice);
            }
        }

        if (poolAccess) {
            System.out.printf("Pool Access: $%.2f\n", poolAccessPrice);
        }
        System.out.printf("Total Amenities Price: $%.2f\n", calculatePrice(nights, isSuiteRoom));
    }

//    private boolean wifi;
//    private boolean breakfast;
//    private boolean poolAccess;
//
//    public Amenity(boolean wifi, boolean breakfast, boolean poolAccess) {
//        this.wifi = wifi;
//        this.breakfast = breakfast;
//        this.poolAccess = poolAccess;
//    }
//    public boolean hasWifi() {
//        return wifi;
//    }
//
//    public boolean hasBreakfast() {
//        return breakfast;
//    }
//
//    public boolean hasPoolAccess() {
//        return poolAccess;
//    }
//
//    public double calculatePrice(int nights) {
//        double totalPrice = 0;
//
//        if (wifi) totalPrice += nights * 5.00;  // WiFi is charged per night
//        if (breakfast) totalPrice += nights * 10.00;  // Breakfast per night
//        if (poolAccess) totalPrice += 15.00;  // One-time charge for pool
//
//        return totalPrice;
//    }
//    public double calculateTotalPrice() {
//        return calculatePrice(1);  // Default to 1 night
//    }
//    public void displayDetails() {
//        System.out.println("\n===== Amenity Details =====");
//        if (wifi) System.out.println("WiFi: Available");
//        if (breakfast) System.out.println("Breakfast: Available");
//        if (poolAccess) System.out.println("Pool Access: Available");
//    }

//    public void displayDetails(int nights) {
//        System.out.println("\n===== Amenity Details =====");
//        if (wifi) System.out.printf("WiFi (%d nights): $%.2f\n", nights, nights * 5.00);
//        if (breakfast) System.out.printf("Breakfast (%d nights): $%.2f\n", nights, nights * 10.00);
//        if (poolAccess) System.out.printf("Pool Access: $%.2f\n", 15.00);
//        System.out.printf("Total Amenities Price: $%.2f\n", calculatePrice(nights));
//    }
}
// public class Amenity {
//    private HashMap<String, Double> selectedAmenities = new HashMap<>();
//
//    private static final HashMap<String, Double> amenityPrices = new HashMap<>();
//
//    static {
//        amenityPrices.put("WiFi", 5.00);
//        amenityPrices.put("Breakfast", 10.00);
//        amenityPrices.put("Pool Access", 15.00);
//    }
//
//    public void addAmenity(String name) {
//        if (amenityPrices.containsKey(name)) {
//            selectedAmenities.put(name, amenityPrices.get(name));
//        } else {
//            System.out.println("Invalid Amenity: " + name);
//        }
//    }
//
//    public double calculatePrice() {
//        double totalPrice = 0;
//        for (double price : selectedAmenities.values()) {
//            totalPrice += price;
//        }
//        return totalPrice;
//    }
//
//    public void displayDetails() {
//        System.out.println("\n===== Amenity Details =====");
//        for (String amenity : selectedAmenities.keySet()) {
//            System.out.printf("%-20s $%.2f\n", amenity, selectedAmenities.get(amenity));
//        }
//        System.out.printf("Total Amenities Price: $%.2f\n", calculatePrice());
//    }

