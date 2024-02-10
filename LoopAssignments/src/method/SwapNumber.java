package method;

public class SwapNumber {
	
	public static int swap(int a,int b)
	{
		System.out.println("Befour Swap a="+a+ ", b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap a="+a+ ", b="+b);
		return 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       swap(2,4);
		 
	}

}
