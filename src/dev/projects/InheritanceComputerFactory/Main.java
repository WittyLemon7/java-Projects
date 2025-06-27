package dev.projects.InheritanceComputerFactory;

public class Main {
    public static void main(String[] args) {
        Case theCase = new Case("2208","Dell",
                "240");
        Monitor theMonitor = new Monitor("32 inch Beast",
                "LG","2560x1440",32 );
        Motherboard theMotherboard = new Motherboard("BJ 200",
                "ASUS",4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208",
                "Dell",theCase,theMonitor,theMotherboard);

//        thePC.getTheMonitor().drawPixelArt(10,10,"red");
//        thePC.getTheMotherboard().loadProgram("Windows OS 11 Pro" );
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();


    }
}
