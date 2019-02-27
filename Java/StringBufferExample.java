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
public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("bob");
		sb = sb.append("straw");
		sb = sb.insert(3, " sees ");
		System.out.println(sb);
		sb = sb.reverse();
		System.out.println(sb);
	}
}
