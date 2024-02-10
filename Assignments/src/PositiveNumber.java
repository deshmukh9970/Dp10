import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int no=sc.nextInt();
		
		if(no>0)
		{
			System.out.println("The is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}

	}

}
