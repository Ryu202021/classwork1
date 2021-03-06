package com.bayviewglen.daythree;

public class ExampleTwo {

	public static void main(String[] args) {
		
		int number = 36027;
		
		//Add the individual digits in the number 
		//and display the sum to the screen
		
		int digit1 = number / 10000; 		// 3
		int digit5 = number % 10; 			// 7
		int digit2 = number / 1000 % 10;	// 6	(number / 1000) = 36 % 10 = 7
		int digit3 = number / 100 % 10;		// 0	(number / 100) = 360 % 10 = 0
		int digit4 = number % 100 / 10;		// 2	(number % 100) = 27 / 10 = 2
		
		// OR
		
		//digit 4 = number / 10 % 10;		// 2	(number / 10) = 3602 % 10 = 2
		
		int sum = digit1 + digit2 + digit3 + digit4 + digit5;
		
		System.out.println("The sum is the digits in " + number + " is : " + sum);

	}

}
