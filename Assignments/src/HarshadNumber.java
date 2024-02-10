import java.util.Scanner;

public class HarshadNumber {
	
	public static boolean harshad(int num)
	{
		int sum=0;
		int original=num;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		
		if(original%sum==0)
		{
			return true;
		}
		else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
              
		//int harsh=harshad(num);
		
		if(harshad(num))
		{
			System.out.println(num+" Harshad Number");
		}else {
			System.out.println(num+" not Harshad Number");
		}
	}

}
