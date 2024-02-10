package com.array.objects;

import java.util.Arrays;
import java.util.Scanner;

public class StudentArray {
	
	static Scanner sc=new Scanner(System.in);
	static void display(Student st[])
	{
		for(Student s:st)
		{
			System.out.println(s);
		}
	}
	
	
	static void enterDetalis(Student st[])
	{
		
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Enter id :");
			st[i].setId(sc.nextInt());
			
			
		}
	}
	
	//logic of hight roll no to lowest 
	
	static void sortRollno(Student st[])
	{
		Student stemp=new Student();// temp 
		
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].getRoll_no()<st[j].getRoll_no())
				{
					stemp=st[i];
					st[i]=st[j];
					st[j]=stemp;
				}
			}
		}
		
		//System.out.println(Arrays.toString(st));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student stud[]=new Student[5];
		
//		//System.out.println(stud[1].getId()); //null pointer exption
//		
//		stud[0]=new Student(1,"xyz",10);
//	    //stud[1]=new Student(); value is null
//		stud[1]=new Student(2,"yza",11);
//		stud[2]=new Student(3,"iop",12);
//		stud[3]=new Student(4,"sop",13);
//		stud[4]=new Student(5,"abc",14);
//		
//		
//		display(stud);
		
		Student stud[]=new Student[3];
		
		 //seting value in main  but here inlize consturctor also
		stud[0]=new Student();
		stud[1]=new Student();  //without consturor inilztion do not call becuse value is not set or display
		stud[2]=new Student();
		
		stud[0].setId(1);
		stud[0].setName("prasad");
		stud[0].setRoll_no(41);
		
		stud[1].setId(2);
		stud[1].setName("Amar");
		stud[1].setRoll_no(42);
		
		stud[2].setId(3);
		stud[2].setName("Sank");
		stud[2].setRoll_no(43);
		
		
		//priting output
		for(int i=0;i<stud.length;i++)
		{
			//System.out.println(stud[i]);
			
		}
		
		
		//user inpust call and method
		for(int i=0;i<stud.length;i++)
		{
			stud[i]=new Student();
			sortRollno(stud);
			
		}
		
		display(stud);
		
		
		

	}

}
