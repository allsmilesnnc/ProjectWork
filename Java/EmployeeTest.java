package com.att.javatraining.complete.lecture;

public class EmployeeTest {

    public static void main(String[] args) {
	Employee[] myEmployees = new Employee[2];
	
	myEmployees[0] = new Employee("Fred", 35000);
	myEmployees[1] = new Employee("Wilma", 40000);
		
	for ( int x = 0; x <= myEmployees.length; x++ ) {
	    System.out.println(myEmployees[x]);
	}
    }
}