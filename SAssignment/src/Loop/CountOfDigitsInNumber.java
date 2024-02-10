package Loop;
import java.util.Scanner;

public class CountOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		int rem;
		int count=0;
		
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			count++;
			
		}
		System.out.println("Number Of Digit : "+count);

	}

}
