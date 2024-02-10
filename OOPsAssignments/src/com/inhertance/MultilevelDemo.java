package com.inhertance;

class Vehical{
	
	private int vno;
	private String vmodel;
	protected double price;
	
	public Vehical(int vno, String vmodel, double price) {
		
		this.vno = vno;
		this.vmodel = vmodel;
		this.price = price;
		
		System.out.println("Vehical");
	}

	public int getVno() {
		return vno;
	}

	public void setVno(int vno) {
		this.vno = vno;
	}

	public String getVmodel() {
		return vmodel;
	}

	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}

	
	public String toString() {
		return "vehical vno=" + vno + ", vmodel=" + vmodel + ", price=" + price;
	}
	
	
	
	
	
	
}

class Car extends Vehical{
	
	private String cname;

	public Car(int vno, String vmodel, double price,String cname) {
		super(vno,vmodel,price);
		this.cname = cname;
		System.out.println("Car");
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Car cname=" + cname +" "+getVno()+" "+getVmodel()+" "+price; //here price is protected so direct access
	}
	
	

	
	
}

class SuperCar extends Vehical{
	
	private double millage;

	// value pass of parent then car and aslo own value if  dont pass internally call Default constructor of parent
	public SuperCar(int vno, String vmodel, double price, double millage) {
		super(vno, vmodel, price);
		this.millage = millage;
		
		System.out.println("SuperCar");
	}

	public double getMillage() {
		return millage;
	}

	public void setMillage(double millage) {
		this.millage = millage;
	}
	
	
	
}

public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperCar s= new SuperCar(14, "X1", 9888888, 12);
		System.out.println(s);

	}

}
