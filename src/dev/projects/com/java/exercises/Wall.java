package dev.projects.com.java.exercises;

public class Wall {
    private  double width;
    private  double height;

    //no args constructor
    public Wall() {
        this.width = 0.0;
        this.height = 0.0;
    }

    //constructors that initialize the fields
    public Wall(double width, double height) {
        //if width is less than 0, set it to 0
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        //if height is less than 0, set it to 0
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }


    //getters & setters with validation

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public  double getArea(){
        return width * height;
    }
}
