package com.oops.assignments.constrctor;

public class Constructor2
{
  int count=10;
  Constructor2(int count)
  {
    System.out.println("Count=" + count);
  }

  public static void main(String[] args)
  {
    Constructor2 con = new Constructor2(20);
  }
}
