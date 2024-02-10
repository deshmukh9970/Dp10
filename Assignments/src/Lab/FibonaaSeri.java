package Lab;

public class FibonaaSeri {
	
	public static void fibonaa()
	{
		int a=0;
		int b=1;
		System.out.print(a);
		for(int i=2;i<=10;i++)
		{
			int c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibonaa();

	}

}
