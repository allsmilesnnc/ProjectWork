/*
 * Created on May 17, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.core.lecture;

/**
 * @author mg0319
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ToStringExample {

	public static void main(String[] args) {
		Employee emp = new Employee(123, 50000);
		String employeeAsString = emp.toString();
		System.out.println(employeeAsString);
	}
}
