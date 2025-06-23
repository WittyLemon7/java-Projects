package com.java.exercises;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //calculator class

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());


        //person class
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        //Customer challenge
        Customer customer =  new Customer("John",1000.00,"john@example.com");
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
        Customer customer1 = new Customer("Bob","Bob@email.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmail());
        Customer customer2 = new Customer("Tim","tim@email.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        //wall challenge
        Wall wall = new Wall(5,4);
        System.out.println("area = " + wall.getArea());
        Wall wall1 = new Wall(5,5);
        System.out.println("area = " + wall1.getArea());

        //point challenge
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance() = " + point.distance());

        //carpet cost calculator carpet,floor & calculator class
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculator1 = new Calculator(floor,carpet);
        System.out.println("total = " + calculator1.getTotalCost());
        Carpet carpet1 = new Carpet(1.5);
        Floor floor1 = new Floor(5.4,4.5);
        Calculator calculator2 = new Calculator(floor1,carpet1);
        System.out.println("total = " + calculator2.getTotalCost());

        //rectangle class
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rectangle.width = " + rectangle.getWidth());
        System.out.println("rectangle.length = " + rectangle.getLength());
        System.out.println("rectangle.area = " + rectangle.getArea());
        System.out.println("rectangle.perimeter = " + rectangle.getPerimeter());
        System.out.println("rectangle scale = " + rectangle.scale(2));
        System.out.println("rectangle rotated = " + rectangle.rotate());

        //circle class
        Circle c1 = new Circle(3); // Radius = 3
        Circle c2 = new Circle(5); // Radius = 5

        System.out.println("C1 Area: " + c1.getArea());
        System.out.println("C2 Circumference: " + c2.getCircumference());

        // Scaling c1
        c1.scale(2);
        System.out.println("Scaled C1 Radius: " + c1.getRadius());

        // Comparing circles
        System.out.println("Do both circles have same area ? " +c1.hasSameArea(c2));

        //Employee class & Company class challenge


                ArrayList<Employee> initialEmployees = new ArrayList<>();
                initialEmployees.add(new Employee("Alice", 50000, 1));
                initialEmployees.add(new Employee("Bob", 60000, 2));
                initialEmployees.add(new Employee("Charlie", 40000, 3));

                Company company = new Company(initialEmployees);

                // Display all employees
                System.out.println("All Employees:");
                company.getAllEmployees().forEach(System.out::println);

                // Calculate total salary
                System.out.println("Total Salary: " + company.getTotalSalary());

                // Sort employees by salary
                System.out.println("Sorted by Salary:");
                company.sortEmployeesBySalary().forEach(System.out::println);

                // Filter employees with salary > 45000
                System.out.println("Filtered Employees (Salary > 45000):");
                company.filterEmployeesBySalary(45000).forEach(System.out::println);

        // cylinder cuboid
        Cylinder cylinder1 = new Cylinder(1.5,2);
        System.out.println("cylinder1.radius = " + cylinder1.getRadius());
        System.out.println("cylinder1.height = " + cylinder1.getHeight());
        System.out.println("cylinder1.area = " + cylinder1.getArea());

        Cuboid cuboid = new Cuboid(2,3,4);
        System.out.println("cuboid.width = " + cuboid.getWidth());
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.volume = " + cuboid.getVolume());

        // movie, theater challenge

        Theater theater = new Theater();

        // Adding movies to the theater
        Movie movie1 = new Movie("Avengers", 180, 300);
        Movie movie2 = new Movie("Inception", 120, 350);
        Movie movie3 = new Movie("Interstellar", 150, 400);

        theater.addMovie(movie1, 100);
        theater.addMovie(movie2, 75);
        theater.addMovie(movie3, 50);

        // Booking tickets
        theater.bookTickets("Avengers", 5);
        theater.bookTickets("Inception", 10);
        theater.bookTickets("Interstellar", 60); // Should fail due to insufficient seats

        // Checking available seats
        theater.getAvailableSeats("Avengers");
        theater.getAvailableSeats("Inception");
        theater.getAvailableSeats("Interstellar");

        // Calculating total revenue
        theater.getTotalRevenue();






    }
}
