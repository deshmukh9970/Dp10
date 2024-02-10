import java.util.Scanner;

public class FactorNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
        {
        	if(num%i==0)
        	{
        		System.out.println(i);
        		count=count+1;
        	}
        }
        System.out.println(" number of Factor Count "+num+" is :"+count);
	}

}
