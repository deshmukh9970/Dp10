package Loop;

import java.util.Scanner;

public class MilkAndOil {
	
	public static void milkOil()
	{
		
		int sum=0;
		
		while(sum<=500)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Quantity Of Milk");
			int milk=sc.nextInt();
			System.out.println("Enter Quantity Of Oil");
			int oil=sc.nextInt(); 
			
			sum=(milk*40)+(oil*50);
			
			if(sum==500)
			 {
				System.out.println(milk);
				System.out.println(oil+" this oil");
				 break;
			 }
			System.out.println("Tota Coat is "+sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		milkOil();
	}

}
