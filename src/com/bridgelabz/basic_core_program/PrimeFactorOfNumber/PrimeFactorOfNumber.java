package com.bridgelabz.basic_core_program.PrimeFactorOfNumber;

import java.util.Scanner;

public class PrimeFactorOfNumber {

	public static void main(String args[])
	 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  number to find Prime Factors ");   //
	int number=sc.nextInt();
	System.out.println("Given Number is : " + number);
	System.out.print("Prime Factors are : " );
	        for (int i = 2; i <= number; i++) {
	 
	            while (number % i == 0) {
	                System.out.print(i + " ");
	                number = number / i;
	            }
	        }
	 
	        if (number < 1) System.out.println(number);
	    }
}
