package com.bayviewglen.daytwo;

/*
 * 1. Primitive Data ->> double
 * 2. Casting
 */
public class ExampleTwo {
	/*
	 * Get the average of 3 marks - do it twice
	 */
	public static void main(String[] args) {
		double markOne, markTwo, markThree;
		double averageMark;		//double stores decimal values (also referred to as floating point decimal values)
		
		markOne = 10;
		markTwo = 10;
		markThree = 10;
		
		averageMark = (markOne + markTwo + markThree) / 3;
		
		System.out.println("The average of the three marks was: " + averageMark);
		//if it is a double, even if the answer is an integer with no decimals, it would add .0 because it is a decimal
		
		
		int testOne, testTwo, testThree;
		testOne = 70;
		testTwo = 75;
		testThree = 70;
		
		//the average should be 71.66 according to calculator
		
		averageMark = (testOne + testTwo + testThree) / 3;		//both the operands are ints so we do integer division
		System.out.println("The average of the three marks was: " + averageMark);
		//	The average of the three marks was: 71.0
		// hmmm... averageMark is a double so it displays as a decimal value BUT an unexpected value.
		
		//one solution to our problem
		averageMark = (testOne + testTwo + testThree) / 3.0;	//one of the operands is a double so we do double division
		System.out.println("The average of the three marks was: " + averageMark);
		//	The average of the three marks was: 71.66666666666667
		
		//casting\/
		averageMark = (double)(testOne + testTwo + testThree) / 3;	//cast the 1st operation as a double
		System.out.println("The average of the three marks was: " + averageMark);
		//	The average of the three marks was: 71.66666666666667

	}

}
