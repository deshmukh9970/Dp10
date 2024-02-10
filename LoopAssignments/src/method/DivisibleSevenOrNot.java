package method;

import java.util.Scanner;

public class DivisibleSevenOrNot {
	
	public static void seven()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		if(num%7==0)
		{
			System.out.println(num+" Number is Divisble by 7");
		}
		else {
			System.out.println(num+" Not Divisble By 7");
			
			System.out.println("This Number divisble by Zero: ");
			for(int i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					System.out.println(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		seven();

	}

}
