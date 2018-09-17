package com.bayviewglen.dayfour;

import java.util.Scanner;

/*
 * Declaring a Scanner to read input from the Keyboard.
 * 
 * Reading integer data.
 * 
 * Prompt the user for three different integers and display the average of the three numbers.
 */
public class ExampleOne {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		int x, y, z;
		System.out.print("Please enter three integers: ");
		
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		
		double average = (x + y + z) / 3.0;
		
		System.out.println("The average of the three numbers is: " + average);

	}

}
