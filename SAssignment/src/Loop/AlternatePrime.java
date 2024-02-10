package Loop;

public class AlternatePrime {
	
	public static void test()
	{
		boolean skip=false;
		for(int i=1;i<=20;i++)
		{
			
			int count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==1  && skip)
			{
				System.out.print(i+" ");
				
			}
			skip=!skip;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		

	}

}
