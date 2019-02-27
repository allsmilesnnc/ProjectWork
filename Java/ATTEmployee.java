package com.att.javatraining.collections.lecture;

public class ATTEmployee implements Comparable {
	private String name;
	private String phoneNumber = "999-999-9999";
	private double salary = 0;
	
	public ATTEmployee(String aName) {
		name = aName;
	}

	public ATTEmployee(String aName, String aPhoneNumber) {
		this(aName);
		phoneNumber = aPhoneNumber;		
	}
	
	public ATTEmployee(String aName, String aPhoneNumber, double aSalary) {
		this(aName, aPhoneNumber);
		salary = aSalary;		
	}
	
	public int compareTo(Object o) {
		
		ATTEmployee comparedEmployee = (ATTEmployee)o;
		
		//compare the salary
		if (salary > comparedEmployee.getSalary()) {
			return 1;
		}
		if (salary < comparedEmployee.getSalary()) {
			return -1;
		}
		
		// must be equal!
		return 0;			
	}

	
	public String toString() {
		return "I am a ATTEmployee.  My name is " + name + " my Phone # is " + phoneNumber; 
	}

	public String getName() {
		return name;
	}


	public void setName(String string) {
		name = string;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String string) {
		phoneNumber = string;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double d) {
		salary = d;
	}

}
