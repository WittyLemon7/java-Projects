package dev.projects.SmartKitchen;

public class Refrigerator {

    private boolean hasWorkToDo;

    public void pourMilk() {
        hasWorkToDo = true; // sets the appliance to work
        System.out.println("Pouring milk into the refrigerator.");
    }
    public void orderFood() {
        if (!hasWorkToDo) {
            System.out.println("Ordering food.");
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
