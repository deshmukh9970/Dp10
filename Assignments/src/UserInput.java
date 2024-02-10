import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		
	}
	

}
