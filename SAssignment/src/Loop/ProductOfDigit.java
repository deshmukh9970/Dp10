package Loop;
import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		int rem=0;
		int product=1;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			product=product*rem;
			
		}
		System.out.println(product);

	}

}
