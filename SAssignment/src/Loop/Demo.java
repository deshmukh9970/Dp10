package Loop;

public class Demo {
	
	//print 1 to 50 if divisible 3 print  1 2 hi 7 8 hi 10 11 hi  and 3 and 5 asel ter Hello

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("Hello");
			}else if(i%3==0)
			{
				System.out.println("Hi");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
