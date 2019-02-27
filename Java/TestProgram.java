/*
 * Created on Apr 26, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.otherpackage.lecture;

import com.att.javatraining.advancedclasses.lecture.Employee;

/**
 * @author mg0319
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TestProgram {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.ssn = "999-99-9999"; // is this accessible? (Hint: make ssn on Employee object public)
	}

}
