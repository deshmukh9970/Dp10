import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num= sc.nextInt();
		int temp=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==2)
		{
			System.out.println("Number Is Prime");
		}
		else {
			System.out.println("Not Prime Number");
		}

	}

}
