package Own;

public class Armstrong{
	
	
    
    public static boolean armstorngNumber(int num)
    {
       int originalnum=num;
       int sum=0;
       int digitCount=countDigit(num);
       while(num !=0)
       {
         int rem=num%10;
         sum=sum+power(rem,digitCount);
         num=num/10;
          
       }
      return (originalnum == sum);
      
    }

    public static int countDigit(int num)
    {
      int count=0;
      while(num !=0)
      {
    	  count++;
        num=num/10;
        
      } 
      
      return count;
    }

   public static int power(int rem ,int digitCount)
   {
          int result =1;
       for(int i=1;i<=digitCount;i++)
       {
           result=rem*i;
       }
      return result;
   }
  

    public static void main(String[] args)
    {
      
      System.out.println("Armstrong Number 1 to 5000 is : "); 
      
       for(int i=1;i<=5000;i++)
       {
         if(armstorngNumber(i))
         {
           System.out.println(i);
         }
       } 

    }

}
