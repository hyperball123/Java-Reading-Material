package hit.day17;
//abstract class can have constructors
public class GeneralizationDemo7 {
	public static void main(String[] args) {
		//A obj=new A();//you cannot create the object of abstract class
		//but you still can have a constructor
		//the constructor is called when you instantiate the child object
		
		A obj=new B(12);
	}
}

abstract class A{
	int n=100;
//	public A() {
//		System.out.println("class A cons called...");
//	}
	public A(int i) {
		System.out.println("class A overloaded constructor called...");
	}
	 public void met() {
		System.out.println("met of super called..");
	}
}

class B extends A{
	public B(int n) {
		/*
		 * super key word can be used to refer super class variable,super class constructor and super class method
		 */		
		super(n);//***** constructor call using super keyword should be the first line in the constructor
		super.met();
		System.out.println(super.n);
		met();
		System.out.println("class B Cons called...."+n);
	}
	public void met() {
		System.out.println("met of B called...");
	}
}
