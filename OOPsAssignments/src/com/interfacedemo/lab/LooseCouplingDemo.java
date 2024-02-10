package com.interfacedemo.lab;

interface Message {

	void sendMessage(String msg);

}

class Whatsapps implements Message {
	String type;

	public Whatsapps() {

	}

	@Override
	public void sendMessage(String msg) {
		this.type = "Whatsapp";
		System.out.println(type + ":" + msg);

	}

}

class Telegrams implements Message {
	String type;

	public Telegrams() {

	}

	@Override
	public void sendMessage(String msg) {
		this.type = "Telegram";
		System.out.println(type + ":" + msg);

	}

}

public class LooseCouplingDemo {

//	public void msgNotify(Whatsapps w,String m)
//	{
//		w.sendMessage(m);
//	}
	// Loose coupling
	public void msgNotify(Message ser, String m) {
		ser.sendMessage(m);
	}

	public static void main(String[] args) {

		LooseCouplingDemo obj = new LooseCouplingDemo();
//		Whatsapp w1= new Whatsapp();
//		obj.msgNotify(w1, "Welcome");
//		
//		Telegram t1= new Telegram();
//		obj.msgNotify(t1, "Hello");

		Message s;
		s = new Whatsapps();
		obj.msgNotify(s, "Welcome");
		s = new Telegrams();
		obj.msgNotify(s, "Hello");

	}

}
