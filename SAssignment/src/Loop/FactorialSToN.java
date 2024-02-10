package Loop;

import java.util.Scanner;

public class FactorialSToN {
	
	public static int factorial(int n)
	{
		int factorial=1;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
			sum=sum+factorial;
		}
		System.out.println(n+" number factorial is : "+factorial);
		System.out.println(" sum of factorial upto "+n+" is : "+sum);
		
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		factorial(num);

	}

}
