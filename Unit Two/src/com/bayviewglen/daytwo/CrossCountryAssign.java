package com.bayviewglen.daytwo;

import java.util.Scanner;

public class CrossCountryAssign {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("First and Last name:       ");
		String name1 = in.nextLine();
		System.out.print("Mile One time (mm:ss.sss): ");
		String R1splitOne = in.nextLine();
		System.out.print("Time to end of Mile Two (mm:ss.sss): ");
		String R1splitTwo = in.nextLine();
		System.out.print("Total Time (mm:ss.sss):    ");
		String R1totalTime = in.nextLine();
		
		int R1splitOneMinutes;
		double R1splitOneSeconds;
		
		int R1splitOneColon = R1splitOne.indexOf(":");
		R1splitOneMinutes = Integer.parseInt(R1splitOne.substring(0 , R1splitOneColon));
		R1splitOneSeconds = Double.parseDouble(R1splitOne.substring(R1splitOneColon+1));
		
		int R1splitTwoMinutes;
		double R1splitTwoSeconds;
		
		int R1splitTwoColon = R1splitTwo.indexOf(":");
		R1splitTwoMinutes = Integer.parseInt(R1splitTwo.substring(0 , R1splitTwoColon));
		R1splitTwoSeconds = Double.parseDouble(R1splitTwo.substring(R1splitTwoColon+1));
		
		R1splitTwoMinutes = R1splitTwoMinutes - R1splitOneMinutes;
		R1splitTwoSeconds = R1splitTwoSeconds - R1splitOneSeconds;
		
		int R1totalTimeMinutes;
		double R1totalTimeSeconds;
		
		int R1totalTimeColon = R1totalTime.indexOf(":");
		R1totalTimeMinutes = Integer.parseInt(R1totalTime.substring(0 , R1totalTimeColon));
		R1totalTimeSeconds = Double.parseDouble(R1totalTime.substring(R1totalTimeColon+1));
		
		int R1splitThreeMinutes;
		double R1splitThreeSeconds;
		
		R1splitThreeMinutes = R1totalTimeMinutes - (R1splitOneMinutes + R1splitTwoMinutes);
		R1splitThreeSeconds = R1totalTimeSeconds - (R1splitOneSeconds + R1splitTwoSeconds);
		
		if (R1splitThreeSeconds > 60) { //Too many seconds adding to minutes
			int R1splitThreeExcessSeconds = (int) ((R1splitThreeSeconds - 60) / 60);
			R1splitThreeSeconds = R1splitThreeExcessSeconds - R1splitThreeSeconds;
			R1splitThreeMinutes = (int) (R1splitThreeMinutes + R1splitThreeExcessSeconds);
		}
		else if (R1splitThreeMinutes < 0) { //Minutes is less than 0 so subtracting from seconds
			int R1splitThreeExtraSeconds = R1splitThreeMinutes * (-60);
			R1splitThreeMinutes = 0;
			R1splitThreeSeconds = R1splitThreeSeconds + R1splitThreeExtraSeconds;
		}
		else if (R1splitThreeSeconds < 0) { //Seconds is less than 0 so subtracting from minutes
			int R1splitThreeExtraMinutes = (int) R1splitThreeSeconds / (-60);
			R1splitThreeMinutes = R1splitThreeMinutes + R1splitThreeExtraMinutes;
			R1splitThreeSeconds = R1splitThreeSeconds + (int) (-1) * R1splitThreeSeconds;
		}
		
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		System.out.println("Runner One");
		System.out.println();
		System.out.printf("%-20s%20s\n" , "Name: ", name1);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 1: ", R1splitOneMinutes , R1splitOneSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 2: ", R1splitTwoMinutes , R1splitTwoSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 3:" , R1splitThreeMinutes , R1splitThreeSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Total Time: " , R1totalTimeMinutes , R1totalTimeSeconds);
		System.out.printf("");
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n" , "Name" , "Split 1" , "Split 2" , "Split 3" , "Total Time");
		System.out.printf("%-20s%d:%06.3f%13d:%06.3f%13d:%06.3f%13d:%06.3f\n" , name1 , R1splitOneMinutes , R1splitOneSeconds , R1splitTwoMinutes , R1splitTwoSeconds , R1splitThreeMinutes , R1splitThreeSeconds , R1totalTimeMinutes , R1totalTimeSeconds);
		in.close();
	}

}
