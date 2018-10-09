package com.bayviewglen.daytwo;

public class Quiz {

	public static void main(String[] args) {
		String quizString = "Noodlsajf;aejadfas";
		
		System.out.println(quizString.substring(quizString.length() - quizString.length() + 2 , quizString.length()) + quizString.substring(0 , 2));
	}

}
