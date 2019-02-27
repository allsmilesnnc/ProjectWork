/*
 * Created on May 16, 2005
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
public class StringExample {

	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = "ABC"; 
		System.out.println(s1 == s2);
		s1 = "XYZ";
		s2 = "XYZ";
		s2 = "JKL";
		s1 = "ABC";
	}
}
