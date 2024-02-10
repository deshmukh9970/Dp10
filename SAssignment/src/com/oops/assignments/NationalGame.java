package com.oops.assignments;

import java.util.Scanner;

public class NationalGame {
	
	public void showNationalGame(String country)
	{
		
		switch(country) {
		case "India":
			  System.out.println("National Game of India Is Hockey");
			  break;
		case "china":
			  System.out.println("National Game of China Is Table Tennis");
			  break;
			  
		case "Bagldesh":
			  System.out.println("National Game of Bagldesh Is kabaddi");
			  break;
			  
		case "Itly":
			  System.out.println("National Game of Itly Is Football");
			  break;
	    
		case "United States":
			  System.out.println("National Game of United States Is Baseball");
			  break;
			  
	    default:
	    	 System.out.println("invalied");
			  
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NationalGame obj=new NationalGame();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Country name : ");
		
		String country=sc.nextLine();
		obj.showNationalGame(country);
		

	}

}
