package com.bayviewglen.dayfour;

/* Short Cut Assignment Operators */
public class ExampleFour {

	public static void main(String[] args) {
	int x = 7;
	int y = 10;
	/*
	System.out.println(x++);
	System.out.println(x);

	System.out.println(++y);
	System.out.println(y);
	*/
	
	int sum = ++x + y;
	System.out.println(x);
	System.out.println(y);
	System.out.println(sum);
	
	// x++; is the same as x = x + 1;
	// -- subtracts 1
	
	x = x + 3;
	
	x += 3;
	x -= 3;
	
	x *= 3;
	x /=3;
	x %= 3;
	
	// we can also do x %= 3;	
	
	}

}
