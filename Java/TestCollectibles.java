
package com.att.javatraining.advancedclasses.lecture;

public class TestCollectibles {
	
	public static void main(String[] args) {
		
		MuseumPainting mp = new MuseumPainting();
		double appraiseValue = mp.appraise();
		double cashValue = mp.getCashValue();
		System.out.println("appraiseValue = " + appraiseValue);
		System.out.println("cashValue = " + cashValue);
		
	}
}
