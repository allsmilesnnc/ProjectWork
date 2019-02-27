
package com.att.javatraining.exceptions.lecture;

public class TestExceptions {
	
	public static void main(String[] args) {
		
		// MyAppException Test
		try {
			if (0 != 1)
			{
				throw new MyAppException("There was an error, please try again!");
			}
		} catch (MyAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Built-In Exception Test
		try{
			checkMonth(15); // after testing with the number 15 change to a number between 1 and 12
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} finally {
			System.out.println("This gets printed no matter what happens!");
		}
		
	}
	
	// Built-In Exception Test
	public static void checkMonth(int value) {
		if (value < 1 || value > 12) {
			throw new IllegalArgumentException();
		}
	}

}
