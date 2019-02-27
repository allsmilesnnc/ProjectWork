package com.att.javatraining.exceptions.lecture;

public class ThrowingExceptionsExample {

	public static void main(String[] args) {
    
		// Set x to 1 to throw first error, to 2 to throw the second error, and to 3 to throw the third error
		int x = 1;
		
		if (x == 1) {
		// Create an exception containing no error details
		// Then throw the exception
		IllegalArgumentException iae = new IllegalArgumentException();
		throw iae;
		}
		
		if (x == 2) {
		// Create a detailed exception, and then throw the exception
		IllegalArgumentException iae2 =
		    new IllegalArgumentException("Months must be positive");
		throw iae2;
		}
		
		if (x == 3) {
		// Create and throw a detailed exception in a single statement
		throw new IllegalArgumentException("Months must be positive");	
		}

	}
}
	




