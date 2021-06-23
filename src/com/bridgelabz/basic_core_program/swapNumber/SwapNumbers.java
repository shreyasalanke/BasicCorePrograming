package com.bridgelabz.basic_core_program.swapNumber;

import java.util.Scanner;

public class SwapNumbers
{
   public static void main(String args[])
   {
      int x, y, t;
      System.out.println("Enter two numbers (x & y)");
      Scanner in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
     
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
     
      t = x;
      x = y;
      y = t;
     
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
   }
}