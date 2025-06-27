package dev.projects.InheritanceComputerFactory;



public class PersonalComputer extends Product {

    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PersonalComputer(String model, String manufacturer,
                            Case theCase,
                            Monitor theMonitor,
                            Motherboard theMotherboard) {
        super(model, manufacturer);
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }
    public void drawLogo() {
        theMonitor.drawPixelArt(1200,50, "blue");
    }
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }
    //getters

//    public Case getTheCase() {
//        return theCase;
//    }
//
//    public Monitor getTheMonitor() {
//        return theMonitor;
//    }
//
//    public Motherboard getTheMotherboard() {
//        return theMotherboard;
//    }

}



