package com.bayviewglen.daytwo;

import java.util.Scanner;

public class CrossCountryAssign2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("First and Last name:       ");
		String name1 = in.nextLine();
		System.out.print("Mile One time (mm:ss.sss): ");
		String R1splitOne = in.nextLine();
		System.out.print("Mile Two time (mm:ss.sss): ");
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
		
		int R1totalTimeMinutes;
		double R1totalTimeSeconds;
		
		int R1totalTimeColon = R1totalTime.indexOf(":");
		R1totalTimeMinutes = Integer.parseInt(R1totalTime.substring(0 , R1totalTimeColon));
		R1totalTimeSeconds = Double.parseDouble(R1totalTime.substring(R1totalTimeColon+1));
		
		int R1splitThreeMinutes;
		double R1splitThreeSeconds;
		
		R1splitThreeMinutes = R1totalTimeMinutes - (R1splitOneMinutes + R1splitTwoMinutes);
		R1splitThreeSeconds = R1totalTimeSeconds - (R1splitOneSeconds + R1splitTwoSeconds);
		
		System.out.println();
		System.out.println("****************************************************");
		System.out.println();
		
		System.out.printf("Name: %20s\n" , name1);
		System.out.printf("Split 1: %20s\n" , R1splitOne);
		System.out.printf("Split 2: %20s\n" , R1splitTwo);
		System.out.printf("Split 3: %20d:%.3f\n" , R1splitThreeMinutes , R1splitThreeSeconds);
		
		System.out.println();
		System.out.println("****************************************************");
		System.out.println();
		
		System.out.print("First and Last name:       ");
		String name2 = in.nextLine();
		System.out.print("Mile One time (mm/ss.sss): ");
		String R2splitOne = in.nextLine();
		System.out.print("Mile Two time (mm/ss.sss): ");
		String R2splitTwo = in.nextLine();
		System.out.println("Total time (mm/ss.sss):  ");
		String R2totalTime = in.nextLine();
		
		int R2splitOneMinutes;
		double R2splitOneSeconds;
		
		int R2splitOneColon = R2splitOne.indexOf(":");
		R2splitOneMinutes = Integer.parseInt(R2splitOne.substring(0 , R2splitOneColon));
		R2splitOneSeconds = Double.parseDouble(R2splitOne.substring(R2splitOneColon+1));
				
		int R2splitTwoMinutes;
		double R2splitTwoSeconds;
		
		int R2splitTwoColon = R2splitTwo.indexOf(":");
		R2splitTwoMinutes = Integer.parseInt(R2splitTwo.substring(0 , R2splitOneColon));
		R2splitTwoSeconds = Double.parseDouble(R2splitTwo.substring(R2splitTwoColon+1));
		
		int R2totalTimeMinutes;
		double R2totalTimeSeconds;
		
		int R2totalTimeColon = R2totalTime.indexOf(":");
		R2totalTimeMinutes = Integer.parseInt(R2totalTime.substring(0 , R2totalTimeColon));
		R2totalTimeSeconds = Double.parseDouble(R2totalTime.substring(R2totalTimeColon+1));
		
		int R2splitThreeMinutes;
		double R2splitThreeSeconds;
		
		R2splitThreeMinutes = R2totalTimeMinutes - (R2splitOneMinutes + R2splitTwoMinutes);
		R2splitThreeSeconds = R2totalTimeSeconds - (R2splitOneSeconds + R2splitTwoSeconds);
		String R2splitThree = R2splitThreeMinutes + ":" + R2splitThreeSeconds;
		
		System.out.println(R2splitThree);
		
		System.out.print("First and Last name:       ");
		System.out.print("Mile One time (mm:ss.sss): ");
	
		


		
		
		
		
		
		
		

		
		
		
		in.close();
	}

}
