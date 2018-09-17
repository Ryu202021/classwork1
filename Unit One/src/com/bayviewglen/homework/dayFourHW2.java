package com.bayviewglen.homework;

public class dayFourHW2 {

	public static void main(String[] args) {
		double x = 5.5;
		double y = 3.0;
		double z = -2.0;
		int i = 5;
		int j = 4;
		int k = 3;
		
		i -= 3;
		
		int a = i - j;
		
		System.out.println(a);
		
		i += 3;
		
		double b = x - y;		
		b *= (x + (i - j));		
		System.out.println(b);
		
		double c1 = x - y;
		double c2 = y - x;
		
		c1 *= 2;
		c2 *= 2;
		
		double c = c1 - c2;		
		System.out.println(c);
		
		double d = (x - y) - ((y - x) - ((x - y) - ((y - x))));
				
		System.out.println(d);
		

	}

}
