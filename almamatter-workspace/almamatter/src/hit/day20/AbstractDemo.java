package hit.day20;

public class AbstractDemo {
	public static void main(String[] args) {
		//SuperClass obj=new SuperClass(); - not possible
		SuperClass obj=new SubClass();
		obj.met();
		obj.metBusiness();
		
		SuperClass obj2=new SubClass2();
		obj2.met();
		obj2.metBusiness();
	}
}
/*
 * When you declare the super class abstract ?
 * 1. When you don't want or restrict creating an object of the super class
 * Note: In real life, we never see the object of super class.
 * 
 * 2. When you want abstract methods, the class should be declared as abstract.
 * Note: The abstract methods will be without body and, it is compulsory for the subclass to override the method
 * 
 * Note: When you have non abstract methods, the method should be declared final, so that it is not overriden
 */

abstract class SuperClass{
//	public SuperClass() {
//		System.out.println("abstract super class cons called..");
//	}
	public SuperClass(int i) {//this constructor has to be explicitly called..
		System.out.println("abstract overloaded with int - constructor called...");
	}
	public abstract void met();
	final public void metBusiness() {
		System.out.println("met business is common to all the sub classes...................");
	}
}

class SubClass extends SuperClass{
	public SubClass() {
		super(10);
		System.out.println("sub class cons called...");
	}
	public void met() {
		System.out.println("sub class logic of met.....");
	}
}
class SubClass2 extends SuperClass{
	public SubClass2() {
		super(10);//this should be the first line
		System.out.println("sub class cons called...");
	}
	public void met() {
		System.out.println("sub class2 logic of met called....");
	}

}