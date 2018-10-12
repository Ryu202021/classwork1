package com.bayviewglen.daytwo;

import java.util.Scanner;

public class CrossCountryAssign {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("First and Last name: ");
		String name1 = in.nextLine();
		
		int name1Space = name1.indexOf(" ");
		String lname1 = name1.substring(name1Space+1);
		String fname1 = name1.substring(0, name1Space);
		String finalName1 = lname1 + ", " + fname1;
		
		System.out.print(fname1 + "please enter mile one time (mm:ss.sss): ");
		String R1splitOne = in.nextLine();
		System.out.print(fname1 + "please enter time to end of Mile Two (mm:ss.sss): ");
		String R1mileTwo = in.nextLine();
		System.out.print(fname1 + "please enter the total time (mm:ss.sss): ");
		String R1totalTime = in.nextLine();
				
		int R1splitOneMinutes;
		double R1splitOneSeconds;
		
		int R1splitOneColon = R1splitOne.indexOf(":");
		R1splitOneMinutes = Integer.parseInt(R1splitOne.substring(0 , R1splitOneColon));
		R1splitOneSeconds = Double.parseDouble(R1splitOne.substring(R1splitOneColon+1));
		
		double R1splitOneInSeconds = R1splitOneMinutes * 60 + R1splitOneSeconds;
		
		int R1mileTwoMinutes;
		double R1mileTwoSeconds;
		
		int R1mileTwoColon = R1mileTwo.indexOf(":");
		R1mileTwoMinutes = Integer.parseInt(R1mileTwo.substring(0 , R1mileTwoColon));
		R1mileTwoSeconds = Double.parseDouble(R1mileTwo.substring(R1mileTwoColon+1));
		
		double R1mileTwoInSeconds = R1mileTwoMinutes * 60 + R1mileTwoSeconds;
		double R1splitTwoInSeconds = R1mileTwoInSeconds - R1splitOneInSeconds;
		
		int R1splitTwoMinutes = (int) R1splitTwoInSeconds / 60;
		double R1splitTwoSeconds = R1splitTwoInSeconds - R1splitTwoMinutes * 60;
		
		int R1totalTimeMinutes;
		double R1totalTimeSeconds;
		
		int R1totalTimeColon = R1totalTime.indexOf(":");
		R1totalTimeMinutes = Integer.parseInt(R1totalTime.substring(0 , R1totalTimeColon));
		R1totalTimeSeconds = Double.parseDouble(R1totalTime.substring(R1totalTimeColon+1));
		
		double R1totalTimeInSeconds = R1totalTimeMinutes * 60 + R1totalTimeSeconds;
		
		int R1splitThreeMinutes;
		double R1splitThreeSeconds;
		
		double R1splitThreeInSeconds = R1totalTimeInSeconds - (R1splitOneInSeconds + R1splitTwoInSeconds);
		
		R1splitThreeMinutes = (int) R1splitThreeInSeconds / 60;
		R1splitThreeSeconds = R1splitThreeInSeconds - R1splitThreeMinutes * 60;
		
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		System.out.println("Runner One");
		System.out.println();
		System.out.printf("%-20s%20s\n" , "Name: ", finalName1);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 1: ", R1splitOneMinutes , R1splitOneSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 2: ", R1splitTwoMinutes , R1splitTwoSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 3:" , R1splitThreeMinutes , R1splitThreeSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Total Time: " , R1totalTimeMinutes , R1totalTimeSeconds);
		System.out.printf("");
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n" , "Name" , "Split 1" , "Split 2" , "Split 3" , "Total Time");
		System.out.printf("%-20s%d:%06.3f%13d:%06.3f%13d:%06.3f%13d:%06.3f\n" , finalName1 , R1splitOneMinutes , R1splitOneSeconds , R1splitTwoMinutes , R1splitTwoSeconds , R1splitThreeMinutes , R1splitThreeSeconds , R1totalTimeMinutes , R1totalTimeSeconds);
		in.close();
	}

}
