package com.bridgelabz.basic_core_programming.flipcoin;

import java.util.Scanner;


public class FlipCoinMain {
	
	public static void main(String[] args) {
		

	Scanner scanner = new Scanner(System.in);
	System.out.println("enter numbr of times you want to flip a coin:");
	int inputValue = scanner.nextInt();
	int head = 0;
	int numOfFlips = 0;
	if (inputValue <= 0)
	{
	  System.out.println("please enter the positive enteger");
	}
	else
	{
		numOfFlips = inputValue;
		for(int i = 0; i < numOfFlips; i++ )
		{
			
				if (Math.random() > 0.5)
				{
					head++;
					System.out.println(head);
				}
		}
		double percentOfHeads = (head*100)/numOfFlips;
		double percentOfTails = 100-percentOfHeads;
		System.out.println("heads percentage:"+ percentOfHeads);
		System.out.println("tails percentage:"+ percentOfTails);
		
	}
	
	}
}
