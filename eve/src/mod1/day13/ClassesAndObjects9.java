package mod1.day13;

public class ClassesAndObjects9 {
	public static void main(String[] args) {
		Human shoiab=new Human();
		
		Human sho=new Human("hello");
		
		Animal ani=new Animal();
	}
}
class Human{
	//constructor
	/*
	 * A constructor will be like a method, but the name will be the same class name
	 * The constructor does not have void nor return, it can public or private
	 * 
	 * What is needed for the initialization, that code is kept inside the constructor
	 * Note: It should be very important, without which the object can survice
	 */
	
	public Human() {
		System.out.println("human cons without param called...");
	}
	//overloaded constructor
	public Human(String name) {
		System.out.println("human cons with param called..."+name);
	}
}

class Animal{
	
}