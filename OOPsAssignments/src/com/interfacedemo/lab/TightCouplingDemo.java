package com.interfacedemo.lab;



interface MessageS {

	void sendMessage(String msg);

}

class Whatsapp implements MessageS {
	String type;

	public Whatsapp() {
		
	}

	@Override
	public void sendMessage(String msg) {
		this.type="Whatsapp";
		System.out.println(type+":"+msg);
		
	}

	
}

class Telegram implements MessageS {
	String type;

	public Telegram() {
		
	}

	@Override
	public void sendMessage(String msg) {
		this.type="Telegram";
		System.out.println(type+":"+msg);
		
	}

	
}

public class TightCouplingDemo {
	
	//Here TightCoupling with Whatsapp w you can not pass Telegram t
	public void msgNotify(Whatsapp w,String m)
	{
		w.sendMessage(m);
	}

	
	public static void main(String[] args) {
		
		TightCouplingDemo obj= new TightCouplingDemo();
		Whatsapp w1= new Whatsapp();
		obj.msgNotify(w1, "Welcome");
		
		//The method msgNotify(Whatsapp, String) in the type TightCouplingDemo is not applicable 
		//for the arguments (Telegram, String)
//		Telegram t1= new Telegram();
//		obj.msgNotify(t1, "Hello");
		
	
		
	}

}
