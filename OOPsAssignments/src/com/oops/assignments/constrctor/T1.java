package com.oops.assignments.constrctor;

class T1 {
	  int t = 20;
	  T1() {
	    t = 40;
	  }
	
	   public static void main(String args[]) {
	      T1 t1 = new T1();
	      System.out.println(t1.t);
	   }
	}