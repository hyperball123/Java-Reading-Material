package mod1.rev.day3;
/*
 * abstract class and interface
 */
public class JavaRevision {
	public static void main(String[] args) {
		SuperClass sc=new SubClass();
		sc.met();
	}
}


abstract class SuperClass{
	public SuperClass() {
		System.out.println("super class cons called...");
	}
	final public void met() {
		System.out.println("parent met");
	}
	public abstract void met2();
}
class SubClass extends SuperClass{
	public SubClass() {
		System.out.println("sub class cons called...");
	}
//	public void met() {
//		System.out.println("child met");
//	}
	@Override
	public void met2() {
		// TODO Auto-generated method stub
		
	}
}

