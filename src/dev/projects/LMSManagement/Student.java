package dev.projects.LMSManagement;

import java.util.List;

public class Student extends User{

    private List<String> enrolledCourses;

    public Student(String username, String email, String password, List<String> enrolledCourses) {
        super(username, email, password); // Call superclass constructor
        this.enrolledCourses = enrolledCourses;
    }

    public void viewCourses() {
        System.out.println(username + "'s Enrolled Courses: " + enrolledCourses);
    }

    public void submitAssignment(String course, String assignmentName) {
        System.out.println(username + " submitted " + assignmentName + " for course: " + course);
    }

    @Override
    public String toString() {
        return super.toString() + ", Role: Student";
    }
}
