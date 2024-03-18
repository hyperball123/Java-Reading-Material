package mod1.day16;

public class ClassesAndObjects20 {
	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.met();
		obj.met2();
		obj.met1();
	}
}
/*
 * Abstract Classes
 * 1. When ever you have a classification, the classifier class will be abstract class
 * 2. Wherever you find common noun, then that is a classifier class
 * 3. We declare common nouns as abstract classes, because we cannot create objects for abstract classes
 * 4. Abstract classes can have abstract methods as well as non abstract methods
 * 5. Non Abstract methods will be always declared as final 
*/
abstract class GrandSuperClass{
	public abstract void met1();
}
abstract class SuperClass extends GrandSuperClass{//when an abstract class extends another abstract class, no need to override the abstract method
	public SuperClass() {
		System.out.println("abstract class cons called...");
	}
	public void met() {System.out.println("met method of abstract called...");}
	public abstract void met2();
	//there is no compulsion for the abstract class to have abstract methods
	//but if there is a abstract method, then it is compulsory that the class should be declared as
	//abstract
}

class SubClass extends SuperClass{
	public SubClass() {
		System.out.println("subclass cons called...");
	}
	@Override
	public void met2() {
		System.out.println("met 2 method called...");
	}
	public void met1() {
		
	}
}