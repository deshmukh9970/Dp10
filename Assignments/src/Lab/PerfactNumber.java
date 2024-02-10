package Lab;
import java.util.Scanner;

public class PerfactNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a Number : ");
		  int num =sc.nextInt();
		  int sum=0;
		 
		  for(int i=1;i<=num/2;i++) //half the number
		  {
			  
			  if(num%i==0)
			  {
				  System.out.print(i+" + ");
				  
				  sum=sum+i;
				 
			  }
		  }
		  System.out.println("="+sum);
		  
		  if(sum==num)
		  {
			  System.out.println();
			  System.out.println(num+" Perfact Number");
		  }
		  else {
			  System.out.println(num+" Not Perfact Number");
		  }
	}

}
