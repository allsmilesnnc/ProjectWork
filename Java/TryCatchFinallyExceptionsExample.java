package com.att.javatraining.exceptions.lecture;

public class TryCatchFinallyExceptionsExample {

	public static void main(String[] args) {
    
		try {
		  parkInDriveway();
		} catch (BrakeFailureException bfe) {//TractionException skips
		  System.err.println("Brakes failed: " + bfe.getMessage());
		} catch (TractionException te) {//TractionException enters
		  System.err.println("Driveway too slick: " + te.getMessage());
		} catch (Exception e) {
		  System.err.println("Encountered " + e.getClass().getName()
		                     + ": " + e.getMessage());
		} finally {
		  turnOffEngine();
		}
		
	}
	
	public static void parkInDriveway() throws BrakeFailureException, TractionException {
		boolean brakeFailure = false; // change to true to generate BrakeFailureException
		boolean tractionIssues = false; // change to true to generate TractionException
		if (brakeFailure == true) {
			throw new BrakeFailureException();
		}
		else if (tractionIssues == true){
			throw new TractionException();
		}
		else {
			System.out.println("Parked Successfully!");
		}
	}
	
	public static void turnOffEngine() {
		System.out.println("Vehicle has been turned off");
	}
		
}

	




