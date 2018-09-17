package com.bayviewglen.dayfive;

public class DayFiveReview {

	public static void main(String[] args) {
		double price = 985.0;
		double HST = 5.5;

		double total = price * (HST / 100);
		double totalPrice = Math.round(total);
		double totalCents = (int)(total / 0.01) % 100;
		System.out.println("1. The total price is $" + (int)totalPrice + "." + (int)totalCents + ".");
		
		double length = 4.5;
		double width = 2.3;
		
		double area = length * width;
		double perimeter = 2 * length + 2 * width;
		
		double finalArea = (Math.round(area * 100.0)) / 100.0;
		double finalPerimeter = (Math.round(perimeter * 100.0)) / 100.0;
		
		System.out.println("2a. The area of the rectangle is " + finalArea + " ft^2.");
		System.out.println("2b. The perimeter of the rectangle is " + finalPerimeter + " ft.");
		
		int yearDays = 365;
		int yearHours = yearDays * 24;
		int yearMinutes = yearHours * 60;
		
		
		System.out.println("3. The number of minutes in one year is " + yearMinutes + ".");
		
		int lightSpeed = (int) (3 * (Math.pow(10, 8)));
		int yearSeconds = yearMinutes * 60;
		
		int lightYearD = lightSpeed * yearSeconds;
		
		System.out.println("4. The distance the light beam would travel in one year is " + lightYearD + "m.");
		
		double wins = 110;
		double loss = 44;
		double totalGames = wins + loss;
		
		double winPercent = wins / totalGames;
		double winPercentRound = Math.round(winPercent * 100000.0) / 1000.0;
		
		System.out.println("5. The Yankee's winning percentage was " + winPercentRound + "%.");
		
		double mass = 10; //kg
		double velocity = 12; //per second
		
		double momentum = mass * velocity;
		
		System.out.println("6. The momentum of the object is travelling at " + momentum + " SI units.");
		
		double F = 98.0;
		double C = (F - 32) * 5.0/9.0;
		
		System.out.println("7. If the temperature is " + F + " degrees Farenheit, the temperature in Celcius is " + C + " degrees Celcius.");
		
		int number = 4;
		double nsquare = Math.pow(number, 2);
		double nsqrt = Math.sqrt(nsquare);
		
		System.out.println("8a. If the number is " + number + ", the number squared is " + nsquare + ".");
		System.out.println("8b. If the number is " + number + "and the square root of the number is " + nsqrt + ".");
		
		int itemSold = 10;
		double comission = 0.27;		
		double totalPay = itemSold * comission;
		
		System.out.println("9. The amount of pay due is $" + totalPay + ".");
		
		double l = 2;
		double w = 9;
		
		double A = l * w;
		double P = 2 * l + 2 * w;
				
		System.out.println("10a. The area of the rectangle is " + A + " units squared.");
		System.out.println("10b. The perimeter of the rectangle is " + P + " units.");
		
		double m = 10; //mass
		double v = 5; //velocity
		
		double KE = (1.0 / 2.0) * m * (Math.pow(v, 2));
		
		System.out.println("11. The Kinetic Energy (KE) of the object is " + KE + ".");
		
		 
	}

}
