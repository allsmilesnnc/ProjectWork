
package com.att.javatraining.collections.lecture;

import java.util.*;

import com.att.javatraining.collections.lecture.ATTEmployee;

public class HashMapExample {

	public static void main(String[] args) {
		ATTEmployee mark = new ATTEmployee("Mark", "235-1663");
		ATTEmployee frank = new ATTEmployee("Frank", "235-4114");
		
		Map attidMap = new TreeMap();
		attidMap.put("mg0319", mark);
		attidMap.put("fr2128", frank);
		
		ATTEmployee someEmployee = (ATTEmployee) attidMap.get("mg0319");
		System.out.println("Mark's Phone : " + someEmployee.getPhoneNumber());
	}
}
