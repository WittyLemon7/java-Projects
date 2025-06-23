package dev.projects.HotelBookingSystem;

public class Main {
    public static void main(String[] args) {

        Room singleRoom = new Room("single");
        singleRoom.printItem();
        singleRoom.setDuration(3);
        singleRoom.printItem();
        System.out.println("=====================================");

        Room doubleRoom = new Room("double");
        doubleRoom.printItem();
        doubleRoom.setDuration(4);
        doubleRoom.printItem();
        System.out.println("=====================================");

        Room suiteRoom = new Room("suite");
        suiteRoom.printItem();
        suiteRoom.setDuration(5);
        suiteRoom.printItem();
        System.out.println("=====================================");

        Room DeluxRoom = new Room("delux");
        DeluxRoom.printItem();
        DeluxRoom.setDuration(6);
        DeluxRoom.printItem();
        System.out.println("=====================================");


//        Room singleRoomWithBreakfast = new Room("single");
//        singleRoomWithBreakfast.setBreakfastIncluded(true);
//        singleRoomWithBreakfast.printItem();
//        singleRoomWithBreakfast.setDuration(2);
//        singleRoomWithBreakfast.printItem();
//        System.out.println("=====================================");


//        Room standardRoom = new Room("single",100.00);
//        standardRoom.printItem();
//        standardRoom.setDuration(2);
//        standardRoom.printItem();

    }
}
