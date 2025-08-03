package dev.TinkerLabSandbox.BedroomComposition;

public class Ceilings {

    private String paintColor;
    private int height;

    //constructor
    public Ceilings(String paintColor, int height) {
        if (paintColor == null || paintColor.isEmpty()) {
            throw new IllegalArgumentException("Paint color cannot be null or empty");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be a positive integer");
        }
        this.paintColor = paintColor;
        this.height = height;
    }

    //getter & setter
    public String getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(String paintColor) {
        if (paintColor == null || paintColor.isEmpty()) {
            throw new IllegalArgumentException("Paint color cannot be null or empty");
        }
        this.paintColor = paintColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be a positive integer");
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Ceilings{" +
                "paintColor='" + paintColor + '\'' +
                ", height=" + height +
                '}';
    }
}


