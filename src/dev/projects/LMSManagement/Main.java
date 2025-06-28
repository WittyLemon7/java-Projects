package dev.projects.LMSManagement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Create a Student
        Student student = new Student("Alice", "alice@gmail.com", "password123", Arrays.asList("Math 101", "Physics 201"));
        student.login();
        student.viewCourses();
        student.submitAssignment("Math 101", "Homework 1");
        student.logout();
        System.out.println(student);

        System.out.println("-----");

        // Create an Instructor
        Instructor instructor = new Instructor("Bob", "bob@gmail.com", "securepass456", Arrays.asList("Math 101", "Programming 101"));
        instructor.login();
        instructor.createAssignment("Math 101", "Project 1");
        instructor.gradeAssignment("Alice", "Math 101", "Homework 1", 85);
        instructor.logout();
        System.out.println(instructor);

        System.out.println("-----");

        // Create an Administrator
        Administrator admin = new Administrator("Carol", "carol@gmail.com", "adminpass789", "Full Access");
        admin.login();
        admin.manageUsers();
        admin.generateReports();
        admin.logout();
        System.out.println(admin);
    }


}
