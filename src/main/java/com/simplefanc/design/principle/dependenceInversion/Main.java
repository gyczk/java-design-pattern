package com.simplefanc.design.principle.dependenceInversion;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.studentStudyCourse(new JavaCourse());
        student.studentStudyCourse(new PythonCourse());
    }
}
