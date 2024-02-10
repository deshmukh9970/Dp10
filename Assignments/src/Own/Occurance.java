package Own;

import java.util.Scanner;

public class Occurance {
	
	public static void display(int num)
	{
		int digit;
		for(digit=0;digit<=9;digit++)
		{
			int occurrence=calculetDigit(num,digit);
			if(occurrence>0)
			{
				System.out.println(digit+" digit Occurrance is : "+occurrence);
			}
		}
	}

	private static int calculetDigit(int num, int digit) {
		
		int occurrence=0;
		
		while(num !=0 )
		{
			int rem=num%10;
			if(rem==digit)
			{
				occurrence++;
			}
			num=num/10;
		}
		
		return occurrence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		
		display(n);

	}

}
