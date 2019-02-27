/*
 * Created on Apr 8, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.collections.lecture;

import java.util.*;

import com.att.javatraining.collections.lecture.ATTEmployee;

public class TreeSetComparatorExample {

	public static void main(String[] args) {

		TreeSet myCoworkers = new TreeSet(new NameSalaryComparator());

		ATTEmployee sally = new ATTEmployee("Sally", "314-235-1663", 1000000);
		ATTEmployee sally2 = new ATTEmployee("Sally","314-235-1635", 50000);
		ATTEmployee rick = new ATTEmployee("Rick", "314-235-4114", 25000);

		myCoworkers.add(sally);
		myCoworkers.add(sally2);
		myCoworkers.add(rick);
		
		System.out.println("Name\t\tPhone Number\t\tSalary\n");
		Iterator setIterator = myCoworkers.iterator();
		while (setIterator.hasNext()) {
			ATTEmployee employee = (ATTEmployee) setIterator.next();
			System.out.println(employee.getName()+  
				"\t\t" + employee.getPhoneNumber() +
				"\t\t" + employee.getSalary());
		}
	}		
}
