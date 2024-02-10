import java.util.Scanner;

public class MuliplicationOfnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter Number: ");
		 int num=sc.nextInt();
		 int multi=1;
		 while(num !=0)
		 {
			 int rem=num%10;
			 num= num/10;
			 multi=multi*rem;
			 
		 }
		 System.out.println("Multiplication of digit "+multi);

	}

}
