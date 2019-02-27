/*
 * Created on Apr 26, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.advancedclasses.lecture;

/**
 * @author mg0319
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class PassByValueExample {

	public static void main(String[] args) {
	
	// PassByValue Example
	int myValue = 5;
	System.out.println(myValue);
	addTenToValue(myValue);
	System.out.println(myValue); 
	
//	// PassByValue Example2
//	Employee boss = new Employee();
//	Employee emp = new Employee();
//	emp.salary = 50000;
//	boss.giveBigRaise(emp);
//	System.out.println(emp.salary);

	}
	
	public static void addTenToValue(int value) {
		value = value + 10;
		System.out.println(value);
	}

	public void giveBigRaise(Employee luckyEmp) {
		   luckyEmp.salary += 10000;
	}
	
	
}
