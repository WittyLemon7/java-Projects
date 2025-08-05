package dev.TinkerLabSandbox.StudentReportCardSystem;


import java.util.ArrayList;

/* This class represents a student manager in the report card system.
* This clas will add students based on roll no & print the report card for each student
* easy to add students using arrays or arrayLists instead of adding individually
 */

// note : this  manages Student not extends it.
public class StudentManager {

   private ArrayList<Student> students;

   //constructor no args
    public StudentManager() {
        this.students = new ArrayList<>();
    }
//    public StudentManager(ArrayList<Student> students) {
//        this.students = students = new ArrayList<>();
//    }
    //method to add student
    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        students.add(student);
    }
    //method to print report card
    public void printReportCard() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
