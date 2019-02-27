package com.att.javatraining.classes.labs;

public class Pet {
	private String name;
	private String color;
	private int age;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		 System.out.println("I do not speak!  I am a generic Pet!");
	}
	
	public void speak(int numberOfTimes) {
		for (int i = 0; i < numberOfTimes; i++) {
			speak();
		}
	}

}
