package dev.projects.SmartKitchen;

public class SmartKitchen {

    private CoffeeMaker theCoffeeMaker;
    private Refrigerator theRefrigerator;
    private Dishwasher theDishwasher;
    //constructor
    public SmartKitchen() {
        theCoffeeMaker = new CoffeeMaker();
        theRefrigerator = new Refrigerator();
        theDishwasher = new Dishwasher();
    }

    public CoffeeMaker getTheCoffeeMaker() {
        return theCoffeeMaker;
    }

    public Refrigerator getTheRefrigerator() {
        return theRefrigerator;
    }

    public Dishwasher getTheDishwasher() {
        return theDishwasher;
    }
    public void setkitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWashFlag) {
        theCoffeeMaker.setHasWorkToDo(coffeeFlag);
        theRefrigerator.setHasWorkToDo(fridgeFlag);
        theDishwasher.setHasWorkToDo(dishWashFlag);
    }

    public void setTheCoffeeMaker(CoffeeMaker theCoffeeMaker) {
        this.theCoffeeMaker = theCoffeeMaker;
    }


    public void setTheRefrigerator(Refrigerator theRefrigerator) {
        this.theRefrigerator = theRefrigerator;
    }

    public void setTheDishwasher(Dishwasher theDishwasher) {
        this.theDishwasher = theDishwasher;
    }

    public void addWater() {
        theCoffeeMaker.addWater();
    }
    public void pourMilk() {
        theRefrigerator.pourMilk();
    }
    public void loadDishwasher() {
        theDishwasher.loadDishwasher();
    }
    //method to instruct the appliances to do the work
    public void doKitchenWork() {
        theCoffeeMaker.brewCoffee();
        theRefrigerator.orderFood();
        theDishwasher.doDishes();
    }
}
