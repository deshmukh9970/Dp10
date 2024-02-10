package com.interfacedemo.lab;

@FunctionalInterface
interface Payment {
    void payAmount(double amount);

    
}

class Employee implements Payment {
    private String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void payAmount(double amount) {
        System.out.println("Employee " + employeeName + " is paying taxes: " + amount);
       
}
}   

class Celebrity implements Payment {
    private String celebrityName;

    public Celebrity(String celebrityName) {
        this.celebrityName = celebrityName;
    }

    @Override
    public void payAmount(double amount) {
        System.out.println("Celebrity " + celebrityName + " is paying taxes: " + amount);
        
    }
}

class Student implements Payment {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void payAmount(double amount) {
        System.out.println("Student " + studentName + " is paying fees: " + amount);
        // Additional logic for paying fees by a student
    }
}

public class PaymentExample1{
	
	public static void main(String[] args) {
		
		Payment employeePayment = new Employee("Amar");
        Payment celebrityPayment = new Celebrity("Pramod");
        Payment studentPayment = new Student("onkar");

       
        employeePayment.payAmount(2000); 
        celebrityPayment.payAmount(5000);
        studentPayment.payAmount(1000);  
	}
	
	
}

