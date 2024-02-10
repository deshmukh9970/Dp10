package Lab;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to guess : ");
       int num=(int) (Math.random()*10)+1;
        //int num=7;
        boolean guess=false;
        int guessnumber=0;
        int attempts=0;
        int maxAttempts=3;
        while(attempts < maxAttempts)
        {
        	System.out.println("Your guess : ");
        	guessnumber=sc.nextInt();
        	attempts++;
        	
        	if(guessnumber<num)
        	{
        		System.out.println(guessnumber+" is too low. Guess a higher number.");
        	}else if(guessnumber>num) {
        		System.out.println(guessnumber+" is too high. Guess a lower number.");
        		
        	}else {
        		
        		System.out.println("Conguratulation You guessed");
        		System.out.println( "No of attempts"+attempts);
        		guess=true;
        		break;
        	}
        }
        if(!guess)
        {
        	System.out.println("Not guess Number" );
        	System.out.println("number is : "+num);
        }
       
	}

}
