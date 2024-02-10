package com.overriding;

class Person{
	
	String name;
	
	Person()
	{
		name="Amar";
	}
	
	
	void show()
	{
		System.out.println("I am Person");
	}  
	
	
	static void Test()
	{
		System.out.println("Static method can not ovrride");
	}
	

	
}

class Employee  extends Person{
	
	@Override
	public void show() //child method access secifier is higher compare to parent
	{
		System.out.println("I am Employee"+name);
	}
	
	
	static void Test()
	{
		System.out.println("Static method can not ovrride");
	}
	
}


class Student extends Person
{
	
	@Override
	void show()
	{
		super.show();// Call Parent method of person using Super
		System.out.println("I am Student : "+name);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s= new Student();
		Employee e =new Employee();
		
		
		

	}

}
