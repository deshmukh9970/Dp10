package System.out;

public class Palindrome {
	
	static void checkPaindrom(int num)
	{
		int temp=num;
		int rev=0;
		int rem=0;
		
		while(num !=0)
		{
		   rem=num%10;
		   rev=rev*10+rem;
		   num=num/10;
			
		}
		
		if(rev==temp)
		{
			System.out.println(temp);
		}
		else 
		{
			//System.out.println("Not paindrom Number");
		}
		
		
	}
	
	public static void main(String[] args) {
		 
		for(int i=0;i<=500;i++)
		{
			checkPaindrom(i);
		}
	}

}
