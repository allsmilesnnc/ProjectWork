package com.att.javatraining.classes.labs;

public class Owner {

	public static void main(String[] args) {
		// REMEMBER YOU ARE NOW CREATING A DOG OBJECT NOT A PET OBJECT.
		// Pet myDog = new Pet();
		// myDog.speak();
		//	
		// myDog.setName("Fido");
		// myDog.setColor("Black/White");
		// myDog.setAge(7);
		//	
		// System.out.println(myDog.getName());
		// System.out.println(myDog.getColor());
		// System.out.println(myDog.getAge());

		Dog myDog = new Dog();
		myDog.setName("Fido");
		myDog.setColor("red");
		myDog.setAge(1);
		myDog.speak(2);
		myDog.fetchPaper();

		Cat myCat = new Cat();
		myCat.setName("Felix");
		myCat.setColor("white");
		myCat.setAge(5);
		myCat.speak(3);
		myCat.catchMouse();
	}

}
