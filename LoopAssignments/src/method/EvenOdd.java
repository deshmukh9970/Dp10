package method;

import java.util.Scanner;

public class EvenOdd {
	
	public static void evenOdd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" Number is Even");
		}
		else {
			System.out.println(num+" Number is Odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		evenOdd();
 
	}

}
