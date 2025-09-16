package com.codegnan.oppexamples;

public class Student {
	
	String name;
    int[] marks;

    
    void setDetails(String n, int[] m) {
        name = n;
        marks = m;
    }
    
    int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    double calculateAverage() {
        int total = calculateTotal();
        return (double) total / marks.length;
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        String studentName = "Ram";
        int[] marksArray = {50, 60, 80, 80, 90};
        s1.setDetails(studentName, marksArray);
        s1.displayDetails(); 
    }
}