/*
 * Created on Apr 8, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.collections.lecture;

import java.util.*;

import com.att.javatraining.collections.lecture.ATTEmployee;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList myCoworkers = new ArrayList();

		ATTEmployee rick = new ATTEmployee("Rick");
		ATTEmployee glenn = new ATTEmployee("Glenn");
		ATTEmployee mark = new ATTEmployee("Mark");

		myCoworkers.add(mark);
		myCoworkers.add(glenn);
		myCoworkers.add(rick);

		myCoworkers.remove(mark);

		if (myCoworkers.contains(mark)) {
			System.out.println("I thought we fired him!");
		} else {
			System.out.println("Mark is no longer an employee");
		}

		// now print out list!
		for (int i=0; i < myCoworkers.size(); i++) {
			System.out.println(myCoworkers.get(i));
		}

		// replace Rick with a new employee named JT
		ATTEmployee newEmployee = new ATTEmployee("JT");
		myCoworkers.set(1, newEmployee);

		if (!myCoworkers.contains(rick)) {
			System.out.println("Rick was replaced by " + newEmployee.getName()); 
		}

//		System.out.println(myCoworkers);
	}
}
