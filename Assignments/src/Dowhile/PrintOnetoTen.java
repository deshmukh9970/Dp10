package Dowhile;

public class PrintOnetoTen {
	
	public static void printNo()
	{
		int i=1;
		do {
			System.out.println(i);
			i++;  //do not use that loop go to infinite condition
		}while(i<=10);
	}
	
	public static void display(int n)
	{
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
	}
	
	public static void printOnce()
	{
		int i=12;
		do {
			System.out.println(i); // here i am not write increment operator but condi run only one time 
			                       // because oh (12<=10) condition is false only run one time print 12
			
		}while(i<=10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNo();
		display(4);
		printOnce();

	}

}
