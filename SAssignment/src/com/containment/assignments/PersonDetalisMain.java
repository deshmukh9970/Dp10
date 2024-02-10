package com.containment.assignments;

//3. Create class Person which has attributes (name, gender, age, Address).
//Address is class which has attributes (city, state, country). Display Persons
//data
//Note. Containment using constructor and getter/setter

import java.util.Scanner;

public class PersonDetalisMain {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void enterDetalis(Person i)
	{
		System.out.println("Enter Name : ");
		i.setName(sc.next());
		
		System.out.println("Enter Gender : ");
		i.setGender(sc.next());
		
		System.out.println("Enter Age : ");
		i.setAge(sc.nextInt());
		
		//Here Object of Address or  you can create Anemias 
		Address a= new Address();
		
		System.out.println("Enter City : ");
		a.setCity(sc.next());
		
		System.out.println("Enter State : ");
		a.setState(sc.next());
		
		System.out.println("Enter Country : ");
		a.setCountry(sc.next());
		
		//Here passing Address Data in person Constructor
		i.setAddress(a);
		
		
		
	}
	
	public static void main(String[] args) {
		
		Person p=new Person();
		
		enterDetalis(p);
		
		System.out.println("Persons Data : "+p); // Here data printed because of toString method
		
	}

}
