package com.bridgelabz.basic_core_program.QuotientAndReminder;

import java.util.Scanner;

public class QuotientReminder {


public static void main(String args[]){
Scanner scan=new Scanner(System.in);

System.out.print("Enter the value to num1: ");
int num1=scan.nextInt();
System.out.print("Enter the value to num2: ");
int num2=scan.nextInt();
int quotient=num1/num2;  
int remainder=num1%num2;  
System.out.println("Quotient is: "+quotient);
System.out.println("remainder is: "+remainder);
}
}