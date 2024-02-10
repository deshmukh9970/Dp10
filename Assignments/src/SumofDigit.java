import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter Number: ");
		 int num=sc.nextInt();
		 int sum=0;
		 while(num !=0)
		 {
			 int rem=num%10;
			 num= num/10;
			 sum=sum+rem;
			 
		 }
		 System.out.println("Sum of digit "+sum);
	}

}
