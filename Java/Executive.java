
package com.att.javatraining.advancedclasses.lecture;

public class Executive extends Employee { //implements Administrator {

	double salary;
	
	public double computeBonusAmount() {
		double employeeBonus = super.computeBonusAmount();
		double execBonus = (salary * .25);
		return employeeBonus + execBonus;
}	

//	public double computeBonusAmount() {
//		return salary * .25;
//	}
		
	
	
}
