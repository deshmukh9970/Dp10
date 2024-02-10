import java.util.Scanner;

public class ProductDigit {
	
	
	
	public static int productCal(int num)
	{
		int product=1;
		while( num!=0)
		{
			int digit=num%10;
			product=product*digit;
			num=num/10;
		}
		
		return product;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
        int productDigit=productCal(num);
        System.out.println("Product of Digit: "+productDigit);
	}

}
