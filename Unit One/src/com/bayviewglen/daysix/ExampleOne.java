package com.bayviewglen.daysix;

public class ExampleOne {

	public static void main(String[] args) {
		// double x = Math.random();

		// System.out.println(x);

		// We want an integer from 0 to 9 (integer please)

		// int x = (int)(Math.random()) * 10;
		// System.out.println(x);
		// What if we want a number from 1 to 10?

		// x = (int)(Math.random() * 10) + 1;

		final int LOWER_BOUND = -10;
		final int UNIQUE_NUMBERS = 21;

		int x;
		int[] arr = new int[UNIQUE_NUMBERS];
		for (int i = 0; i < 100; i++) {
			x = (int) (Math.random() * UNIQUE_NUMBERS) + LOWER_BOUND;
			arr[x+(-LOWER_BOUND)]++;
			//System.out.println(x);
		}
		System.out.println("Done");

	}

}
