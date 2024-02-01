package main;

import university.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentId = 12345;
        student1.name = "Tallahassee";

        Course course1 = new Course();
        course1.courseId = 54321;
        course1.courseName = "Basket Weaving";

        Enrollment enrollment1 = new Enrollment();
        enrollment1.student = student1;
        enrollment1.course = course1;

        System.out.println("Student ID: " + enrollment1.student.studentId + ", Name: " + enrollment1.student.name);
        System.out.println("Course ID: " + enrollment1.course.courseId + ", Name: " + enrollment1.course.courseName);
    }
}