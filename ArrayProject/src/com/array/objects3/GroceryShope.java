package com.array.objects3;

public class GroceryShope {
	
	static void findSupller(Supplier st[],String iteam)
	{
		for(Supplier s:st)
		{
			for(Iteam i:s.getIteam())
			{
				if(i.getIname().equals(iteam))
				{
					System.out.println(s);
				}
			}
		}
	}

	public static void main(String[] args) {

             Supplier sup[]=new Supplier[3];
             
             
             
             Iteam i1[]=new Iteam[3];
             
             i1[0]=new Iteam(1,"Suger",200);
             i1[1]=new Iteam(2,"Chocalet",400);
             i1[2]=new Iteam(3,"Bisket",500);
             
             sup[0]=new Supplier(101,"Rahul",85269740, i1);
             
             Iteam i2[]=new Iteam[3];
             
             i2[0]=new Iteam(1,"Suger",200);
             i2[1]=new Iteam(2,"Chocalet",400);
             i2[2]=new Iteam(3,"Bisket",500);
             
             sup[1]=new Supplier(102,"Pk",85269740, i2);
             
             //Sparete 
             for(Supplier s:sup)
             {
            	// System.out.println("Supller Name "+s.getSname()+"mob "+s.getMoblieNo());
            	 for(Iteam i:s.getIteam())
            	 {
            		 System.out.println(i);
            	 }
            	 System.out.println("----------------------------------------");
             }
		
	}

}
