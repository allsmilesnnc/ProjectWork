package com.att.javatraining.complete.lecture;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
	ArrayList myEmployees = new ArrayList();
	
	myEmployees.add(new Employee("Fred", 35000));
	myEmployees.add(new Employee("Wilma", 40000));
	myEmployees.add(new Employee("Barney", 40000));
	
	for ( int x = 0; x <= myEmployees.size(); x++ ) {
	    System.out.println(myEmployees.get(x));
	}
    }
}
