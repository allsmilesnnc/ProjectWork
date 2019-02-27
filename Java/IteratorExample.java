/*
 * Created on Apr 8, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.collections.lecture;

import java.util.*;

import com.att.javatraining.collections.lecture.ATTEmployee;

/**
 * @author mg0319
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList myCoworkers = new ArrayList();
		myCoworkers.add(new ATTEmployee("Mark"));
		myCoworkers.add(new ATTEmployee("Rick"));
		myCoworkers.add(new ATTEmployee("Glenn"));
		Iterator it = myCoworkers.iterator();
		while (it.hasNext()) {
			ATTEmployee anEmployee = (ATTEmployee) it.next();
			System.out.println(anEmployee.getName());
			if (anEmployee.getName().equals("Mark")) {
				it.remove();
			}			 
		}
		if (!myCoworkers.contains("Mark")) {
			System.out.println("Mark was removed");
		}
	}
}
