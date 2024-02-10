package Loop;

public class AdditionalSeries2 {
	
	public static void test()
	{
		int num=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				num=num+i;
				System.out.print(num+", ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

}
