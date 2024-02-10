import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
	   int count=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count=count+1;
			}
		}
		if(count==1)
		{
			System.out.println(num+" Prime Number");
		}
		else
		{
		     System.out.println(num+" Not Prime Number");	
		}

	}

}
