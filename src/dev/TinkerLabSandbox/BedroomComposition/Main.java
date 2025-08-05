package dev.TinkerLabSandbox.BedroomComposition;


/*
 * Main class for the BedroomComposition project.
 * This class serves as the entry point for the application.
 * this class will use user input to create a bedroom composition using  Scanner
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bedroom Composition App!");

        // Room Name
        System.out.print("Enter the name of your bedroom: ");
        String bedroomName = scanner.nextLine();

        // Lamp
        System.out.print("Enter lamp style: ");
        String lampStyle = scanner.nextLine();

        System.out.print("Is the lamp battery powered? (true/false): ");
        boolean lampBattery = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Enter globe rating (0-5): ");
        int lampGlobeRating = Integer.parseInt(scanner.nextLine());

        Lamps lamps = new Lamps(lampStyle, lampBattery, lampGlobeRating);

        // Bed
        System.out.print("Enter bed style: ");
        String bedStyle = scanner.nextLine();

        System.out.print("Enter pillow count: ");
        int pillowCount = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter bed sheet count: ");
        int bedSheetCount = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter quilt count: ");
        int quiltCount = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter bed height (as integer): ");
        int bedHeight = Integer.parseInt(scanner.nextLine());

        Beds beds = new Beds(bedStyle, pillowCount, bedSheetCount, quiltCount, bedHeight);

        // Curtains
        System.out.print("Enter curtains style: ");
        String curtainStyle = scanner.nextLine();

        System.out.print("Enter curtains length: ");
        int curtainLength = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter number of curtains: ");
        int curtainNumber = Integer.parseInt(scanner.nextLine());

        Curtains curtains = new Curtains(curtainStyle, curtainLength, curtainNumber);

        // Walls
        System.out.print("Enter north wall material: ");
        String northWall = scanner.nextLine();

        System.out.print("Enter south wall material: ");
        String southWall = scanner.nextLine();

        System.out.print("Enter east wall material: ");
        String eastWall = scanner.nextLine();

        System.out.print("Enter west wall material: ");
        String westWall = scanner.nextLine();

        System.out.print("Enter overall wall color: ");
        String wallColor = scanner.nextLine();

        bedroomWalls walls = new bedroomWalls(northWall, southWall, eastWall, westWall, wallColor);

        // Ceiling
        System.out.print("Enter ceiling paint color: ");
        String ceilingColor = scanner.nextLine();

        System.out.print("Enter ceiling height (as integer): ");
        int ceilingHeight = Integer.parseInt(scanner.nextLine());

        Ceilings ceiling = new Ceilings(ceilingColor, ceilingHeight);

        // Compose the Room
        Room room = new Room(
                bedroomName,
                lamps,
                beds,
                curtains,
                walls,
                ceiling
        );

        // Display details
        System.out.println("\nYour Room Composition:");
        System.out.println("Room Name: " + room.getName());
        System.out.println("Lamp: " + lamps.getStyle() + ", Battery Powered: " + lamps.isBatteryPowered() + ", Globe Rating: " + lamps.getGlobeRating());
        System.out.println("Bed: " + beds.getBedStyle() + ", Pillows: " + beds.getPillowCount() + ", Bed Sheets: " + beds.getBedSheetCount()
                + ", Quilts: " + beds.getQuiltCount() + ", Height: " + beds.getHeight());
        System.out.println("Curtains: " + curtains.getStyle() + ", Length: " + curtains.getLength() + ", Number: " + curtains.getNumber());
        System.out.println("Walls: " + walls.toString());
        System.out.println("Ceiling: Paint Color: " + ceiling.getPaintColor() + ", Height: " + ceiling.getHeight());
        System.out.println("\nThank you for using the Bedroom Composition App!");

        scanner.close();
    }
}



