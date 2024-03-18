package com.day12.exception;

public class Child {
	public void playWithDog(Dog dog,Item item) {
		try {
			dog.play(item);
		}
		catch(DogExceptions de) {
			System.out.println(de);
			de.visit();
		}
	}
}
