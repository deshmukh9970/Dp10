package Loop;
import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number N: ");
		int n=sc.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=n)
		{
			if(i%2 !=0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("Sum of All Odd Number is : "+sum);

	}

}
