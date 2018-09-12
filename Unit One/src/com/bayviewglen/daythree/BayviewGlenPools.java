package com.bayviewglen.daythree;

public class BayviewGlenPools {

	public static void main(String[] args) {
		final double POOL_LENGTH = 50;
		final double POOL_WIDTH = 100;
		final double SH_END_H = 1;
		final double DE_END_H = 6;
		final double DE_END_L = 20;
		final double TRANSITION_LENGTH = 15;
		final double SH_END_L = POOL_LENGTH - ((Math.sqrt((Math.pow(TRANSITION_LENGTH, 2)) - (Math.pow(DE_END_H, 2)))) + DE_END_L);
		
	 
		double shallowEndBase = SH_END_H * POOL_WIDTH;
		double shallowEndSides = SH_END_L * SH_END_H;
		double shallowEndWall = SH_END_L * POOL_WIDTH;
		double shallowEndSA = shallowEndBase + (shallowEndSides * 2) + shallowEndWall;
		
		double deepEndWall = DE_END_H * POOL_WIDTH;
		double deepEndBase = DE_END_L * POOL_WIDTH;
		double deepEndSides = (2 * (DE_END_L * DE_END_H));
		double deepEndSA = deepEndWall + deepEndBase + deepEndSides;
		
		double transitionBase = (TRANSITION_LENGTH * POOL_LENGTH);
		double transitionSides = (TRANSITION_LENGTH * DE_END_H) + ((Math.sqrt((Math.pow(TRANSITION_LENGTH, 2)) - (Math.pow(DE_END_H, 2)))) * SH_END_H) / 2;
		double transitionSA = transitionBase + (transitionSides * 2);
		
		double totalSA = shallowEndSA + deepEndSA + transitionSA;
		double linerCost = totalSA * 60;
		
		
		
		// 176.7766953
		// 14.14213562
				

		System.out.println("1. The pool length is " + POOL_LENGTH + " .");
		System.out.println("2. The depth of the shallow end is " + SH_END_H + " and the depth of the deep end is "
				+ DE_END_H + " .");
		System.out.println("3. The length of transition between the shallow end and the deep end is " + TRANSITION_LENGTH + " .");
		System.out.println("4. The length of the shallow end is " + SH_END_L + " .");
		System.out.println("5. The price of the liner is $60/m^2. The price for the pool is $" + linerCost);

	}

}
