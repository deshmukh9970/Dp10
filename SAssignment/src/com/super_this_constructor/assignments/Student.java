package com.super_this_constructor.assignments;

//1. Create a class Student with int id and String name as member variables.
//2. Generate getter and setter methods for id and name. Observe in the generated setter method
//how the parameter’s value is assigned to the member variable using this keyword.
//3. What would happen in the setter method if you remove ‘this.’ when assigning the parameter
//value?
//4. In main create 2 objects of Student.
//5. Set id of first student to 11 and 21 to the other student’s id
//6. Check and observe if you can use ‘this’ in main method.
//7. super can be used to refer immediate parent class instance variable.
//8. super can be used to invoke immediate parent class method.
//9. super() can be used to invoke immediate parent class constructor.


public class Student {
	
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
