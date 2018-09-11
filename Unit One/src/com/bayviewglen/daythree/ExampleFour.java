package com.bayviewglen.daythree;

public class ExampleFour {

	public static void main(String[] args) {
		final int NUMBER_OF_SIDES = 6;
		
		final int NUM_STUDENTS = 18;	// This makes our code easier to maintain
										// and easier to read
		
				
		int[] students = new int[NUM_STUDENTS];		// Don't stress about the array
		int testScores = 0;
		for (int i=0; i<NUM_STUDENTS; i++) {		// or for the loop
			testScores += students[i];
		}
		
		double average = testScores / (double)NUM_STUDENTS;
		// NUMBER_OF_SIDES = 8;		cannot change the value after it was finalized
		// Naming convention for constants is UPPER_CASE_WITH_UNDERSCORES
		
				
		// Hard-Coded numbers in your code are reffered to as magic numbers
		// We don't like magic numbers.  Create a constant instead. 
		// Constants go at the top.

	}

}
