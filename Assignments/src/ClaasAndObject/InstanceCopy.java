package ClaasAndObject;

public class InstanceCopy {
	
	int count=0;
	
	public void checkCount() {
		
		count++;
		System.out.println("Count : "+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceCopy b=new InstanceCopy();
		InstanceCopy b1=new InstanceCopy();
		InstanceCopy b2=new InstanceCopy();
		
		b.checkCount();
		b1.checkCount();
		b2.checkCount();

	}

}
