package com.array.objects4;



public class StudentDemo {
	public static void main(String[] args) {
		Student[] stud=new Student[5];
		
		stud[0]=new Student(1, "amar", new double[] {80,82,84});
		stud[1]=new Student(2, "xyz", new double[] {91,92,93});
		stud[2]=new Student(3, "abc", new double[] {68,70,93});
		stud[3]=new Student(4, "zpr", new double[] {78,92,94});
		stud[4]=new Student(5, "pramod", new double[] {91,92,96});
		
		for(Student s:stud) {
			System.out.println(s);
		}
	}
}

