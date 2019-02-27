package com.att.javatraining.core.labs;

public class TelephoneTest {

	public static void main(String[] args) {
		
		Telephone tel1 = new Telephone("847", "898", "4552");
		Telephone tel2 = new Telephone("847", "898", "4552");
		Telephone tel3 = new Telephone("847", "898", "1224");
		
		System.out.println("tel1=tel2?" + tel1.equals(tel2));
		System.out.println("tel1=tel3?" + tel1.equals(tel3));
	
	}
}
