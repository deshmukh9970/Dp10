package Loop;

import java.util.Scanner;

public class AdditionalSeries4 {
	
	public static void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number For upto N Series: ");
		int upto=sc.nextInt();
		int num=2;
		System.out.print(num+" ");
		for(int i=2;i<=upto;i++)
		{
			num=num*2;
			if(i%2==0)
			{
				System.out.print("-"+num+" ");
			}
			else {
				System.out.print(num+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

}
