package com.opps.classWork;

 class Food {
	
	int foodid;
	String foodname;
    double price;
    
     public void foodlist(int fid,String fname,double fprice)
     {
    	 foodid=fid;
    	 foodname=fname;
    	 price=fprice;
     }
     
     public void setFoodWithouttThis(int foodid,String foodname,double price)
     {
    	 foodid=foodid;
    	 foodname=foodname;
    	 price=price;
     }
     
     public void setFoodBytThis(int foodid,String foodname,double price)
     {
    	 this.foodid=foodid;
    	 this.foodname=foodname;
    	 this.price=price;
     }
     
     
     //
     public void display()
     {
    	 System.out.println("Food id : "+foodid);
    	 System.out.println("Food name : "+foodname);
    	 System.out.println("Food price : "+price);
     }
    
     //Disply for This
     public void display1()
     {
    	 System.out.println("Food id : "+foodid);
    	 System.out.println("Food name : "+foodname);
    	 System.out.println("Food price : "+price);
     }
    
	

}
