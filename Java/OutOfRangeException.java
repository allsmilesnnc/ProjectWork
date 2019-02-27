package com.att.javatraining.exceptions.lecture;

public class OutOfRangeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maximumValue;
	private int minimumValue;
	private int outOfRangeValue;

	public OutOfRangeException(int min, int max, int current) {
	    super(" Minimum: " + min + " Maximum: " + max
	          + " Value encountered: " + current);
	    outOfRangeValue = current;
	    maximumValue = max;
	    minimumValue = min; 
	  }
	  public int getMaximumValue() { //More access methods follow
	    return maximumValue;
	  }
}




