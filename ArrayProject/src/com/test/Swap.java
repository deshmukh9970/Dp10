package com.test;

import java.util.Arrays;

//Write a code to find the maximum and minimum number in an array and swap them

public class Swap
{
static void maxAndmin(int arr[])
{
  int max=arr[0];
  int min=arr[1];

 for(int i=0;i<arr.length;i++)
 {
     if(max<arr[i])
     { 
         max=arr[i];
      }
     else if(min>arr[i])
     {
         min=arr[i];
     }
 }
  System.out.println("Max "+max);
  System.out.println("Min "+min);

}

 static void swapArray(int arr[])
 {
    for(int i=0;i<arr.length;i++) 
    {
        for(int j=i+1;j<arr.length;j++) 
         {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
       
   }
  System.out.println(Arrays.toString(arr));
   
 }
 

public static void main(String[] args)
{
   int arr[]={6,2,7,5,8,9};
   
   maxAndmin(arr);
   swapArray(arr);


   
 }


}
