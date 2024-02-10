package com.interfacejava8;

interface Student
{
	void show();
	
	default void display()
	{
		System.out.println("I am Student");
	}
	
}

interface Techer
{
    void show();
	
	default void display()
	{
		System.out.println("I am Techer");
	}
}

class School implements Student,Techer
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	//crate public oid display own method because of solving ambigute probleam 
	//of Student and teacher default method
	public void display()
	{
	     System.out.println("using interfacename and Super keyourd call one by method of ambigute ");
	     
		 Student.super.display();
		 Techer.super.display();
	}
	
	
}


public class DiamondProbleam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s;
		s=new School();
		s.display();
		s.show();
		
		Techer t;
		t=new School();
		t.display();
		t.show();
		
		

	}

}
