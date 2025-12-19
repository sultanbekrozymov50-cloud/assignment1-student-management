Student Management System - Assignment 1
Project Overview
This project is an Object-Oriented Student Management System implemented in Java. It demonstrates core OOP principles such as:

Encapsulation: Using private fields with getters and setters.


Composition: The Course class maintains an array of Student objects.


Abstraction: Hiding internal data and providing controlled access via methods.

Class Descriptions
1. Student Class

Represents an individual student with fields for name, ID, major, GPA, and credits.

Key Methods: addCredits(int c), updateGPA(double gpa), and isHonors() which returns true if GPA≥3.5.



2. Course Class

Manages a collection of students.

Key Methods: addStudent() for array insertion, courseAverageGPA() for statistics, and highestCreditStudent() to find the most active student.


How to Compile and Run
To run this project from your terminal, use the following commands:

Bash
javac src/*.java
java -cp src Main
Screenshots
(Здесь вставь скриншот своего терминала, который ты прислал мне выше).

Reflection
In this project, I practiced designing classes that interact with each other through composition. The biggest challenge was managing the array of objects and ensuring no null pointer exceptions occurred during calculations. Using encapsulation helped in maintaining data integrity by preventing direct access to student records.