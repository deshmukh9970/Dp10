package com.oops.assignments.method;

import java.util.Scanner;

class Student1 {
    int rollNumber;
    String name;
    int marksMath;
    int marksScience;
    int marksEnglish;

    
   public double calculatePercentage() {
        return (marksMath + marksScience + marksEnglish) / 3.0;
    }

    
   public void displayStudentData() {
        System.out.println("Student Information:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Math Marks: " + marksMath);
        System.out.println("Science Marks: " + marksScience);
        System.out.println("English Marks: " + marksEnglish);
    }

    
   public void setStudentData(int roll, String studentName, int mathMarks, int scienceMarks, int englishMarks) {
        rollNumber = roll;
        name = studentName;
        marksMath = mathMarks;
        marksScience = scienceMarks;
        marksEnglish = englishMarks;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Student1 student1 = new Student1();

        
        student1.setStudentData(101, "xyz", 85, 90, 78);

        
        student1.displayStudentData();

        
        double percentage = student1.calculatePercentage();
        System.out.println("Percentage: " + percentage + "%");

       
    }
}

