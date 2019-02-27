package com.att.javatraining.complete.lecture;

public class CaughtExceptionTest {
	public static void main(String args[]) {
		int[] userIdArray = { 123, 456, 789 };
		try {
			System.out.println(userIdArray[3]); // will cause an exception
			System.out.println("No errors here!");
		} catch (Exception e) {
			System.out.println("Error Occured!");
		}
	}
}
  

