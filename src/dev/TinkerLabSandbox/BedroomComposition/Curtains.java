package dev.TinkerLabSandbox.BedroomComposition;

public class Curtains {

    private String style;
    private int length;
    private int number;

    //constructor
    public Curtains(String style, int length, int number) {
        if (length < 0 || number < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        if (style == null || style.isEmpty()) {
            throw new IllegalArgumentException("Style cannot be null or empty");
        }
         // Validate inputs
        this.style = style;
        this.length = length;
        this.number = number;
    }
    //getter & setter
    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        if (style == null || style.isEmpty()) {
            throw new IllegalArgumentException("Style cannot be null or empty");
        }
        this.style = style;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        this.length = length;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        this.number = number;
    }
    //override toString method to provide a string representation of the Curtains object
    @Override
    public String toString() {
        return "Curtains{" +
                "style='" + style + '\'' +
                ", length=" + length +
                ", number=" + number +
                '}';
    }
}
