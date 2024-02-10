package ClaasAndObject;

public class Student {
	
	int rollNo=20;
	String s="Prasad";
	
	public void show() {
		System.out.println("Welcome");
	}
	
	public void variable()
	{
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		
		stu.show();
		stu.variable();
		
		//access directly instance variable
		System.out.println("Dirct access: "+stu.rollNo);
		System.out.println("Direct acces name by object : "+stu.s);

	}

}
