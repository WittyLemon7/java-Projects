package dev.projects.LMSManagement;

import java.util.List;

public class Instructor extends User {

    private List<String> assignCourses;

    //constructor

    public Instructor(String username, String password, String email, List<String> assignCourses) {
        super(username, password, email);
        this.assignCourses = assignCourses;
    }

    public void createAssignment(String course, String assignmentName) {
        System.out.println("Assignment " + assignmentName + " created for course " + course);
    }
    public void gradeAssignment(String course, String assignmentName, String studentName, int grade) {
        System.out.println("Assignment " + assignmentName + " graded for student " + studentName + " in course " + course + " with grade " + grade);
    }

    @Override
    public String toString() {
        return super.toString() + "role: instructor";
    }
}
