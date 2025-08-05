package dev.TinkerLabSandbox.StudentReportCardSystem;

/* This class  represents list of students in report card system
* this class will have name, marks for 3 subjects & roll number
* will have methods to calculate average & result pass or fail based on student avg marks
 */
public class Student {

    //variable to store values
    private String name;
    private int roll;
    private double marksSubject1;
    private double marksSubject2;
    private double marksSubject3;

    //constructor
    public Student(String name, int roll, double marksSubject1, double marksSubject2, double marksSubject3) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (roll < 0) {
            throw  new IllegalArgumentException("Roll no cannot be zero");
        }
        if (marksSubject1 < 0 || marksSubject1 > 100 && marksSubject2 < 0 || marksSubject2 > 100 && marksSubject3 < 0 || marksSubject3 > 100) {
            throw new IllegalArgumentException("Marks cannot be negative or greater than 100");
        }
        this.name = name;
        this.roll = roll;
        this.marksSubject1 = marksSubject1;
        this.marksSubject2 = marksSubject2;
        this.marksSubject3 = marksSubject3;
    }
    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        if (roll < 0) {
            throw  new IllegalArgumentException("Roll no cannot be zero");
        }
        this.roll = roll;
    }

    public double getMarksSubject1() {
        return marksSubject1;
    }

    public void setMarksSubject1(double marksSubject1) {
        if (marksSubject1 < 0 || marksSubject1 > 100) {
            throw new IllegalArgumentException("Marks cannot be negative or greater than 100");
    }
        this.marksSubject1 = marksSubject1;
    }

    public double getMarksSubject2() {
        return marksSubject2;
    }

    public void setMarksSubject2(double marksSubject2) {
        if (marksSubject2 < 0 || marksSubject2 > 100) {
            throw new IllegalArgumentException("Marks cannot be negative or greater than 100");
        }
        this.marksSubject2 = marksSubject2;
    }

    public double getMarksSubject3() {
        return marksSubject3;
    }

    public void setMarksSubject3(double marksSubject3) {
        if (marksSubject3 < 0 || marksSubject3 > 100) {
            throw new IllegalArgumentException("Marks cannot be negative or greater than 100");
        }
        this.marksSubject3 = marksSubject3;
    }
    //method to calculate Average of 3 subjects
    public double calculateAverage() {
        return (marksSubject1 + marksSubject2 + marksSubject3) / 3;
    }
    // method to get result based on average
    public String getResult() {
        double average = calculateAverage();//
        if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    // override method
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", marksSubject1=" + marksSubject1 +
                ", marksSubject2=" + marksSubject2 +
                ", marksSubject3=" + marksSubject3 +
                ", average=" + calculateAverage() +
                ", result='" + getResult() + '\'' +
                '}';
    }


}
