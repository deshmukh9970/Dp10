package method;

public class PrimeNumber {
	
	public static void prime()
	{
		System.out.println("Prime Number Are : ");
		for(int i=1;i<=10;i++)
		{
			int count=0;
			for(int j=2;j<=i;j++) 
			{
				if(i%j==0) // Suppose i=5 then j start with 2 (3,4,5)and end with j<=i (5 tak)
				{
					count=count+1;
				}
			  
			}
			if(count==1) // count==1 because of j=2; start with 2 means divisible only its self not 1
				         // if j=1; start with 1 that time divisible by 1 and its self then count==2 is 2
			  {
				  System.out.println(i);
			  }
		}
	}

	public static void main(String[] args) {
		
		
		prime();

	}

}
