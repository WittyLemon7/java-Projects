package dev.projects.SmartKitchen;

public class CoffeeMaker {

    private boolean hasWorkToDo;

    public void addWater() {
        hasWorkToDo = true;//sets the appliance to work
        System.out.println("Adding water to the coffee maker.");
    }
    public void brewCoffee() {
        if (!hasWorkToDo) {
            System.out.println("Brewing coffee.");
            hasWorkToDo = false;//resets the work to do
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
