package dev.TinkerLabSandbox.BedroomComposition;

public class bedroomWalls {

    private String northWall;
    private String southWall;
    private String eastWall;
    private String westWall;
    private String wallColor;

    //constructor
    public bedroomWalls(String northWall, String southWall, String eastWall, String westWall, String wallColor) {
        if (northWall == null || southWall == null || eastWall == null || westWall == null || wallColor == null) {
            throw new IllegalArgumentException("Wall parameters cannot be null");
        }
        this.northWall = northWall;
        this.southWall = southWall;
        this.eastWall = eastWall;
        this.westWall = westWall;
        this.wallColor = wallColor;
    }
    //getter & setter
    public String getNorthWall() {
        return northWall;
    }
    public void setNorthWall(String northWall) {
        if (northWall == null) {
            throw new IllegalArgumentException("North wall cannot be null");
        }
        this.northWall = northWall;
    }
    public String getSouthWall() {
        return southWall;
    }
    public void setSouthWall(String southWall) {
        if (southWall == null) {
            throw new IllegalArgumentException("South wall cannot be null");
        }
        this.southWall = southWall;
    }
    public String getEastWall() {
        return eastWall;
    }
    public void setEastWall(String eastWall) {
        if (eastWall == null) {
            throw new IllegalArgumentException("East wall cannot be null");
        }
        this.eastWall = eastWall;
    }
    public String getWestWall() {
        return westWall;
        }
    public void setWestWall(String westWall) {
        if (westWall == null) {
            throw new IllegalArgumentException("West wall cannot be null");
        }
        this.westWall = westWall;
    }
    public String getWallColor() {
        return wallColor;
    }
    public void setWallColor(String wallColor) {
        if (wallColor == null) {
            throw new IllegalArgumentException("Wall color cannot be null");
        }
        this.wallColor = wallColor;
    }
    //toString method to provide a string representation of the bedroom walls
    @Override
    public String toString() {
        return "BedroomWalls{" +
                "northWall='" + northWall + '\'' +
                ", southWall='" + southWall + '\'' +
                ", eastWall='" + eastWall + '\'' +
                ", westWall='" + westWall + '\'' +
                ", wallColor='" + wallColor + '\'' +
                '}';
    }
}
