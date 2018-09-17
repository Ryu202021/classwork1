package com.bayviewglen.dayfour;

import java.util.Scanner;

/*
 * Declaring a Scanner to read input from the Keyboard.
 * 
 * Reading double data.
 * 
 * Calculate the Surface Area of a box.
 * 
 * You must prompt the user of the length and width of the base and the height of the box
 * 
 * You can assume the box has a lid.
 */
public class ExampleTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the length and width of the base: " );
		double length = in.nextDouble();
		double width = in.nextDouble();
		
		System.out.print("Please enter the height of the box: ");
		double height = in.nextDouble();
		
		double surfaceArea = 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
		
		System.out.println("The Surface Area of the box is: " + surfaceArea + "m^2.");
	}

}
