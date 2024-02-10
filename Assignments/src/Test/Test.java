package Test;

public class Test {
	
	public static void series1() {
		int num=0;
		for(int i=0;i<=10;i++)
	    {
	    	
			   num=num+num+1;
	    		System.out.print(num+" ");
	    	
	    }
		System.out.println();
	}
	
	public static void series2()
	{
		int num=2;
		for(int i=2;i<=10;i++)
		{
		    num=num+num-1;
			System.out.print(num+" ");
			
			
		}
		System.out.println();
	}
	
	public static void combine()
	{
		int num=0;
		int n=2;
		for(int i=1;i<=10;i++)
		{
			num=num+num+1;
			System.out.print(num+" ");
			System.out.print(n+" ");
			n=n+n-1;
			
		}
	}
	
	
	
	
	
  
	   public static void main(String[] args) {
		
		   series1();
		  System.out.println("=======================================");
		   series2();
		   
		   System.out.println("=======================================");
        
			combine();
		   
	}
}
