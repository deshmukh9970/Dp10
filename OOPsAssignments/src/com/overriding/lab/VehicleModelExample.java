package com.overriding.lab;

//Task2>
//A vehicle has four wheels and a color assigned to it.
// A car is a vehicle with a seating capacity of four.
// An SUV is a car which has a 800 horsepower engine. Create a model detailing the same.

class Vehicle {
    int wheels;
    String color;

    Vehicle() {
      
    }

    Vehicle(int wheels,String color) {
        this.wheels = wheels;
        this.color = color;
    }

    void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Wheels: " + wheels);
        System.out.println("Color: " + color);
    }

	@Override
	public String toString() {
		return "Vehicle wheels=" + wheels + ", color=" + color;
	}
    
    
}

class Car extends Vehicle {
    int seatingCapacity;

    Car() {
        super();
      
    }

    Car(int wheels,String color, int seatingCapacity) {
        super(wheels,color);
        this.seatingCapacity = seatingCapacity;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }

	@Override
	public String toString() {
		return   " "+super.toString()+"\t Car seatingCapacity=" + seatingCapacity ;
	}
    
    
}

class SUV extends Car {
    int horsepower;
    int seatingCapacity;

    SUV() {
        super();
        this.horsepower = 800;
    }

    SUV(int wheels,String color,int seatingCapacity,int horsepower) {
        super(wheels,color,seatingCapacity);
        this.seatingCapacity=seatingCapacity;
        this.horsepower = horsepower;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Horsepower: " + horsepower);
    }

	@Override
	public String toString() {
		return " "+super.toString()+"\t SUV horsepower=" + horsepower;
	}
    
    
}

public class VehicleModelExample {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle(2,"Black");
        Car sedanCar = new Car(4,"Red",5);
        SUV luxurySUV = new SUV(4,"orange",4,800);
        
        System.out.println(genericVehicle);
        System.out.println(sedanCar);
        System.out.println(luxurySUV);
        

    }
}

