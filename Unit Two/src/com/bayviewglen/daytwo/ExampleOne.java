package com.bayviewglen.daytwo;

public class ExampleOne {

	public static void main(String[] args) {
		int x = 234;

		System.out.println("This is the number: " + x);

		System.out.printf("This is the number: %d\n", x);

		int num1 = 10;
		int num2 = 19;
		int sum = num1 + num2;

		System.out.println(num1 + " + " + num2 + " = " + sum);

		System.out.printf("%d + %d = %d\n", num1, num2, sum);

		double a = 1.4356345;
		double b = 2.1203108;

		double c = a + b;

		System.out.println(a + " + " + b + " = " + c);

		System.out.printf("%+4.2f + %4.2f = %4.2f\n", a, b, c);
		//The 4 is the number of characters (in the number including the decimal)
		//The .2 is the amount of decimal places you want
		
		double num = -4.5678;
		System.out.printf("%+4.1f\n", num);
		// The + sign only says to show if its positive (+) or negative(-)
		System.out.printf("%+10.1f\n", num);
		// If you put more characters than the actual number, it will add more characters (spaces) the make it right aligned
		System.out.printf("%-+10.1f\n", num);
		// If you put the - sign it will make it left aligned and put the spaces on the right
		System.out.printf("%-+10.8f\n", num);
		// If you add more decimal places than there actually are, it will add more 0s instead
		
		
		int minutes = 11;
		double seconds = 34.2;
		
		System.out.printf("%3d:%.3f\n", minutes, seconds);
		// In a race, you show the time in 3 decimal places - don't have to specify the width, only the number of decimal places
		
		String name = "Phillip";
		
		System.out.printf("Hello %s, how are you today?", name);
		
		}
}