package dev.TinkerLabSandbox.StudentReportCardSystem;

public class Main {
    public static void main(String[] args) {
        // Create the student manager
        StudentManager manager = new StudentManager();

        // Add test students
        Student alice = new Student("Alice", 1, 80, 75, 90);
        Student bob = new Student("Bob", 2, 35, 42, 38);
        Student carol = new Student("Carol", 3, 50, 60, 55);

        manager.addStudent(alice);
        manager.addStudent(bob);
        manager.addStudent(carol);

        // Print report cards
        manager.printReportCard();
    }
}
