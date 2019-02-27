
package com.att.javatraining.advancedclasses.lecture;

public class MuseumPainting extends Art implements CollectibleItem {

	private double cashValue;

	public double appraise() {
		return cashValue = ArtAppraiser.appraise(this);
	}
	public double getCashValue() {
		return cashValue;
	}
}
