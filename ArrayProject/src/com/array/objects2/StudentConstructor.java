package com.array.objects2;

public class StudentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Student stud[]=new Student[3];
		 stud[0]=new Student(1, "Amar", new double[] {64.4,78.4,89.5}, new Course(1, "sql"));
		 stud[1]=new Student(2, "prasad", new double[] {64.4,78.4,89.5}, new Course(1, "java"));
		 stud[3]=new Student(3, "sank", new double[] {64.4,78.4,89.5}, new Course(1, "devops"));
		 
		 for(Student s:stud)
		 {
			 System.out.println(s);
		 }
		
	}

}
