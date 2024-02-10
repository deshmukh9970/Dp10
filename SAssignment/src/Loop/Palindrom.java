package Loop;

import java.util.Scanner;

public class Palindrom {
	
	public static void checkPlaindrom()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		int rem,rev=0;
		int temp=num;
		while(num!=0)
		{
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;	
			
		}
		
		if(rev==temp)
		{
			System.out.println(rev+" This is Palindrom Number");
		}
		else {
			System.out.println(rev+" This not Palindrom Nmuber");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPlaindrom();

	}

}
