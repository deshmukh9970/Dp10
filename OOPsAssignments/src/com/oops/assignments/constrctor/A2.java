package com.oops.assignments.constrctor;

class A2
{
    int i;
 
    {
        System.out.println("IIB-1");
 
        i = 100;
    }
 
    {
        System.out.println("IIB-2");
 
        System.out.println(i);
 
        i = 200;
    }
 
    public static void main(String[] args)
    {
        System.out.println("main");
 
        A2 a = new A2();
 
        System.out.println(a.i);
    }
}
