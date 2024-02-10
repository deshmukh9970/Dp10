package ClaasAndObject;

public class SetvalueAndGetvalueMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SetValueAndGetValue obj=new SetValueAndGetValue();
		SetValueAndGetValue obj1=new SetValueAndGetValue();
		SetValueAndGetValue obj2=new SetValueAndGetValue();
		
		obj.setValue(1, "abc", 220);
		obj1.setValue(2, "xyz", 145);
		obj2.setValue(3, "bhy", 420);
		
		obj.getValue();
		obj1.getValue();
		obj2.getValue();

	}

}
