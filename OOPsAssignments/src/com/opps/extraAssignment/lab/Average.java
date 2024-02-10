package com.opps.extraAssignment.lab;

import java.util.HashMap;
import java.util.Iterator;

//8.
//Print the average of three numbers entered by user by creating 
//a class named 'Average' having a method to calculate and print the average

public class Average {
	
	public static void main(String[] args) {
		
		 HashMap hashmap =new HashMap();
	        hashmap.put(1,"ram");
	        hashmap.put(2,"amar");
	        hashmap.put(3,"pramod");
	        
	        System.out.println(hashmap);
	        
	        Iterator it=hashmap.keySet().iterator();
	        
	        while(it.hasNext())
	        {
	            int key=(int)it.next();
	            System.out.println(key+"="+hashmap.get(key));
	        }
	}
	
	

}
