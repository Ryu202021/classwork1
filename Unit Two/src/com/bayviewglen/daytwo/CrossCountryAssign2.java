package com.bayviewglen.daytwo;

import java.util.Scanner;

public class CrossCountryAssign2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		

		System.out.print("First and Last name: ");
		String name1 = in.nextLine();
		System.out.print("Mile One time (mm:ss.sss): ");
		String R1splitOne = in.nextLine();
		System.out.print("Time to end of Mile Two (mm:ss.sss): ");
		String R1splitTwo = in.nextLine();
		System.out.print("Total Time (mm:ss.sss):    ");
		String R1totalTime = in.nextLine();
		
		int name1Space = name1.indexOf(" ");
		String lname1 = name1.substring(name1Space+1);
		String fname1 = name1.substring(0, name1Space);
		String finalName1 = lname1 + ", " + fname1;
		
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
		System.out.printf("%-20s%20s\n" , "Name: ", finalName1);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 1: ", R1splitOneMinutes , R1splitOneSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 2: ", R1splitTwoMinutes , R1splitTwoSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 3:" , R1splitThreeMinutes , R1splitThreeSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Total Time: " , R1totalTimeMinutes , R1totalTimeSeconds);
		System.out.printf("");
		System.out.println();
		System.out.println("******************************************");
		System.out.println();

		System.out.print("First and Last name: ");
		String name2 = in.nextLine();
		System.out.print("Mile One time (mm:ss.sss): ");
		String R2splitOne = in.nextLine();
		System.out.print("Time to end of Mile Two (mm:ss.sss): ");
		String R2splitTwo = in.nextLine();
		System.out.print("Total Time (mm:ss.sss):    ");
		String R2totalTime = in.nextLine();
		
		int name2Space = name2.indexOf(" ");
		String lname2 = name2.substring(name2Space+1);
		String fname2 = name2.substring(0, name2Space);
		String finalName2 = lname2 + ", " + fname2;
		
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
		System.out.printf("%-20s%20s\n" , "Name: ", finalName2);
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
		
		int name3Space = name3.indexOf(" ");
		String lname3 = name3.substring(name3Space+1);
		String fname3 = name3.substring(0, name3Space);
		String finalName3 = lname3 + ", " + fname3;
		
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
		System.out.printf("%-20s%20s\n" , "Name: ", finalName3);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 1: ", R3splitOneMinutes , R3splitOneSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 2: ", R3splitTwoMinutes , R3splitTwoSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 3:" , R3splitThreeMinutes , R3splitThreeSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Total Time: " , R3totalTimeMinutes , R3totalTimeSeconds);
		System.out.printf("");
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		System.out.print("First and Last name: ");
		String name4 = in.nextLine();
		System.out.print("Mile One time (mm:ss.sss): ");
		String R4splitOne = in.nextLine();
		System.out.print("Time to end of Mile Two (mm:ss.sss): ");
		String R4splitTwo = in.nextLine();
		System.out.print("Total Time (mm:ss.sss): ");
		String R4totalTime = in.nextLine();
		
		int name4Space = name4.indexOf(" ");
		String lname4 = name4.substring(name4Space+1);
		String fname4 = name4.substring(0, name4Space);
		String finalName4 = lname4 + ", " + fname4;
		
		int R4splitOneMinutes;
		double R4splitOneSeconds;
		
		int R4splitOneColon = R4splitOne.indexOf(":");
		R4splitOneMinutes = Integer.parseInt(R4splitOne.substring(0 , R4splitOneColon));
		R4splitOneSeconds = Double.parseDouble(R4splitOne.substring(R4splitOneColon+1));
		
		int R4splitTwoMinutes;
		double R4splitTwoSeconds;
		
		int R4splitTwoColon = R4splitTwo.indexOf(":");
		R4splitTwoMinutes = Integer.parseInt(R4splitTwo.substring(0 , R4splitTwoColon));
		R4splitTwoSeconds = Double.parseDouble(R4splitTwo.substring(R4splitTwoColon+1));
		
		R4splitTwoMinutes = R4splitTwoMinutes - R4splitOneMinutes;
		R4splitTwoSeconds = R4splitTwoSeconds - R4splitOneSeconds;
		
		int R4totalTimeMinutes;
		double R4totalTimeSeconds;
		
		int R4totalTimeColon = R4totalTime.indexOf(":");
		R4totalTimeMinutes = Integer.parseInt(R4totalTime.substring(0 , R4totalTimeColon));
		R4totalTimeSeconds = Double.parseDouble(R4totalTime.substring(R4totalTimeColon+1));
		
		int R4splitThreeMinutes;
		double R4splitThreeSeconds;
		
		R4splitThreeMinutes = R4totalTimeMinutes - (R4splitOneMinutes + R4splitTwoMinutes);
		R4splitThreeSeconds = R4totalTimeSeconds - (R4splitOneSeconds + R4splitTwoSeconds);
		
		if (R4splitThreeSeconds > 60) { //Too many seconds adding to minutes
			int R4splitThreeExcessSeconds = (int) ((R4splitThreeSeconds - 60) / 60);
			R4splitThreeSeconds = R4splitThreeExcessSeconds - R4splitThreeSeconds;
			R4splitThreeMinutes = (int) (R4splitThreeMinutes + R4splitThreeExcessSeconds);
		}
		else if (R4splitThreeMinutes < 0) { //Minutes is less than 0 so subtracting from seconds
			int R4splitThreeExtraSeconds = R4splitThreeMinutes * (-60);
			R4splitThreeMinutes = 0;
			R4splitThreeSeconds = R4splitThreeSeconds + R4splitThreeExtraSeconds;
		}
		else if (R4splitThreeSeconds < 0) { //Seconds is less than 0 so subtracting from minutes
			int R4splitThreeExtraMinutes = (int) R4splitThreeSeconds / (-60);
			R4splitThreeMinutes = R4splitThreeMinutes + R4splitThreeExtraMinutes;
			R4splitThreeSeconds = R4splitThreeSeconds + (int) (-1) * R4splitThreeSeconds;
		}
		
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		System.out.println("Runner Four");
		System.out.println();
		System.out.printf("%-20s%20s\n" , "Name: ", finalName4);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 1: ", R4splitOneMinutes , R4splitOneSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 2: ", R4splitTwoMinutes , R4splitTwoSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 3:" , R4splitThreeMinutes , R4splitThreeSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Total Time: " , R4totalTimeMinutes , R4totalTimeSeconds);
		System.out.printf("");
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		

		System.out.print("First and Last name: ");
		String name5 = in.nextLine();
		System.out.print("Mile One time (mm:ss.sss): ");
		String R5splitOne = in.nextLine();
		System.out.print("Time to end of Mile Two (mm:ss.sss): ");
		String R5splitTwo = in.nextLine();
		System.out.print("Total Time (mm:ss.sss):    ");
		String R5totalTime = in.nextLine();
		
		int name5Space = name5.indexOf(" ");
		String lname5 = name5.substring(name5Space+1);
		String fname5 = name5.substring(0, name5Space);
		String finalName5 = lname5 + ", " + fname5;
		
		int R5splitOneMinutes;
		double R5splitOneSeconds;
		
		int R5splitOneColon = R5splitOne.indexOf(":");
		R5splitOneMinutes = Integer.parseInt(R5splitOne.substring(0 , R5splitOneColon));
		R5splitOneSeconds = Double.parseDouble(R5splitOne.substring(R5splitOneColon+1));
		
		int R5splitTwoMinutes;
		double R5splitTwoSeconds;
		
		int R5splitTwoColon = R5splitTwo.indexOf(":");
		R5splitTwoMinutes = Integer.parseInt(R5splitTwo.substring(0 , R5splitTwoColon));
		R5splitTwoSeconds = Double.parseDouble(R5splitTwo.substring(R5splitTwoColon+1));
		
		R5splitTwoMinutes = R5splitTwoMinutes - R5splitOneMinutes;
		R5splitTwoSeconds = R5splitTwoSeconds - R5splitOneSeconds;
		
		int R5totalTimeMinutes;
		double R5totalTimeSeconds;
		
		int R5totalTimeColon = R5totalTime.indexOf(":");
		R5totalTimeMinutes = Integer.parseInt(R5totalTime.substring(0 , R5totalTimeColon));
		R5totalTimeSeconds = Double.parseDouble(R5totalTime.substring(R5totalTimeColon+1));
		
		int R5splitThreeMinutes;
		double R5splitThreeSeconds;
		
		R5splitThreeMinutes = R5totalTimeMinutes - (R5splitOneMinutes + R5splitTwoMinutes);
		R5splitThreeSeconds = R5totalTimeSeconds - (R5splitOneSeconds + R5splitTwoSeconds);
		
		if (R5splitThreeSeconds > 60) { //Too many seconds adding to minutes
			int R5splitThreeExcessSeconds = (int) ((R5splitThreeSeconds - 60) / 60);
			R5splitThreeSeconds = R5splitThreeExcessSeconds - R5splitThreeSeconds;
			R5splitThreeMinutes = (int) (R5splitThreeMinutes + R5splitThreeExcessSeconds);
		}
		else if (R5splitThreeMinutes < 0) { //Minutes is less than 0 so subtracting from seconds
			int R5splitThreeExtraSeconds = R5splitThreeMinutes * (-60);
			R5splitThreeMinutes = 0;
			R5splitThreeSeconds = R5splitThreeSeconds + R5splitThreeExtraSeconds;
		}
		else if (R5splitThreeSeconds < 0) { //Seconds is less than 0 so subtracting from minutes
			int R5splitThreeExtraMinutes = (int) R5splitThreeSeconds / (-60);
			R5splitThreeMinutes = R5splitThreeMinutes + R5splitThreeExtraMinutes;
			R5splitThreeSeconds = R5splitThreeSeconds + (int) (-1) * R5splitThreeSeconds;
		}
		
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		System.out.println("Runner Five");
		System.out.println();
		System.out.printf("%-20s%20s\n" , "Name: ", finalName5);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 1: ", R5splitOneMinutes , R5splitOneSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 2: ", R5splitTwoMinutes , R5splitTwoSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Split 3:" , R5splitThreeMinutes , R5splitThreeSeconds);
		System.out.printf("%-20s%13d:%06.3f\n" , "Total Time: " , R5totalTimeMinutes , R5totalTimeSeconds);
		System.out.printf("");
		System.out.println();
		System.out.println("******************************************");
		System.out.println();
		
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n" , "Name" , "Split 1" , "Split 2" , "Split 3" , "Total Time");
		System.out.printf("%-20s%d:%06.3f%13d:%06.3f%13d:%06.3f%13d:%06.3f\n" , finalName1 , R1splitOneMinutes , R1splitOneSeconds , R1splitTwoMinutes , R1splitTwoSeconds , R1splitThreeMinutes , R1splitThreeSeconds , R1totalTimeMinutes , R1totalTimeSeconds);
		System.out.printf("%-20s%d:%06.3f%13d:%06.3f%13d:%06.3f%13d:%06.3f\n" , finalName2 , R2splitOneMinutes , R2splitOneSeconds , R2splitTwoMinutes , R2splitTwoSeconds , R2splitThreeMinutes , R2splitThreeSeconds , R2totalTimeMinutes , R2totalTimeSeconds);
		System.out.printf("%-20s%d:%06.3f%13d:%06.3f%13d:%06.3f%13d:%06.3f\n" , finalName3 , R3splitOneMinutes , R3splitOneSeconds , R3splitTwoMinutes , R3splitTwoSeconds , R3splitThreeMinutes , R3splitThreeSeconds , R3totalTimeMinutes , R3totalTimeSeconds);
		System.out.printf("%-20s%d:%06.3f%13d:%06.3f%13d:%06.3f%13d:%06.3f\n" , finalName4 , R4splitOneMinutes , R4splitOneSeconds , R4splitTwoMinutes , R4splitTwoSeconds , R4splitThreeMinutes , R4splitThreeSeconds , R4totalTimeMinutes , R4totalTimeSeconds);
		System.out.printf("%-20s%d:%06.3f%13d:%06.3f%13d:%06.3f%13d:%06.3f\n" , finalName5 , R5splitOneMinutes , R5splitOneSeconds , R5splitTwoMinutes , R5splitTwoSeconds , R5splitThreeMinutes , R5splitThreeSeconds , R5totalTimeMinutes , R5totalTimeSeconds);
		in.close();
	}

}
