package Loop;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=400;i>300;i--)
		{
			int count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
					
				}
			}
			if(count==1)
			{
				System.out.println(i);
			}
		}

	}

}
