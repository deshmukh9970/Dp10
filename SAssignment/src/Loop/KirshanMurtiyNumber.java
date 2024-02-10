package Loop;

import java.util.Scanner;

public class KirshanMurtiyNumber {
	
	public static int getFact(int num)
	  {

	     int factorial=1;
	     for(int i=1;i<=num;i++)
	     {
	         factorial=factorial*i;
	     }

	  return factorial;
	  }
	
	 public static int kirshnmurti(int num)
	   {
	       int temp=num;
	       int sum=0;
	       while(num !=0)
	      {
	          int digit=num%10;
	          sum=sum+getFact(digit);
	          num=num/10;
	      }
	      
	    

	    if(sum==temp)
	    {
	      return 1;
	    }
	    else{
	      return 0;
	    }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
			  Scanner sc= new Scanner(System.in);
			  System.out.println("Enter number:" );
			  int num=sc.nextInt();
		     //int num=153;


			   int result=kirshnmurti(num);

			     if(result ==1)
			     {
			       System.out.println(num+" this is kirshnamurti number");
			     }
			     else
			     {
			        System.out.println(num+ " this is not kirshnamurti number");
			     }
			  
			

	}

}
