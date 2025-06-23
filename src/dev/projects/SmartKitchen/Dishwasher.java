package dev.projects.SmartKitchen;

public class Dishwasher {

    private boolean hasWorkToDo;

    public void loadDishwasher() {
        hasWorkToDo = true; // sets the appliance to work
        System.out.println("Loading the dishwasher.");
    }
    public void doDishes() {
        if (!hasWorkToDo) {
            System.out.println("Doing the dishes.");
            hasWorkToDo = false; // resets the work to do
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
