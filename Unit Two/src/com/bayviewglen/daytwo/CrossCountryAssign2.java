package com.bayviewglen.daytwo;

import java.util.Scanner;

public class CrossCountryAssign2 {

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
		
		System.out.print("First and Last name:       ");
		String name2 = in.nextLine();
		System.out.print("Mile One time (mm:ss.sss): ");
		String R2splitOne = in.nextLine();
		System.out.print("Time to end of Mile Two (mm:ss.sss): ");
		String R2splitTwo = in.nextLine();
		System.out.print("Total Time (mm:ss.sss):    ");
		String R2totalTime = in.nextLine();
		
		int R2splitOneMinutes;
		double R2splitOneSeconds;
		
		int R2splitOneColon = R2splitOne.indexOf(":");
		R2splitOneMinutes = Integer.parseInt(R2splitOne.substring(0 , R2splitOneColon));
		R2splitOneSeconds = Double.parseDouble(R2splitOne.substring(R2splitOneColon+1));
		
		int R2splitTwoMinutes;
		double R2splitTwoSeconds;
		
		int R2splitTwoColon = R2splitTwo.indexOf(":");
		R2splitTwoMinutes = Integer.parseInt(R2splitTwo.substring(0 , R2splitTwoColon));
		R2splitTwoSeconds = Double.parseDouble(R2splitTwo.substring(R2splitTwoColon+1));
		
		R2splitTwoMinutes = R2splitTwoMinutes - R2splitOneMinutes;
		R2splitTwoSeconds = R2splitTwoSeconds - R2splitOneSeconds;
		
		int R2totalTimeMinutes;
		double R2totalTimeSeconds;
		
		int R2totalTimeColon = R2totalTime.indexOf(":");
		R2totalTimeMinutes = Integer.parseInt(R2totalTime.substring(0 , R2totalTimeColon));
		R2totalTimeSeconds = Double.parseDouble(R2totalTime.substring(R2totalTimeColon+1));
		
		int R2splitThreeMinutes;
		double R2splitThreeSeconds;
		
		R2splitThreeMinutes = R2totalTimeMinutes - (R2splitOneMinutes + R2splitTwoMinutes);
		R2splitThreeSeconds = R2totalTimeSeconds - (R2splitOneSeconds + R2splitTwoSeconds);
		
		if (R2splitThreeSeconds > 60) { //Too many seconds adding to minutes
			int R2splitThreeExcessSeconds = (int) ((R2splitThreeSeconds - 60) / 60);
			R2splitThreeSeconds = R2splitThreeExcessSeconds - R2splitThreeSeconds;
			R2splitThreeMinutes = (int) (R2splitThreeMinutes + R2splitThreeExcessSeconds);
		}
		else if (R2splitThreeMinutes < 0) { //Minutes is less than 0 so subtracting from seconds
			int R2splitThreeExtraSeconds = R2splitThreeMinutes * (-60);
			R2splitThreeMinutes = 0;
			R2splitThreeSeconds = R2splitThreeSeconds + R2splitThreeExtraSeconds;
		}
		else if (R2splitThreeSeconds < 0) { //Seconds is less than 0 so subtracting from minutes
			int R2splitThreeExtraMinutes = (int) R2splitThreeSeconds / (-60);
			R2splitThreeMinutes = R2splitThreeMinutes + R2splitThreeExtraMinutes;
			R2splitThreeSeconds = R2splitThreeSeconds + (int) (-1) * R2splitThreeSeconds;
		}
		
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		System.out.println("Runner Two");
		System.out.println();
		System.out.printf("%-20s%20s\n" , "Name: ", name2);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 1: ", R2splitOneMinutes , R2splitOneSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 2: ", R2splitTwoMinutes , R2splitTwoSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 3:" , R2splitThreeMinutes , R2splitThreeSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Total Time: " , R2totalTimeMinutes , R2totalTimeSeconds);
		System.out.printf("");
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		System.out.print("First and Last name:       ");
		String name3 = in.nextLine();
		System.out.print("Mile One time (mm:ss.sss): ");
		String R3splitOne = in.nextLine();
		System.out.print("Time to end of Mile Two (mm:ss.sss): ");
		String R3splitTwo = in.nextLine();
		System.out.print("Total Time (mm:ss.sss):    ");
		String R3totalTime = in.nextLine();
		
		int R3splitOneMinutes;
		double R3splitOneSeconds;
		
		int R3splitOneColon = R3splitOne.indexOf(":");
		R3splitOneMinutes = Integer.parseInt(R3splitOne.substring(0 , R3splitOneColon));
		R3splitOneSeconds = Double.parseDouble(R3splitOne.substring(R3splitOneColon+1));
		
		int R3splitTwoMinutes;
		double R3splitTwoSeconds;
		
		int R3splitTwoColon = R3splitTwo.indexOf(":");
		R3splitTwoMinutes = Integer.parseInt(R3splitTwo.substring(0 , R3splitTwoColon));
		R3splitTwoSeconds = Double.parseDouble(R3splitTwo.substring(R3splitTwoColon+1));
		
		R3splitTwoMinutes = R3splitTwoMinutes - R3splitOneMinutes;
		R3splitTwoSeconds = R3splitTwoSeconds - R3splitOneSeconds;
		
		int R3totalTimeMinutes;
		double R3totalTimeSeconds;
		
		int R3totalTimeColon = R3totalTime.indexOf(":");
		R3totalTimeMinutes = Integer.parseInt(R3totalTime.substring(0 , R3totalTimeColon));
		R3totalTimeSeconds = Double.parseDouble(R3totalTime.substring(R3totalTimeColon+1));
		
		int R3splitThreeMinutes;
		double R3splitThreeSeconds;
		
		R3splitThreeMinutes = R3totalTimeMinutes - (R3splitOneMinutes + R3splitTwoMinutes);
		R3splitThreeSeconds = R3totalTimeSeconds - (R3splitOneSeconds + R3splitTwoSeconds);
		
		if (R3splitThreeSeconds > 60) { //Too many seconds adding to minutes
			int R3splitThreeExcessSeconds = (int) ((R3splitThreeSeconds - 60) / 60);
			R3splitThreeSeconds = R3splitThreeExcessSeconds - R3splitThreeSeconds;
			R3splitThreeMinutes = (int) (R3splitThreeMinutes + R3splitThreeExcessSeconds);
		}
		else if (R3splitThreeMinutes < 0) { //Minutes is less than 0 so subtracting from seconds
			int R3splitThreeExtraSeconds = R3splitThreeMinutes * (-60);
			R3splitThreeMinutes = 0;
			R3splitThreeSeconds = R3splitThreeSeconds + R3splitThreeExtraSeconds;
		}
		else if (R3splitThreeSeconds < 0) { //Seconds is less than 0 so subtracting from minutes
			int R3splitThreeExtraMinutes = (int) R3splitThreeSeconds / (-60);
			R3splitThreeMinutes = R3splitThreeMinutes + R3splitThreeExtraMinutes;
			R3splitThreeSeconds = R3splitThreeSeconds + (int) (-1) * R3splitThreeSeconds;
		}
		
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		System.out.println("Runner Three");
		System.out.println();
		System.out.printf("%-20s%20s\n" , "Name: ", name3);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 1: ", R3splitOneMinutes , R3splitOneSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 2: ", R3splitTwoMinutes , R3splitTwoSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 3:" , R3splitThreeMinutes , R3splitThreeSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Total Time: " , R3totalTimeMinutes , R3totalTimeSeconds);
		System.out.printf("");
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n" , "Name" , "Split 1" , "Split 2" , "Split 3" , "Total Time");
		System.out.printf("%-20s%d:%06.3f%13d:%06.3f%13d:%06.3f%13d:%06.3f\n" , name1 , R1splitOneMinutes , R1splitOneSeconds , R1splitTwoMinutes , R1splitTwoSeconds , R1splitThreeMinutes , R1splitThreeSeconds , R1totalTimeMinutes , R1totalTimeSeconds);
		System.out.printf("%-20s%d:%06.3f%13d:%06.3f%13d:%06.3f%13d:%06.3f\n" , name2 , R2splitOneMinutes , R2splitOneSeconds , R2splitTwoMinutes , R2splitTwoSeconds , R2splitThreeMinutes , R2splitThreeSeconds , R2totalTimeMinutes , R2totalTimeSeconds);
		System.out.printf("%-20s%d:%06.3f%13d:%06.3f%13d:%06.3f%13d:%06.3f\n" , name3 , R3splitOneMinutes , R3splitOneSeconds , R3splitTwoMinutes , R3splitTwoSeconds , R3splitThreeMinutes , R3splitThreeSeconds , R3totalTimeMinutes , R3totalTimeSeconds);
		
		in.close();
	}

}
