package com.bayviewglen.daytwo;

import java.util.Scanner;

public class ExampleTwo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Mile One: ");
		String temp = in.nextLine();
		
		int minutes;
		double seconds;
		
		int colon = temp.indexOf(":");
		minutes = Integer.parseInt(temp.substring(0 , colon));
		seconds = Double.parseDouble(temp.substring(colon+1));
		
		// assume minutes = 5
		// assume seconds = 34.221
		
		// total time = 334.221 seconds
		// minutes * 60 + seconds
		
		double totalTime = minutes * 60 + seconds;
		int minute2 = (int) (totalTime / 60);
		double second2 = (totalTime % 60);
		System.out.println(totalTime);
		System.out.println(minute2);
		System.out.println(second2);

		
	}
}
