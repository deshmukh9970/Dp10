package Dowhile;

import java.util.Scanner;

public class ProgramContinunorNot {
	
	public static int add(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2 : ");
		int num2=sc.nextInt();
		
		int sum=add(num1,num2);
		
		System.out.println("Sum of number is : "+sum);
		System.out.println("Do yo went continue ? if yes enter y: ");
		 ch=sc.next().charAt(0); // this for store char 
		}while(ch=='y' || ch=='Y');
		
		System.out.println("Thanks End Of Program");

	}

}
