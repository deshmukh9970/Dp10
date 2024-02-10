package Lab;

import java.util.Scanner;

public class Fascinatnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		if(num>3) {
		int result=1;
		int result1=1;
		
		 result=num*2;
		 result1=num*3;
		 System.out.println(result+" "+result1);
		 
		 String s="num+result+result1";
		 System.out.println(s);
		}	 

	}

}
