package mod1.day14;
/*
 * 'final'
 * its a keyword which is used to declare constants
 * - final variables - values cannot be changed.
 * - final methods - cannot be overriden
 * - final classes - cannot be inherited
 * 
 * Overriding rules
 * 
 * 1. The method signature should not be changed (viz, the parameters and return type) of
 * the overriden method cannot be changed
 * 
 * 2. Visibility cannot be reduced but it can be increased
 */
public class ClassesAndObject14 {
	public static void main(String[] args) {
		final float pi=3.14f;
		
		//pi=3.45f;
		
		Lion lion=new Lion();
		lion.hunting();//re-usability - code reusability
		
	}
}

// parent child or inheritance...
class Animal{
	final public void hunting() {
		System.out.println("hunting ...of animal..called...");
	}
	 void met() {
		
	}
}

class Lion extends Animal{
//	public void hunting() {
//		System.out.println("hunting of lion called..............");
//	}
	
	public void met() {
		
	}
}