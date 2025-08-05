
# Student Report Card System

A simple Java console application to manage students and generate formatted report cards, showcasing Java fundamentals, OOP, and collection handling skills.

## **Project Structure**

```
dev.TinkerLabSandbox.StudentReportCardSystem/
├── Student.java
├── StudentManager.java
└── Main.java
```


## **Core Components \& Logic**

### **1. Student.java**

- **Purpose:** Represents a single student.
- **Fields:**
    - `name`: Student’s name (`String`)
    - `roll`: Roll number (`int`)
    - `marksSubject1`, `marksSubject2`, `marksSubject3`: Marks in three subjects (`double`)
- **Logic:**
    - **Constructor:** Initializes a student; includes validation for input correctness.
    - **Method `calculateAverage()`:** Computes the arithmetic average of the three subject marks.
    - **Method `getResult()`:** Returns `"Pass"` if average is at least 40, else `"Fail"`.
    - **Method `toString()`:** Returns a formatted string representing the student’s full report, for easy printing.


### **2. StudentManager.java**

- **Purpose:** Manages a group of students using an `ArrayList<Student>`.
- **Fields:**
    - `students`: Stores added `Student` objects.
- **Logic:**
    - **Constructor:** Initializes an empty list of students.
    - **Method `addStudent(Student)`:** Adds a new student with validation.
    - **Method `printReportCards()`:** Iterates over all students, printing each report card using the `toString()` method.


### **3. Main.java**

- **Purpose:** The entry point for the program; demonstrates how everything fits together.
- **Logic:**

1. Creates a `StudentManager` instance.
2. Adds several `Student` objects to the manager.
3. Calls `printReportCards()` to generate and display all report cards.


## **Sample Output**

```
Name: Alice | Roll: 1
Marks: 80.0, 75.0, 90.0
Average: 81.67
Result: Pass
---------------------------
Name: Bob | Roll: 2
Marks: 35.0, 42.0, 38.0
Average: 38.33
Result: Fail
---------------------------
Name: Carol | Roll: 3
Marks: 50.0, 60.0, 55.0
Average: 55.00
Result: Pass
---------------------------
```


## **How the Logic Works**

- **Student objects** encapsulate all student-related behavior and data.
- **StudentManager** acts as a controller: it stores, manages, and performs operations on multiple students using Java’s `ArrayList`, which is a dynamic, resizeable collection.
- **Main** acts as a showcase: you plug in students, then display all their cards.


## **Customization \& Extension Ideas**

- Easily add more students by calling `addStudent()`.
- Change evaluation logic (`getResult`) as needed.
- Expand to multiple subjects, or add new report card features (like class ranking, grade letters, etc.).
- Refactor for file I/O or user-input for more advanced versions.


## **Learning Outcomes**

- Real-world application of **object-oriented programming** (OOP) in Java.
- Use of Java’s `ArrayList` for dynamic collection management.
- Proper encapsulation, validation, and modular code structure.
- Hands-on experience with logic flow: creation, aggregation, computation, and display.

**This project is ideal for students and Java learners aiming to master fundamentals before moving on to collections, advanced data structures, or frameworks.**

