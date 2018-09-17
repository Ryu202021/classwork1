package com.bayviewglen.homework;

import java.util.Scanner;

public class dayFourHW {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Please put in a number: ");
		double number = input.nextDouble();
		double numberSqrd = Math.pow(number, 2);
		
		System.out.println("The number is " + number + ".  The number squared is " + numberSqrd + ".");
		System.out.println("");
		
		System.out.print("2. Please put in the maximum test mark: ");		
		int test2 = input.nextInt();
		System.out.print("   Please put in the mark obtained on the test: ");
		int test1 = input.nextInt();	
		
		if (test1 > test2) {
			throw new IllegalArgumentException("Please put in your test mark first and what it is out of after: ");
			
		}
		
		double testMark = ((double)test1 / test2) * 100;
		
		System.out.println("Your test mark is: " + testMark + "%.");
		System.out.println("");
			
		System.out.print("3. Please put in a (5) digit number: ");
		
		int number5 = input.nextInt();
		
		if (number5 < 10000 || number5 > 99999) {
			throw new IllegalArgumentException("5 digits please");
			
		}
		System.out.println("");
		
		int digit2 = number5 / 1000 % 10;
		int digit4 = number5 % 100 / 10;
		
		int product = digit2 * digit4;
		
		System.out.println("The product of the 2nd digit and the 4th digit is: " + product + ".");
		
	
		
		System.out.print("Please put the initial velocity in km/h: ");
		double iVelocity = input.nextDouble();
		
		System.out.print("Please put the acceleration of the car in km/h^2: ");
		double acceleration = input.nextDouble();
		
		System.out.print("Please enter the time in hours: ");
		double time = input.nextDouble();
		
		double finalVelocity = iVelocity + acceleration * time;
		
		System.out.println("The final velocity of the car is: " + finalVelocity + " km/h.");
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
