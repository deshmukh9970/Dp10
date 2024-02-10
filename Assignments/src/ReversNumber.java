import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter Number: ");
		 int num=sc.nextInt();
		 int revers=0;
		 while(num !=0)
		 {
			 int rem=num%10;
			 revers=revers*10+rem;
			 num= num/10;
			 
			 
		 }
		 System.out.println("Revers of digit "+revers);


	}

}
