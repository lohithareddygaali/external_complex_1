package com.example;

public class App {

    public String getStudentDetails() {
        return "Student Name: Lohitha\nDepartment: CSE";
    }

    public int addMarks(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        App app = new App();

        System.out.println("Java CI/CD Application");
        System.out.println("----------------------");
        System.out.println(app.getStudentDetails());
        System.out.println("Total Marks: " + app.addMarks(85, 90));
        System.out.println("Application executed successfully!");
    }
}