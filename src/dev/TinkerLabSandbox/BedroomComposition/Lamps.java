package dev.TinkerLabSandbox.BedroomComposition;

/**
 * Lamps class represents a collection of lamps in a bedroom.
 * This class is a study of composition in Java.
 * It can be extended in the future to include attributes like brightness, color, etc.
 */
public class Lamps {

    private String style;
    private boolean batteryPowered;
    private int globeRating;

    //constructor with validation
    public Lamps(String style, boolean batteryPowered, int globeRating) {
        if (globeRating < 0) {
            throw new IllegalArgumentException("Globe rating must be between 0 and 5.");
        }
        if (style == null || style.isEmpty()) {
            throw new IllegalArgumentException("Style cannot be null or empty.");
        }
        this.style = style;
        this.batteryPowered = batteryPowered;
        this.globeRating = globeRating;
    }
    //getter & setter
    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        if (style == null || style.isEmpty()) {
            throw new IllegalArgumentException("Style cannot be null or empty.");
        }
        this.style = style;
    }
    public boolean isBatteryPowered() {
        return batteryPowered;
    }
    public void setBatteryPowered(boolean batteryPowered) {
        this.batteryPowered = batteryPowered;
    }
    public int getGlobeRating() {
        return globeRating;
    }
    public void setGlobeRating(int globeRating) {
        if (globeRating < 0) {
            throw new IllegalArgumentException("Globe rating must be between 0 and 5.");
        }
        this.globeRating = globeRating;
    }
    //method  to turn on the lamp
    public void turnOn() {
        System.out.println("The " + style + " lamp is now ON.");
    }
}
