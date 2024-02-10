package method;

public class MaxNumber {
	
	public static int max(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println("Max Number is : "+a);
		}else if(b>a && b>c)
		{
			System.out.println("Max Number is : "+b);
		}
		else {
			System.out.println("Max Number is : "+c);
		}
		
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		max(10,5,8);

	}

}
