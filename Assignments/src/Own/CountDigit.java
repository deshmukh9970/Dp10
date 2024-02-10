package Own;

public class CountDigit {
	
	public static void test(int num)
	{
		
		int count=0;
		while(num!=0)
		{
			int rem=num%10;
			count++;
			num=num/10;
			
		}
		System.out.println("Number of count digit is: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test(1531544);

	}

}
