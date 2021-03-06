package com.bayviewglen.homework;

public class Sept7HW {

	public static void main(String[] args) {
		//1. PIr^2
		int r = 4;
		double areaOfCircle = (double)Math.PI * (Math.pow(r, 2));
		System.out.println("The area of a circle with radius " + r + " is " + areaOfCircle + ".");
		
		//2. 4/3*PI*r^3
		double volumeOfSphere = (double)4 / 3 * (double)Math.PI * (Math.pow(r,  3));		
		System.out.println("The volume of a sphere with radius " + r + " is " + volumeOfSphere + ".");
		
		//3. y=ax^2 + bx + c
		double a = 2;
		double b = 2;
		double c = 2;
		double x = 2;
		double y = (a * (Math.pow(x, 2)) + b * x + c); 
		
		System.out.println("The value of y " + " is " + y + ".");
		
		//4. y2 - y1/x2 - x1
		int y1 = 10;
		int y2 = 5;
		int x1 = 5;
		int x2 = 10;
		
		double slope = y2 - y1 / x2 - x1;
		System.out.println("The slope of the line " + " is " + slope + ".");
		
		//5. pennies, nickels, dimes, quarters, loonies, toonies
		int pennies = 10;
		int nickels = 5;
		int dimes = 8;
		int loonies = 12;
		int toonies = 32;
		
		double totalMoney = 0.01 * pennies + 0.05 * nickels + 0.1 * dimes + 1 * loonies + 2 * toonies;
		
		System.out.println("The total amount of money is " + totalMoney);
		
		//6. quadratic formula - (-b +-squrt b^2 - 4ac)/2
		
		double sixA = 4;
		double sixB  = 9;
		double sixC = -12;
		
		double root1 = (-1 * sixB + (Math.sqrt((Math.pow(sixB , 2)) - 4 * sixA * sixC))) / (2 * sixA);
		double root2 = (-1 * sixB - (Math.sqrt((Math.pow(sixB , 2)) - 4 * sixA * sixC))) / (2 * sixA);
		
		System.out.println("The 1st root is " + root1 + ", the 2nd root is " + root2 + ".");
		
		
		
		
	}

}
