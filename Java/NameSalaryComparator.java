/*
 * Created on Apr 14, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.collections.lecture;

import java.util.Comparator;

import com.att.javatraining.collections.lecture.ATTEmployee;

/**
 * @author mg0319
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class NameSalaryComparator implements Comparator {


	public int compare(Object emp1, Object emp2) {
		ATTEmployee firstEmployee = (ATTEmployee) emp1;
		ATTEmployee secondEmployee = (ATTEmployee) emp2;
		
		// use the String compareTo() to find out if name =,>, or <
		int nameCompareResult = 
			firstEmployee.getName().compareTo(secondEmployee.getName());
		if (nameCompareResult != 0) {
			return nameCompareResult;
		}
				
		// phone and name are the same, compare the salary
		if (firstEmployee.getSalary() > secondEmployee.getSalary()) {
			return 1;
		}
		if (firstEmployee.getSalary() < secondEmployee.getSalary()) {
			return -1;
		}
		
		// must be equal!
		return 0;
	}

}
