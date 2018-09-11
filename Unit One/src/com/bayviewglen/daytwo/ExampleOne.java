package com.bayviewglen.daytwo;

/*
 * Topics Covered:
 * 1. Declaring Variables
 * 2. Primitive Data Types
 * 3. Assignment Operator
 * 4. String Concatenation
 * 5. CTRL-SHIFT-F is auto indent/format (Select ALL First CTRL-A)
 */
public class ExampleOne {
	public static void main(String[] args) {
		int x = 27;		// x and y will store ints (integers)
		int y;		// red squiggles are errors and yellow are warnings
		y = 23;
		
		int z;		// z will be the sum of x and y
		
		z = x + y;   // z is assigned x + y (a single = is the assignement operator)
		
		System.out.println(z);		//displays the value stored in z to the console

		
		// declare variables where you need them the first time
		
		int numberOne, numberTwo;	// you can declare multiple variables on the same
									// line as long as they are the same type
		numberOne = 18;
		numberTwo = 19;
		
		int sum = numberOne + numberTwo;	// we can declare and initialize on the same
											// line even if the initialization uses a function
		
		System.out.println(numberOne + " + " + numberTwo + " = " + sum);
	}

}
