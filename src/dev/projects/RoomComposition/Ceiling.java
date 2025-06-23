package dev.projects.RoomComposition;

public class Ceiling {

    private int height;
    private int paintedColour;

    public Ceiling(int height, int paintedColour) {
        this.height = height;
        this.paintedColour = paintedColour;
    }
    public int getHeight() {
        return height;
    }
    public int getPaintedColour() {
        return paintedColour;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setPaintedColour(int paintedColour) {
        this.paintedColour = paintedColour;
    }
}
