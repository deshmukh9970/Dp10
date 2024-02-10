package Loop;

public class Disarum {
	
	public static int countDigit(int n)
	{
		int count=0;
		
		while(n!=0)
		{
			int digit=n%10;
			n=n/10;
			count++;
		}
		System.out.println("Count is: "+count);
		return count;
	}
	
	public static int powerCalculet(int base,int power)
	{
	   int result=1;
	   for(int i=1;i<=power;i++)
	   {
		   result=result*base;
	   }
	   System.out.println(result+" this is result");
	   
	   return result;
		
	}
	
	public static int sumOfDigit(int n)
	{
		int temp=n;
		int sum=0;
		int count=countDigit(n);
		while(n!=0)
		{
			int digit=n%10;
			sum=sum+powerCalculet(digit,count);
			count--;
			n=n/10;
		}
		System.out.println(sum+" sum is ");
		if(sum==temp)
		{
			return 1;
		}else
		{
			return 0;
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=135;
		int check=sumOfDigit(num);
		
		if(check==1)
		{
			System.out.println(num+" This is Disarum");
		}else {
			System.out.println(num+" This is not Disaram");
		}
		

	}

}
