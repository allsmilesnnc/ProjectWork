package com.att.javatraining.complete.lecture;

public class CaughtEmployeeTest {

    public static void main(String[] args) {
	Employee[] myEmployees = new Employee[2];

	myEmployees[0] = new Employee("Fred", 35000);
	myEmployees[1] = new Employee("Wilma", 40000);

	try {
	    for (int x = 0; x <= myEmployees.length; x++) {
		System.out.println(myEmployees[x]);
	    }
	} catch (Exception e) {
	    System.err.println("Oops! Found a problem.");
	    System.err.println("Error is: " + e.toString());
	}
    }
}
