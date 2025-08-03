package dev.TinkerLabSandbox.BedroomComposition;

/**
 * Represents a room in the bedroom composition.
 * This class will be used to define properties and behaviors of a room.
 */

public class Room {

    private String name;
    private Lamps bedLamp;
    private Beds bed;
    private Curtains curtains;
    private bedroomWalls walls;
    private Ceilings ceiling;

    //constructor
    public Room(String name, Lamps bedLamp, Beds bed, Curtains curtains,
                bedroomWalls walls, Ceilings ceiling) {
        this.name = name;
        this.bedLamp = bedLamp;
        this.bed = bed;
        this.curtains = curtains;
        this.walls = walls;
        this.ceiling = ceiling;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lamps getBedLamp() {
        return bedLamp;
    }

    public void setBedLamp(Lamps bedLamp) {
        this.bedLamp = bedLamp;
    }

    public Beds getBed() {
        return bed;
    }

    public void setBed(Beds bed) {
        this.bed = bed;
    }

    public Curtains getCurtains() {
        return curtains;
    }

    public void setCurtains(Curtains curtains) {
        this.curtains = curtains;
    }


    public bedroomWalls getWalls() {
        return walls;
    }

    public void setWalls(bedroomWalls walls) {
        this.walls = walls;
    }

    public Ceilings getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceilings ceiling) {
        this.ceiling = ceiling;
    }

    //method to display room details
    public void displayRoomDetails() {
        System.out.println("-------Room Details-------");
        System.out.println("Room Name: " + name);
        System.out.println("Bed Lamp: " + bedLamp);
        System.out.println("Bed: " + bed);
        System.out.println("Curtains: " + curtains);
        System.out.println("Walls: " + walls);
        System.out.println("Ceiling: " + ceiling);
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", bedLamp=" + bedLamp +
                ", bed=" + bed +
                ", curtains=" + curtains +
                ",walls=" + walls +
                ", ceiling=" + ceiling +
                '}';
    }
}





