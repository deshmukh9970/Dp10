package ClaasAndObject;

public class DefaultValue {
	
	
	// You can not access instance variable directly created object and access;
	int custId;
	String s;
	
	public void localValue()
	{
		int a=10;
		System.out.println("local value declear : "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultValue obj=new DefaultValue();
		
		obj.localValue();
		
		System.out.println("Defalut value int : "+obj.custId);
		System.out.println("Default value of String : "+obj.s);
		

	}

}
