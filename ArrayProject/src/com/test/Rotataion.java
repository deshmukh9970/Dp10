package com.test;

import java.util.Arrays;

//Write a program to rotate the array as follows:                                                          [2M]
//ar = {1,2,3,4,5,6,7}
// Output: {4,5,6,7,1,2,3}

public class Rotataion
{
 static void rotatedArray(int arr[])
 {
    int last=arr[arr.length-1];

    for(int i=arr.length-1;i>0;i--)
    {
        arr[i]=arr[i-1];
     }
   arr[0]=last;
   
 }

public static void main(String[] args)
{
   int arr[]={1,2,3,4,5,6,7};
  
   for(int i=0;i<4;i++)
   {
         rotatedArray(arr);
         System.out.println(Arrays.toString(arr));
         
   }

}
 
}
