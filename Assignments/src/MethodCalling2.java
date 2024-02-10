
public class MethodCalling2 {
	
	public static String show()
	{
		return "Hi";
	}
	
	public static int test(int a,int c)
	{
		int b=a+c;
		System.out.println(b);
		return b;
	}
	
	public static int test2(int a,int b)
	{
		
		return a+b;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=show();
		System.out.println(s);
		
		test(10,45);
		
		
		int add=test2(10,55);
		System.out.println(add);
		

	}

}
