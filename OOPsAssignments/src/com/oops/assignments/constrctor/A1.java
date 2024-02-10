package com.oops.assignments.constrctor;

class A1
{
    {
        System.out.println(1);
    }
 
    public A1()
    {
        System.out.println(2);
    }
 
    public static void main(String[] args)
    {
        System.out.println(3);
 
        A1 a = new A1();
    }
}
