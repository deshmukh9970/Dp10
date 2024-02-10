package com.test;


//Write a code to find the pair of elements whose sum is equivalent 
//to the given number in an array      

public class Pair
{
static void checkPair(int arr[],int sum)
{
   for(int i=0;i<arr.length;i++)
   {
        for(int j=i+1;j<arr.length;j++)
       {
          if(arr[i]+arr[j]==sum)
          {
              System.out.println(arr[i]+","+arr[j]);
          }
       }
   }
}

public static void main(String[] args)
{
 int arr[]={2,5,7,9,3,8,4};
 int sum=7;
 
checkPair(arr,sum);
}

}                                                                                                                           
