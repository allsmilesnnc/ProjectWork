/*
 * Created on Apr 8, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.collections.lecture;

import java.util.*;

import com.att.javatraining.collections.lecture.ATTEmployee;

public class TreeSetComparableExample {

	public static void main(String[] args) {

		TreeSet myCoworkers = new TreeSet();

		ATTEmployee lucy = new ATTEmployee("Lucy", "314-235-4114", 125000);
		ATTEmployee mark = new ATTEmployee("Mark", "314-235-1663", 50000);
		ATTEmployee glenn = new ATTEmployee("Glenn","314-235-1635", 100000);

		myCoworkers.add(lucy);
		myCoworkers.add(mark);
		myCoworkers.add(glenn);
		
		System.out.println("Name\t\tPhone Number\t\tSalary\n");
		Iterator setIterator = myCoworkers.iterator();
		while (setIterator.hasNext()) {
			ATTEmployee employee = (ATTEmployee) setIterator.next();
			System.out.println(employee.getName()+  
				"\t\t" + employee.getPhoneNumber() +				"\t\t" + employee.getSalary());
		}
	}		
}
