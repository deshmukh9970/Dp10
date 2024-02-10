package Loop;
import java.util.Scanner;

public class PowerCalculet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base : ");
		int num=sc.nextInt();
		
		System.out.println("Enter Power : ");
		int power=sc.nextInt();
		
		int temp=1;
		
		for(int i=1;i<=power;i++) // Here power value change 1 to upto power that why power in loop
		{
			temp=temp*num;
		}
      
		System.out.println(num+" of power "+power+ " = "+temp);
	}

}
