package com.opps.classWork;

public class FoodMain {

	public static void main(String[] args) {
		
		Food obj=new Food();
		Food obj1=new Food();
		Food obj2=new Food();
		
	     obj.foodlist(2, "pav baji", 220);
		 obj1.foodlist(4, "ice cream",120);
         obj2.foodlist(6, "Manchurian", 230);
         
        
         obj.setFoodBytThis(9, "pqr", 220);
         obj1.setFoodBytThis(7, "xyz", 420);
         obj2.setFoodBytThis(3, "abc", 120);
         
         obj.display();
         obj1.display();
         obj2.display();
         
         System.out.println("Using this Keyword============================");
         
         obj.display1();
         obj1.display1();
         obj2.display1();
	}

}
