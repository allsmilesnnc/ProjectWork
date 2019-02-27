package com.att.javatraining.complete.lecture;

import java.util.ArrayList;


public class CaughtArrayListTest {

    public static void main(String[] args) {
	ArrayList myEmployees = new ArrayList();

	myEmployees.add(new Employee("Fred", 35000));
	myEmployees.add(new Employee("Wilma", 40000));
	myEmployees.add(new Employee("Barney", 40000));

	try {
	    for (int x = 0; x <= myEmployees.size(); x++) {
		System.out.println(myEmployees.get(x));
//		System.out.println(myEmployees.get(x).getName());
//		Employee emp = (Employee)myEmployees.get(x);
//		System.out.println(emp.getName());
	    }
	} catch (Exception e) {
	    System.err.println("Oops! Found a problem.");
	    System.err.println("Error is: " + e.toString());
	}
    }
}
