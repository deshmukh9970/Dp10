
public class MethodCalling {
	
	public static void test()
	{
		System.out.println("Welcome");
	}
	
	public static void add(int a,int c)
	{
		System.out.println("Sum: "+(a+c));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 test(); // in same class no need to write class name
		 add(25,10);
		 
	}

}
