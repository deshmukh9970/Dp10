package ClaasAndObject;

class SetValueAndGetValue {
	
	int empId;
	String name;
	int salary;
	
	public void setValue(int eid,String ename,int esalary)
	{
		empId=eid;
		name=ename;
		salary=esalary;
	}
	
	public void getValue()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee name : "+name);
		System.out.println("Employee Salary : "+salary);
	}

	
}
