import java.util.Scanner;

public class Powercalculet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter Number :");
		   int num=sc.nextInt();
		   
		   System.out.println("Enter Power: ");
		   int power=sc.nextInt();
		   int temp=1;
		  for(int i=1;i<=power;i++)
		  {
			 temp=temp*num; 
		  }
		  System.out.println("Power of "+num+" is: "+temp);
	}

}
