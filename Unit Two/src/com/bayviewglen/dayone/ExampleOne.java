package com.bayviewglen.dayone;

public class ExampleOne {
	/* Introduction to tne String class */
	public static void main(String[] args) {
		// A String is a sequence of characters
		// A String of characters 
		//(think a string of beads or sequence of beads on a String
		
		// A string is an Object type it is NOT Primitive
		String str = "This is a String";
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.substring(1, 4));
		
		System.out.println(str.substring(8));
		System.out.println(str.substring(8, str.length()));
		
		String name1 = "alpha";
		String name2 = "bet";
		
		System.out.println(name1.compareTo(name2));
		System.out.println(name2.compareTo(name1));
		System.out.println(name1.compareTo(name1));
		
		// If the two strings have the same sequence of characters
		// compareTo returns 0
		// If the string that activates or calls the method is greater than
		// the string it was being compared to, it returns a positive int
		// Ex. "Jason".compareTo("Jackson") returns a positive int
		// If the string that activates or calls the method is less than
		// the string it was being compared to, it returns a negative int
		// Ex. "Jackson".comparedTo("Jason") returns a negative int		
		
		// Use the ASCII table to compare characters (and strings)
		
		String x = new String("hello");
		String y = new String("hello");
		
		System.out.println(x==y);
		
		System.out.println(x.compareTo(y) == 0);
		
		System.out.println(x.equals(y));
	}

}
