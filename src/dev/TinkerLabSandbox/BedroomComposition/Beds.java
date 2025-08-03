package dev.TinkerLabSandbox.BedroomComposition;
/*
 * This class represents a collection of beds in a bedroom composition.
 * this class serves as component of a larger bedroom composition system.
 * It can be extended or modified to include specific bed types, properties, or behaviors.
 */

public class Beds {

    private  String bedStyle;
    private  int pillowCount;
    private int bedSheetCount;
    private int quiltCount;
    private int height;

    //constructor
    public Beds(String bedStyle, int pillowCount, int bedSheetCount, int quiltCount, int height) {
        if (pillowCount < 0) {
            throw new IllegalArgumentException("Pillow count cannot be negative.");
        }
        if (bedSheetCount < 0) {
            throw new IllegalArgumentException("Bed sheet count cannot be negative.");
        }
        if (quiltCount < 0) {
            throw new IllegalArgumentException("Quilt count cannot be negative.");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be a positive value.");
        }
        if (bedStyle == null || bedStyle.isEmpty()) {
            throw new IllegalArgumentException("Bed style cannot be null or empty.");
        }
        // Initialize the properties of the bed
        this.bedStyle = bedStyle;
        this.pillowCount = pillowCount;
        this.bedSheetCount = bedSheetCount;
        this.quiltCount = quiltCount;
        this.height = height;
    }
    //getter & setter methods
    public String getBedStyle() {
        return bedStyle;
    }
    public void setBedStyle(String bedStyle) {
        if (bedStyle == null || bedStyle.isEmpty()) {
            throw new IllegalArgumentException("Bed style cannot be null or empty.");
        }
        this.bedStyle = bedStyle;
    }
    public int getPillowCount() {
        return pillowCount;
    }
    public void setPillowCount(int pillowCount) {
        if (pillowCount < 0) {
            throw new IllegalArgumentException("Pillow count cannot be negative.");
        }
        this.pillowCount = pillowCount;
    }
    public int getBedSheetCount() {
        return bedSheetCount;
    }
    public void setBedSheetCount(int bedSheetCount) {
        if (bedSheetCount < 0) {
            throw new IllegalArgumentException("Bed sheet count cannot be negative.");
        }
        this.bedSheetCount = bedSheetCount;
    }
    public int getQuiltCount() {
        return quiltCount;
    }
    public void setQuiltCount(int quiltCount) {
        if (quiltCount < 0) {
            throw new IllegalArgumentException("Quilt count cannot be negative.");
        }
        this.quiltCount = quiltCount;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be a positive value.");
        }
        this.height = height;
    }
}
