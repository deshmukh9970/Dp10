package com.coverient;

class Person{
	
	int id;
	String name;
	
	Person()
	{
		
	}
	
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	Person show()
	{
		name=name+"Amar";
		return this;
	}
	
	
}

class Employee extends Person{
	
	double salary;
	
	Employee()
	{
		
	}
	
	Employee(int id,String name,double salary)
	{
		super(id,name);
		this.salary=salary;
	}
	
//	Person show()
//	{
//		name=name+"Amar";
//		salary=salary+1000;
//		return this;
//	}
	
	//coverient type 
	Employee show()
	{
		name=name+"Amar";
		salary=salary+1000;
		return this;
	}
	
	
}



public class CoverientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person;
		
		Person p1=new Person(1,"Prasad");
		person=p1.show();
		
		System.out.println(person.id+"   "+person.name);
		
		
		Employee e1=new Employee(2,"Ok",45000);
		person=e1.show();
		//System.out.println(person.id+"   "+person.name+" "+person.salary); //here salary is not show becuse of not avible in person class
		System.out.println(person.id+"   "+person.name);
		
		
		
		
		Employee e;
		
		//e=(Employee) e1.show(); //casting
		//System.out.println(e.id+"   "+e.name+" "+e.salary);
		
		e=e1.show();//avoid to casting by coverient write in method check
		

	}

}
