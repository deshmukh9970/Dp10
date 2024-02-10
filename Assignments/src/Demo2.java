import java.util.Scanner;

//program for positive and sum if negtive not accept till sum 100
public class Demo2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int sum=0;
		 while(true)
		 {
			
			 System.out.println("Enter Number : ");
			 int num=sc.nextInt();
			
		 if(num<0)
		 {
			 break;
		 }
		 
		 sum=sum+num;
		 
		 if(sum>=100)
		 {
			 break;
		 }
		 
		 
		 }	
		
		System.out.println("Sum of Positive Number: "+sum);
	}

}
