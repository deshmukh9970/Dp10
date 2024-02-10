package ClaasAndObject;

public class IndivalDataSet {
	
	int empId;
	String name;
	int salary;
	
	public void display()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary : "+salary);
		System.out.println("*******************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndivalDataSet obj=new IndivalDataSet();
		
		obj.empId=1;
		obj.name="Prasad";
		obj.salary=699888;
		
		IndivalDataSet obj1=new IndivalDataSet();
		obj1.empId=2;
		obj1.name="Amar";
		obj1.salary=388999;
		
		obj.display();
		obj1.display();

	}

}
